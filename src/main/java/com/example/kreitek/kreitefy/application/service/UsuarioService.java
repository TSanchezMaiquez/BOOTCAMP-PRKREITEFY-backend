package com.example.kreitek.kreitefy.application.service;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;
import com.example.kreitek.kreitefy.application.dto.UsuarioDto;

import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioDto> obtenerUsuarioPorId(String id);
}
