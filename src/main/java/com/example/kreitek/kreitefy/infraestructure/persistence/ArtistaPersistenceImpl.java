package com.example.kreitek.kreitefy.infraestructure.persistence;

import com.example.kreitek.kreitefy.domain.entity.Artista;
import com.example.kreitek.kreitefy.domain.persistencia.ArtistaPersistence;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArtistaPersistenceImpl implements ArtistaPersistence {

    private final ArtistaRepository artistaRepository;

    public ArtistaPersistenceImpl(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    @Override
    public List<Artista> obtenerTodosLosArtistas() {
        return artistaRepository.findAll();
    }

    @Override
    public Optional<Artista> obtenerArtistaPorId(Long artistaId) {
        return artistaRepository.findById(artistaId);
    }

    @Override
    public List<Artista> obtenerTodosLosArtistasPorNombre(String nombreParcial) {
        return artistaRepository.findByNombreContainsIgnoreCase(nombreParcial);
    }

    @Override
    public Artista crearArtista(Artista artista) {
        return artistaRepository.save(artista);
    }
}
