package com.example.kreitek.kreitefy.infraestructure.persistence;

import com.example.kreitek.kreitefy.domain.entity.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CancionRepository extends JpaRepository<Cancion, Long>, JpaSpecificationExecutor<Cancion> {
    List<Cancion> findByNombreContainsIgnoreCase(String partialName);
    List<Cancion> findAllByAlbumId(Long id);
}
