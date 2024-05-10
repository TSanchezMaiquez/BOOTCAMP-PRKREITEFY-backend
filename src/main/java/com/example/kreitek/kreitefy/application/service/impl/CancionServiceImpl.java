package com.example.kreitek.kreitefy.application.service.impl;

import com.example.kreitek.kreitefy.application.dto.CancionDto;
import com.example.kreitek.kreitefy.application.mapper.CancionMapper;
import com.example.kreitek.kreitefy.application.service.CancionService;
import com.example.kreitek.kreitefy.domain.entity.Cancion;
import com.example.kreitek.kreitefy.domain.persistencia.CancionPersistence;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CancionServiceImpl implements CancionService {
    private final CancionPersistence cancionPersistence;
    private final CancionMapper cancionMapper;

    public CancionServiceImpl(CancionPersistence cancionPersistence, CancionMapper cancionMapper) {
        this.cancionPersistence = cancionPersistence;
        this.cancionMapper = cancionMapper;
    }


    @Override
    @Transactional(readOnly = true)
    public List<CancionDto> obtenerTodasLasCancionesDeUnAlbum(Long albumId) {
        return cancionMapper.toDto(cancionPersistence.obtenerTodasLasCancionesDeUnAlbum(albumId));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CancionDto> obtenerCancionPorId(Long id) {
        return cancionPersistence.obtenerCancionPorId(id).map(cancionMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<CancionDto> getICancionesByCriteriaStringPaged(Pageable pageable, String filter) {
        Page<Cancion> cancionPage = cancionPersistence.findAll(pageable, filter);
        return  cancionPage.map(cancionMapper::toDto);
    }

    @Override
    public CancionDto actualizarCancion(CancionDto cancionDto) {
        return cancionMapper.toDto(cancionPersistence.actualizarCancion(cancionMapper.toEntity(cancionDto)));
    }
}
