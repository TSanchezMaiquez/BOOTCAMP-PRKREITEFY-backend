package com.example.kreitek.kreitefy.application.service;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    List<AlbumDto> obtenerTodosLosAlbum();
    List<AlbumDto> obtenerTodosLosAlbumDeUnArtista(Long autorId);
    Optional<AlbumDto> obtenerAlbumPorId(Long id);
    List<AlbumDto> obtenerTodosLosAlbumPorNombre(String tituloParcial);
}
