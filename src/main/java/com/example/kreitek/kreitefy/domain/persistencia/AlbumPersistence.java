package com.example.kreitek.kreitefy.domain.persistencia;


import com.example.kreitek.kreitefy.domain.entity.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumPersistence {
    List<Album> obtenerTodosLosAlbum();
    Optional<Album> obtenerAlbumPorId(Long id);
    List<Album> obtenerTodosLosAlbumPorNombre(String tituloParcial);

    Album crearAlbum(Album album);
}
