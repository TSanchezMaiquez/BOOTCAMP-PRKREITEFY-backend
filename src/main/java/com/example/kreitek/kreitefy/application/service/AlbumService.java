package com.example.kreitek.kreitefy.application.service;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    List<AlbumDto> obtenerTodosLosAlbum();
    Optional<AlbumDto> obtenerAlbumPorId(Long id);
    List<AlbumDto> obtenerTodosLosAlbumPorNombre(String tituloParcial);
    AlbumDto guardarAlbum(AlbumDto albumDto);
}
