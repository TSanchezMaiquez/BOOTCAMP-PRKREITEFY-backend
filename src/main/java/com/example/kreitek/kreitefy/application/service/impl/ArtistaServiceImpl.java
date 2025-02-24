package com.example.kreitek.kreitefy.application.service.impl;

import com.example.kreitek.kreitefy.application.dto.ArtistaDto;
import com.example.kreitek.kreitefy.application.mapper.ArtistaMapper;
import com.example.kreitek.kreitefy.application.service.ArtistaService;
import com.example.kreitek.kreitefy.domain.entity.Artista;
import com.example.kreitek.kreitefy.domain.persistencia.ArtistaPersistence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaServiceImpl implements ArtistaService {

    private final ArtistaPersistence artistaPersistence;
    private final ArtistaMapper artistaMapper;

    public ArtistaServiceImpl(ArtistaPersistence artistaPersistence, ArtistaMapper artistaMapper) {
        this.artistaPersistence = artistaPersistence;
        this.artistaMapper = artistaMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ArtistaDto> obtenerTodosLosArtistas() {
        return artistaMapper.toDto(artistaPersistence.obtenerTodosLosArtistas());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ArtistaDto> obtenerArtistaPorId(Long artistaId) {
        return artistaPersistence.obtenerArtistaPorId(artistaId).map(artistaMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ArtistaDto> obtenerTodosLosArtistasPorNombre(String nombreParcial) {
        return artistaMapper.toDto(artistaPersistence.obtenerTodosLosArtistasPorNombre(nombreParcial));
    }

    @Override
    @Transactional
    public ArtistaDto crearArtista(ArtistaDto artistaDTO) {
        Artista artista = artistaMapper.toEntity(artistaDTO);
        return artistaMapper.toDto(artistaPersistence.crearArtista(artista));
    }
}
