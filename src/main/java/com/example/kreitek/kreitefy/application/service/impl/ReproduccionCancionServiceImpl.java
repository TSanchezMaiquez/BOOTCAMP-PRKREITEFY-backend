package com.example.kreitek.kreitefy.application.service.impl;

import com.example.kreitek.kreitefy.application.dto.ReproduccionCancionDto;
import com.example.kreitek.kreitefy.application.service.ReproduccionCancionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReproduccionCancionServiceImpl implements ReproduccionCancionService {
    @Override
    @Transactional
    public Page<ReproduccionCancionDto> getICancionesByCriteriaStringPaged(Pageable pageable, String filter) {
        return null;
    }
}
