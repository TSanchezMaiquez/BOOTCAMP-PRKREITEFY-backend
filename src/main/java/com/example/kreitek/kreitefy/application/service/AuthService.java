package com.example.kreitek.kreitefy.application.service;



import com.example.kreitek.kreitefy.application.dto.UsuarioDto;

import java.util.Optional;

public interface AuthService {
    public UsuarioDto register(UsuarioDto userDto);
    Optional<UsuarioDto> getUser(String username);
}
