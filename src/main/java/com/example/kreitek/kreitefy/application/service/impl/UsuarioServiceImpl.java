package com.example.kreitek.kreitefy.application.service.impl;

import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.application.mapper.UsuarioMapper;
import com.example.kreitek.kreitefy.application.service.UsuarioService;
import com.example.kreitek.kreitefy.domain.entity.Usuario;
import com.example.kreitek.kreitefy.domain.persistencia.UsuarioPersistence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


}
