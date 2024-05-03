package com.example.kreitek.kreitefy.application.mapper;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;
import com.example.kreitek.kreitefy.application.dto.CancionDto;
import com.example.kreitek.kreitefy.domain.entity.Album;
import com.example.kreitek.kreitefy.domain.entity.Cancion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {AlbumMapper.class, ArtistaMapper.class})
public interface CancionMapper extends EntityMapper<CancionDto, Cancion>{

    @Override
    @Mapping(source = "albumId", target = "album")
    @Mapping(source = "artistaId", target = "artista")
    Cancion toEntity(CancionDto dto);

    @Override
    @Mapping(source = "album.id", target = "albumId")
    @Mapping(source = "album.titulo", target = "albumTitulo")
    @Mapping(source = "album.imagen", target = "albumImagen")
    @Mapping(source = "artista.id", target = "artistaId")
    @Mapping(source = "artista.nombre", target = "artistaNombre")
    CancionDto toDto(Cancion entity);

    default Cancion fromId(Long id) {
        if (id == null) {
            return null;
        }
        Cancion cancion = new Cancion();
        cancion.setId(id);
        return cancion;
    }
}
