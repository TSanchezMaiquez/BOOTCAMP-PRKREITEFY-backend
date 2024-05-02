package com.example.kreitek.kreitefy.application.service;

import com.example.kreitek.kreitefy.application.dto.ArtistaDto;

import java.util.List;
import java.util.Optional;

public interface ArtistaService {
    List<ArtistaDto> obtenerTodosLosArtistas();
    Optional<ArtistaDto> obtenerArtistaPorId(Long artistaId);
    List<ArtistaDto> obtenerTodosLosArtistasPorNombre(String nombreParcial);
    ArtistaDto crearArtista(ArtistaDto categoryDTO);
}
