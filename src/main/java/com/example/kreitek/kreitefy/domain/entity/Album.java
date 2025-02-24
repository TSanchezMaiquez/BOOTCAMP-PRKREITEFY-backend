package com.example.kreitek.kreitefy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "albumes")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titulo", nullable = false, length = 255)
    private String titulo;


    @Lob
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

