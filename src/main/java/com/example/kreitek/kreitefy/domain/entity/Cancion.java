package com.example.kreitek.kreitefy.domain.entity;

import com.example.kreitek.kreitefy.domain.type.Estilo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

import java.util.Date;

@Entity
@Table(name = "canciones")
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false)
    @Positive
    private Double duracion;
    @Enumerated(EnumType.STRING)
    private Estilo estilo;
    @Column(nullable = false)
    @Positive
    private Double valoracion;
    @Column(nullable = false)
    @Positive
    private Double reproducciones;
    @Column(name = "fecha_insercion", nullable = false)
    private Date fechaInsercion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "album_id")
    private Album album;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artista_id")
    private Artista artista;
    private String artistaNombre;
    private String albumTitulo;
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
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

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getArtistaNombre() {
        return artistaNombre;
    }
    public void setArtistaNombre(String artistaNombre) {
        this.artistaNombre = artistaNombre;
    }

    public String getAlbumTitulo() {
        return albumTitulo;
    }

    public void setAlbumTitulo(String albumTitulo) {
        this.albumTitulo = albumTitulo;
    }
}
