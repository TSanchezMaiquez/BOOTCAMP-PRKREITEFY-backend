package com.example.kreitek.kreitefy.application.service.impl;

import com.example.kreitek.kreitefy.application.dto.ReproduccionCancionDto;
import com.example.kreitek.kreitefy.application.mapper.ReproduccionCancionesMapper;
import com.example.kreitek.kreitefy.application.service.ReproduccionCancionService;
import com.example.kreitek.kreitefy.domain.entity.ReproduccionCancion;
import com.example.kreitek.kreitefy.domain.persistencia.ReproduccionCancionPersistence;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReproduccionCancionServiceImpl implements ReproduccionCancionService {

    private final ReproduccionCancionPersistence reproduccionCancionPersistence;
    private final ReproduccionCancionesMapper reproduccionCancionesMapper;

    public ReproduccionCancionServiceImpl(ReproduccionCancionPersistence reproduccionCancionPersistence, ReproduccionCancionesMapper reproduccionCancionesMapper) {
        this.reproduccionCancionPersistence = reproduccionCancionPersistence;
        this.reproduccionCancionesMapper = reproduccionCancionesMapper;
    }

    @Override
    @Transactional
    public Page<ReproduccionCancionDto> getICancionesByCriteriaStringPaged(Pageable pageable, String filter) {
        Page<ReproduccionCancion> cancionPage = reproduccionCancionPersistence.findAll(pageable, filter);
        return  cancionPage.map(reproduccionCancionesMapper::toDto);
    }
}
