package com.example.kreitek.kreitefy.domain.persistencia;

import com.example.kreitek.kreitefy.domain.entity.Cancion;
import com.example.kreitek.kreitefy.domain.entity.ReproduccionCancion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReproduccionCancionPersistence {
    Page<ReproduccionCancion> findAll(Pageable pageable, String filter);
}
