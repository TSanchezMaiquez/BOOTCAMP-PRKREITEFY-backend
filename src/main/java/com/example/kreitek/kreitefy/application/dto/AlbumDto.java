package com.example.kreitek.kreitefy.application.dto;

import com.example.kreitek.kreitefy.domain.entity.Artista;

import java.io.Serializable;

public class AlbumDto implements Serializable {

    private Long id;
    private String titulo;

    private byte[] imagen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
