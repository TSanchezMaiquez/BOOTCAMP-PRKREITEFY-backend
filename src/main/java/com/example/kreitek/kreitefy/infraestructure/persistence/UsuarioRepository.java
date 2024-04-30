package com.example.kreitek.kreitefy.infraestructure.persistence;


import com.example.kreitek.kreitefy.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
