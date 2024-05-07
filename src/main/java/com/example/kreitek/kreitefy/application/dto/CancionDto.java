package com.example.kreitek.kreitefy.application.dto;

import com.example.kreitek.kreitefy.domain.entity.Album;
import com.example.kreitek.kreitefy.domain.type.Estilo;


import java.io.Serializable;
import java.util.Date;

public class CancionDto implements Serializable {
    private Long id;
    private String nombre;
    private Double duracion;
    private Estilo estilo;
    private Double valoracion;
    private Double reproducciones;
    private Date fechaInsercion;
    private Long albumId;
    private String albumTitulo;
    private Long artistaId;
    private String artistaNombre;
    private byte[] albumImagen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }

    public Double getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(Double reproducciones) {
        this.reproducciones = reproducciones;
    }

    public Date getFechaInsercion() {
        return fechaInsercion;
    }

    public void setFechaInsercion(Date fechaInsercion) {
        this.fechaInsercion = fechaInsercion;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitulo() {
        return albumTitulo;
    }

    public void setAlbumTitulo(String albumTitulo) {
        this.albumTitulo = albumTitulo;
    }

    public Long getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(Long artistaId) {
        this.artistaId = artistaId;
    }

    public String getArtistaNombre() {
        return artistaNombre;
    }

    public void setArtistaNombre(String artistaNombre) {
        this.artistaNombre = artistaNombre;
    }

    public byte[] getAlbumImagen() {
        return albumImagen;
    }

    public void setAlbumImagen(byte[] albumImagen) {
        this.albumImagen = albumImagen;
    }
}
