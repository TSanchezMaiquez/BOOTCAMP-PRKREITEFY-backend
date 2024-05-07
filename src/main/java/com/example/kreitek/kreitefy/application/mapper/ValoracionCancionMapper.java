package com.example.kreitek.kreitefy.application.mapper;

import com.example.kreitek.kreitefy.application.dto.ValoracionCancionDto;
import com.example.kreitek.kreitefy.domain.entity.ValoracionCancion;
import com.example.kreitek.kreitefy.domain.key.ValoracionesCancionesKey;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UsuarioMapper.class, CancionMapper.class})
public interface ValoracionCancionMapper extends EntityMapper<ValoracionCancionDto, ValoracionCancion> {
    @Override
    @Mapping(source = "usuarioId", target = "id.usuarioId")
    @Mapping(source = "usuarioId", target = "usuario")
    @Mapping(source = "cancionId", target = "id.cancionId")
    @Mapping(source = "cancionId", target = "cancion")
    ValoracionCancion toEntity(ValoracionCancionDto dto);

    @Override
    @Mapping(source = "usuario.nombreDeUsuario", target = "usuarioId")
    @Mapping(source = "cancion.id", target = "cancionId")
    @Mapping(source = "cancion.nombre", target = "cancionNombre")
    ValoracionCancionDto toDto(ValoracionCancion entity);


    default ValoracionCancion fromId(ValoracionesCancionesKey id) {
        if (id == null) return null;
        ValoracionCancion valoracionCancion = new ValoracionCancion();
        valoracionCancion.setId(id);
        return valoracionCancion;
    }

}
