package com.example.kreitek.kreitefy.application.mapper;

import com.example.kreitek.kreitefy.application.dto.ArtistaDto;
import com.example.kreitek.kreitefy.domain.entity.Artista;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArtistaMapper extends EntityMapper<ArtistaDto, Artista>{

    default Artista fromId(Long id) {
        if (id == null) {
            return null;
        }
        Artista artista = new Artista();
        artista.setId(id);
        return artista;
    }
}
