package com.example.kreitek.kreitefy.application.service;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;
import com.example.kreitek.kreitefy.application.dto.ReproduccionCancionDto;
import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.application.dto.ValoracionCancionDto;
import com.example.kreitek.kreitefy.infraestructure.excepciones.UsuarioNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioDto> obtenerUsuarioPorId(String id);
    List<ValoracionCancionDto> anadeValoracionACancion(String usuarioId, ValoracionCancionDto valoracionCancionDto);
    List<ValoracionCancionDto> obtenervaloracionesCanciones(String username) throws UsuarioNotFoundException;
    List<ReproduccionCancionDto>anadeReproduccionACancion(String username, ReproduccionCancionDto reproduccionCancionDto) throws UsuarioNotFoundException;
    List<ReproduccionCancionDto>obtenerReproduccionesCanciones(String username) throws UsuarioNotFoundException;

    UsuarioDto actualizarUsuario(UsuarioDto usuarioDto);

    Page<ReproduccionCancionDto> obtenerReproduccionesCancionesByCriteriaStringPaged(Pageable pageable, String filter);
}
