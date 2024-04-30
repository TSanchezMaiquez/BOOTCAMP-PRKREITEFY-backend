package com.example.kreitek.kreitefy.application.mapper;

import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.domain.entity.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper extends EntityMapper<UsuarioDto, Usuario>{
    default Usuario fromId(String nombreDeUsuario) {
        if (nombreDeUsuario == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setNombreDeUsuario(nombreDeUsuario);
        return usuario;
    }
}
