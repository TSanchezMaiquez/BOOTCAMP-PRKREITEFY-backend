package com.example.kreitek.kreitefy.application.mapper;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;
import com.example.kreitek.kreitefy.domain.entity.Album;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlbumMapper extends EntityMapper<AlbumDto, Album>{


    default Album fromId(Long id) {
        if (id == null) {
            return null;
        }
        Album album = new Album();
        album.setId(id);
        return album;
    }
}
