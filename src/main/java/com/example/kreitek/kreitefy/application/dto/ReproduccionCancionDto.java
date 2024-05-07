package com.example.kreitek.kreitefy.application.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ReproduccionCancionDto implements Serializable {

    private String usuarioId;
    private Long cancionId;
    private String cancionNombre;

    private Integer reproducciones;
    private Date fechaDeReproduccion;

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getCancionId() {
        return cancionId;
    }

    public void setCancionId(Long cancionId) {
        this.cancionId = cancionId;
    }

    public String getCancionNombre() {
        return cancionNombre;
    }

    public void setCancionNombre(String cancionNombre) {
        this.cancionNombre = cancionNombre;
    }

    public Integer getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(Integer reproducciones) {
        this.reproducciones = reproducciones;
    }

    public Date getFechaDeReproduccion() {
        return fechaDeReproduccion;
    }

    public void setFechaDeReproduccion(Date fechaDeReproduccion) {
        this.fechaDeReproduccion = fechaDeReproduccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReproduccionCancionDto that)) return false;
        return Objects.equals(usuarioId, that.usuarioId) && Objects.equals(cancionId, that.cancionId) && Objects.equals(cancionNombre, that.cancionNombre) && Objects.equals(reproducciones, that.reproducciones) && Objects.equals(fechaDeReproduccion, that.fechaDeReproduccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioId, cancionId, cancionNombre, reproducciones, fechaDeReproduccion);
    }

    @Override
    public String toString() {
        return "ReproduccionCancionDto{" +
                "usuarioId='" + usuarioId + '\'' +
                ", cancionId=" + cancionId +
                ", cancionNombre='" + cancionNombre + '\'' +
                ", reproducciones=" + reproducciones +
                ", fechaReproduccion=" + fechaDeReproduccion +
                '}';
    }
}
