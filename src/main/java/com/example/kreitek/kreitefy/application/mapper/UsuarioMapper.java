package com.example.kreitek.kreitefy.application.mapper;

import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.domain.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring", uses = {ValoracionCancionMapper.class, ReproduccionCancionesMapper.class})
public interface UsuarioMapper extends EntityMapper<UsuarioDto, Usuario>{

   @Override
    @Mapping(source = "valoracionesDeCanciones", target = "valoracionesDeCanciones")
    UsuarioDto toDto(Usuario entity);

    @Override
    @Mapping(source = "valoracionesDeCanciones", target = "valoracionesDeCanciones")
    Usuario toEntity(UsuarioDto dto);
    @Override
    @Mapping(source = "valoracionesDeCanciones", target = "valoracionesDeCanciones")
    List<Usuario> toEntity(List<UsuarioDto> dtoList);

    @Override
    @Mapping(source = "valoracionesDeCanciones", target = "valoracionesDeCanciones")
    List<UsuarioDto> toDto(List<Usuario> entityList);

    default Usuario fromId(String nombreDeUsuario) {
        if (nombreDeUsuario == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setNombreDeUsuario(nombreDeUsuario);
        return usuario;
    }

}
