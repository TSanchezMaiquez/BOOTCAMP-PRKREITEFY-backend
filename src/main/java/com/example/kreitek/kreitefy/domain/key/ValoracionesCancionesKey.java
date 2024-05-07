package com.example.kreitek.kreitefy.domain.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ValoracionesCancionesKey implements Serializable {

    @Column(name = "usuario_id")
    private String usuarioId;

    @Column(name = "cancion_id")
    private Long cancionId;

    public ValoracionesCancionesKey() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValoracionesCancionesKey that)) return false;
        return Objects.equals(usuarioId, that.usuarioId) && Objects.equals(cancionId, that.cancionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioId, cancionId);
    }
}
