package com.example.kreitek.kreitefy.domain.persistencia;


import com.example.kreitek.kreitefy.domain.entity.Cancion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CancionPersistence {
    List<Cancion> obtenerTodasLasCanciones();
    List<Cancion> obtenerTodasLasCancionesDeUnAlbum(Long albumId);
    Optional<Cancion> obtenerCancionPorId(Long id);
    List<Cancion> obtenerTodasLasCancionesPorNombre(String nombreParcial);
    Page<Cancion> findAll(Pageable pageable, String filter);

    Cancion actualizarCancion(Cancion cancion);
}
