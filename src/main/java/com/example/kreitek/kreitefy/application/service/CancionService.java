package com.example.kreitek.kreitefy.application.service;

import com.example.kreitek.kreitefy.application.dto.CancionDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CancionService {
    List<CancionDto> obtenerTodasLasCancionesDeUnAlbum(Long albumId);
    Optional<CancionDto> obtenerCancionPorId(Long id);
    Page<CancionDto> getICancionesByCriteriaStringPaged(Pageable pageable, String filter);

    CancionDto actualizarCancion(CancionDto cancionDto);
}
