package com.example.kreitek.kreitefy.domain.persistencia;


import com.example.kreitek.kreitefy.domain.entity.Usuario;

import java.util.Optional;

public interface UsuarioPersistence {
    Optional<Usuario> obtenerUsuarioPorId(String id);
    Usuario save(Usuario user);
    Optional<Usuario> find(String username);
}
