package com.example.kreitek.kreitefy.application.dto;


import java.io.Serializable;

public class ArtistaDto implements Serializable {

    private Integer id;
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
