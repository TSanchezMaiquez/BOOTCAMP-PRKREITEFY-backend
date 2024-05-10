package com.example.kreitek.kreitefy.infraestructure.persistence;

import com.example.kreitek.kreitefy.domain.entity.Cancion;
import com.example.kreitek.kreitefy.domain.persistencia.CancionPersistence;
import com.example.kreitek.kreitefy.specs.CancionSpecification;
import com.example.kreitek.kreitefy.specs.shared.SearchCriteriaHelper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CancionPersistenceImpl implements CancionPersistence {
    private final CancionRepository cancionRepository;

    public CancionPersistenceImpl(CancionRepository cancionRepository) {
        this.cancionRepository = cancionRepository;
    }

    @Override
    public List<Cancion> obtenerTodasLasCanciones() {
        return cancionRepository.findAll();
    }

    @Override
    public List<Cancion> obtenerTodasLasCancionesDeUnAlbum(Long albumId) {
        return cancionRepository.findAllByAlbumId(albumId);
    }

    @Override
    public Optional<Cancion> obtenerCancionPorId(Long id) {
        return cancionRepository.findById(id);
    }

    @Override
    public List<Cancion> obtenerTodasLasCancionesPorNombre(String nombreParcial) {
        return cancionRepository.findByNombreContainsIgnoreCase(nombreParcial);
    }

    @Override
    public Page<Cancion> findAll(Pageable pageable, String filter) {
        CancionSpecification specification = new CancionSpecification(SearchCriteriaHelper.fromFilterString(filter));
        return cancionRepository.findAll(specification, pageable);
    }

    @Override
    public Cancion actualizarCancion(Cancion cancion) {
        return cancionRepository.save(cancion);
    }


}
