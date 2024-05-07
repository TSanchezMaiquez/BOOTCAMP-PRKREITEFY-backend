package com.example.kreitek.kreitefy.application.service.impl;

import com.example.kreitek.kreitefy.application.dto.ReproduccionCancionDto;
import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.application.dto.ValoracionCancionDto;
import com.example.kreitek.kreitefy.application.mapper.UsuarioMapper;
import com.example.kreitek.kreitefy.application.service.UsuarioService;
import com.example.kreitek.kreitefy.domain.entity.Usuario;
import com.example.kreitek.kreitefy.domain.persistencia.UsuarioPersistence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioPersistence usuarioPersistence;
    private final UsuarioMapper usuarioMapper;

    public UsuarioServiceImpl(UsuarioPersistence usuarioPersistence, UsuarioMapper usuarioMapper) {
        this.usuarioPersistence = usuarioPersistence;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    @Transactional
    public Optional<UsuarioDto> obtenerUsuarioPorId(String id) {
        return usuarioPersistence.obtenerUsuarioPorId(id).map(usuarioMapper::toDto);
    }

    @Override
    @Transactional
    public List<ValoracionCancionDto> anadeValoracionACancion(String usuarioId, ValoracionCancionDto valoracionCancionDto) {
        UsuarioDto usuarioDto = obtenerUsuarioPorId(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        List<ValoracionCancionDto> valoraciones = usuarioDto.getValoracionesDeCanciones();
        manejarValoracionExistente(valoraciones, usuarioId, valoracionCancionDto);


        Usuario usuario = usuarioPersistence.save(usuarioMapper.toEntity(usuarioDto));
        usuarioDto = usuarioMapper.toDto(usuario);

        return usuarioDto.getValoracionesDeCanciones();
    }

    private void manejarValoracionExistente(List<ValoracionCancionDto> valoraciones, String usuarioId, ValoracionCancionDto nuevaValoracion) {
        Optional<ValoracionCancionDto> existingValoracion = valoraciones.stream()
                .filter(v -> v.getCancionId().equals(nuevaValoracion.getCancionId()))
                .findFirst();

        if (existingValoracion.isPresent()) {
            actualizarValoracionExistente(existingValoracion.get(), nuevaValoracion);
        } else {
            agregarNuevaValoracion(valoraciones, usuarioId, nuevaValoracion);
        }
    }

    private void actualizarValoracionExistente(ValoracionCancionDto valoracionExistente, ValoracionCancionDto nuevaValoracion) {
        valoracionExistente.setValoracion(nuevaValoracion.getValoracion());
    }

    private void agregarNuevaValoracion(List<ValoracionCancionDto> valoraciones, String usuarioId, ValoracionCancionDto nuevaValoracion) {
        nuevaValoracion.setUsuarioId(usuarioId);
        valoraciones.add(nuevaValoracion);
    }

    @Override
    @Transactional
    public List<ValoracionCancionDto> obtenervaloracionesCanciones(String username) {
        UsuarioDto usuarioDto = obtenerUsuarioPorId(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return usuarioDto.getValoracionesDeCanciones();
    }

    @Override
    public List<ReproduccionCancionDto> anadeReproduccionACancion(String username, ReproduccionCancionDto reproduccionCancionDto) {
        UsuarioDto usuarioDto = obtenerUsuarioPorId(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        reproduccionCancionDto.setUsuarioId(username);
        usuarioDto.getReproduccionesDeCanciones().add(reproduccionCancionDto);
        Usuario usuario = usuarioPersistence.save(usuarioMapper.toEntity(usuarioDto));
        usuarioDto = usuarioMapper.toDto(usuario);
        return usuarioDto.getReproduccionesDeCanciones();
    }

    @Override
    public List<ReproduccionCancionDto> obtenerReproduccionesCanciones(String username) {
        UsuarioDto usuarioDto = obtenerUsuarioPorId(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return usuarioDto.getReproduccionesDeCanciones();
    }


}
