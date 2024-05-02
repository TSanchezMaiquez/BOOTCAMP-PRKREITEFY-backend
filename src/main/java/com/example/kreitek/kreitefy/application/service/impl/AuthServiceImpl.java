package com.example.kreitek.kreitefy.application.service.impl;


import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.application.mapper.UsuarioMapper;
import com.example.kreitek.kreitefy.application.service.AuthService;
import com.example.kreitek.kreitefy.domain.entity.Usuario;
import com.example.kreitek.kreitefy.domain.persistencia.UsuarioPersistence;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {
    private final UsuarioPersistence userPersistence;
    private final UsuarioMapper userMapper;

    public AuthServiceImpl(UsuarioPersistence userPersistence, UsuarioMapper userMapper) {
        this.userPersistence = userPersistence;
        this.userMapper = userMapper;
    }

    public UsuarioDto register(UsuarioDto userDto) {
        Usuario user = userMapper.toEntity(userDto);
        return userMapper.toDto(userPersistence.save(user));
    }

    @Override public Optional<UsuarioDto> getUser(String username) {
        Optional<Usuario> user = userPersistence.find(username);
        if (user.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(userMapper.toDto(user.get()));
    }
}
