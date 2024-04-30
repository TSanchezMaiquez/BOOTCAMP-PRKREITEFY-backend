package com.example.kreitek.kreitefy.application.mapper;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;
import com.example.kreitek.kreitefy.domain.entity.Album;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ArtistaMapper.class)
public interface AlbumMapper extends EntityMapper<AlbumDto, Album>{
    @Override
    @Mapping(source = "artistaId", target = "artista")
    Album toEntity(AlbumDto dto);

    @Override
    @Mapping(source = "artista.id", target = "artistaId")
    @Mapping(source = "artista.nombre", target = "artistaNombre")
    AlbumDto toDto(Album entity);

    default Album fromId(Long id) {
        if (id == null) {
            return null;
        }
        Album album = new Album();
        album.setId(id);
        return album;
    }
}
