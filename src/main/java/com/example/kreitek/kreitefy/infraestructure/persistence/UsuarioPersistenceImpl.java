package com.example.kreitek.kreitefy.infraestructure.persistence;

import com.example.kreitek.kreitefy.domain.entity.Usuario;
import com.example.kreitek.kreitefy.domain.persistencia.UsuarioPersistence;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsuarioPersistenceImpl implements UsuarioPersistence {
    private final UsuarioRepository usuarioRepository;

    public UsuarioPersistenceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorId(String id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario save(Usuario user) {
        return usuarioRepository.save(user);
    }

    @Override
    public Optional<Usuario> find(String username) {
        return usuarioRepository.findById(username);
    }
}
