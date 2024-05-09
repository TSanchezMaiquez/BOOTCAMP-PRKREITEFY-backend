package com.example.kreitek.kreitefy.application.service;

import com.example.kreitek.kreitefy.application.dto.ReproduccionCancionDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReproduccionCancionService {
    Page<ReproduccionCancionDto> getICancionesByCriteriaStringPaged(Pageable pageable, String filter);
}
