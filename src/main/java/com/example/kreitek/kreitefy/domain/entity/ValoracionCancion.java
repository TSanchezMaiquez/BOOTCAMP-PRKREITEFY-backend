package com.example.kreitek.kreitefy.domain.entity;

import com.example.kreitek.kreitefy.domain.key.ValoracionesCancionesKey;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "valoraciones_canciones")
public class ValoracionCancion {
    @EmbeddedId
    private ValoracionesCancionesKey id;

    @ManyToOne
    @MapsId("usuarioId")
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @MapsId("cancionId")
    @JoinColumn(name = "cancion_id")
    private Cancion cancion;

    @Positive
    private Double valoracion;

    public ValoracionesCancionesKey getId() {
        return id;
    }

    public void setId(ValoracionesCancionesKey id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }
}
