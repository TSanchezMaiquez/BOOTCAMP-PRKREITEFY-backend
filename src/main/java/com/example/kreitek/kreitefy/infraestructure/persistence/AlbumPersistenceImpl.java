package com.example.kreitek.kreitefy.infraestructure.persistence;

import com.example.kreitek.kreitefy.domain.entity.Album;
import com.example.kreitek.kreitefy.domain.persistencia.AlbumPersistence;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlbumPersistenceImpl implements AlbumPersistence {
    private final AlbumRepository albumRepository;

    public AlbumPersistenceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> obtenerTodosLosAlbum() {
        return albumRepository.findAll();
    }

    @Override
    public Optional<Album> obtenerAlbumPorId(Long id) {
        return albumRepository.findById(id);
    }

    @Override
    public List<Album> obtenerTodosLosAlbumPorNombre(String tituloParcial) {
        return albumRepository.findBytituloContainsIgnoreCase(tituloParcial);
    }

    @Override
    public Album crearAlbum(Album album) {
        return albumRepository.save(album);
    }
}
