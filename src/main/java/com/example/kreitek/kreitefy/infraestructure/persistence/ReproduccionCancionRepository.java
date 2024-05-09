package com.example.kreitek.kreitefy.infraestructure.persistence;

import com.example.kreitek.kreitefy.domain.entity.ReproduccionCancion;
import com.example.kreitek.kreitefy.domain.key.ReproducionesCancionesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ReproduccionCancionRepository extends JpaRepository<ReproduccionCancion, ReproducionesCancionesKey>, JpaSpecificationExecutor<ReproduccionCancion> {

}
