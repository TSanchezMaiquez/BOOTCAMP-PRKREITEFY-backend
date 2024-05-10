package com.example.kreitek.kreitefy.application.service.impl;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;
import com.example.kreitek.kreitefy.application.mapper.AlbumMapper;
import com.example.kreitek.kreitefy.application.service.AlbumService;
import com.example.kreitek.kreitefy.domain.persistencia.AlbumPersistence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final AlbumPersistence albumPersistence;
    private final AlbumMapper albumMapper;

    public AlbumServiceImpl(AlbumPersistence albumPersistence, AlbumMapper albumMapper) {
        this.albumPersistence = albumPersistence;
        this.albumMapper = albumMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<AlbumDto> obtenerTodosLosAlbum() {
        return albumMapper.toDto(albumPersistence.obtenerTodosLosAlbum());
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<AlbumDto> obtenerAlbumPorId(Long id) {
        return albumPersistence.obtenerAlbumPorId(id).map(albumMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AlbumDto> obtenerTodosLosAlbumPorNombre(String tituloParcial) {
        return albumMapper.toDto(albumPersistence.obtenerTodosLosAlbumPorNombre(tituloParcial));
    }

    @Override
    @Transactional
    public AlbumDto guardarAlbum(AlbumDto albumDto) {
        return albumMapper.toDto(albumPersistence.crearAlbum(albumMapper.toEntity(albumDto)));
    }
}
