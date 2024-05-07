package com.example.kreitek.kreitefy.application.service;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;
import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.application.dto.ValoracionCancionDto;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioDto> obtenerUsuarioPorId(String id);
    List<ValoracionCancionDto> anadeValoracionACancion(String usuarioId, ValoracionCancionDto valoracionCancionDto);
    List<ValoracionCancionDto> obtenervaloracionesCanciones(String username);

}
