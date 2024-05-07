package com.example.kreitek.kreitefy.application.mapper;

import com.example.kreitek.kreitefy.application.dto.ReproduccionCancionDto;
import com.example.kreitek.kreitefy.domain.entity.ReproduccionCancion;
import com.example.kreitek.kreitefy.domain.key.UsuariosCancionesKey;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UsuarioMapper.class, CancionMapper.class})
public interface ReproduccionCancionesMapper extends EntityMapper<ReproduccionCancionDto, ReproduccionCancion> {

    @Override
    @Mapping(source = "usuarioId", target = "id.usuarioId")
    @Mapping(source = "usuarioId", target = "usuario")
    @Mapping(source = "cancionId", target = "id.cancionId")
    @Mapping(source = "cancionId", target = "cancion")
    @Mapping(source = "fechaDeReproduccion", target = "fechaDeReproduccion")
    ReproduccionCancion toEntity(ReproduccionCancionDto dto);

    @Override
    @Mapping(source = "usuario.nombreDeUsuario", target = "usuarioId")
    @Mapping(source = "cancion.id", target = "cancionId")
    @Mapping(source = "cancion.nombre", target = "cancionNombre")
    @Mapping(source = "fechaDeReproduccion", target = "fechaDeReproduccion")
    ReproduccionCancionDto toDto(ReproduccionCancion entity);



  default ReproduccionCancion fromId(UsuariosCancionesKey id){
      if (id == null) return null;
      ReproduccionCancion reproduccionCancion = new ReproduccionCancion();
      reproduccionCancion.setId(id);
      return reproduccionCancion;

  }
}
