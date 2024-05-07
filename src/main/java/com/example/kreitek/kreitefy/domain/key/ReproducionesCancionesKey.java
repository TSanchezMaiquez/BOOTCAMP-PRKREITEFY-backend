package com.example.kreitek.kreitefy.domain.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
public class ReproducionesCancionesKey implements Serializable {
    @Column(name = "usuario_id")
    private String usuarioId;

    @Column(name = "cancion_id")
    private Long cancionId;
    @Column(name = "fecha_reproduccion")
    private Date fechaDeReproduccion;

    public ReproducionesCancionesKey() {
    }

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

    public Date getFechaDeReproduccion() {
        return fechaDeReproduccion;
    }

    public void setFechaDeReproduccion(Date fechaReproduccion) {
        this.fechaDeReproduccion = fechaReproduccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReproducionesCancionesKey that)) return false;
        return Objects.equals(usuarioId, that.usuarioId) && Objects.equals(cancionId, that.cancionId) && Objects.equals(fechaDeReproduccion, that.fechaDeReproduccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioId, cancionId, fechaDeReproduccion);
    }
}
