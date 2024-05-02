package com.example.kreitek.kreitefy.domain.persistencia;

import com.example.kreitek.kreitefy.domain.entity.Artista;

import java.util.List;
import java.util.Optional;

public interface ArtistaPersistence {
    List<Artista> obtenerTodosLosArtistas();
    Optional<Artista> obtenerArtistaPorId(Long artistaId);
    List<Artista> obtenerTodosLosArtistasPorNombre(String nombreParcial);
    Artista crearArtista(Artista artista);
}
