package com.example.kreitek.kreitefy.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class ValoracionCancionDto implements Serializable {

    private String usuarioId;
    private Long cancionId;
    private String cancionNombre;
    private Double valoracion;

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

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValoracionCancionDto that)) return false;
        return Objects.equals(usuarioId, that.usuarioId) && Objects.equals(cancionId, that.cancionId) && Objects.equals(cancionNombre, that.cancionNombre) && Objects.equals(valoracion, that.valoracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioId, cancionId, cancionNombre, valoracion);
    }

    @Override
    public String toString() {
        return "ValoracionCancionDto{" +
                "usuarioId='" + usuarioId + '\'' +
                ", cancionId=" + cancionId +
                ", cancionNombre='" + cancionNombre + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }
}
