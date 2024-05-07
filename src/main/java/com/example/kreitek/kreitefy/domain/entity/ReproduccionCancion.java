package com.example.kreitek.kreitefy.domain.entity;

import com.example.kreitek.kreitefy.domain.key.ReproducionesCancionesKey;
import com.example.kreitek.kreitefy.domain.key.UsuariosCancionesKey;
import jakarta.persistence.*;

import java.util.Date;


@Entity
    @Table(name = "reproduccion_canciones")
    public class ReproduccionCancion {
        @EmbeddedId
        private ReproducionesCancionesKey id;

        @ManyToOne
        @MapsId("usuarioId")
        @JoinColumn(name = "usuario_id")
        private Usuario usuario;

        @ManyToOne
        @MapsId("cancionId")
        @JoinColumn(name = "cancion_id")
        private Cancion cancion;

        private Integer reproducciones;


    public ReproducionesCancionesKey getId() {
        return id;
    }

    public void setId(ReproducionesCancionesKey id) {
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

    public Integer getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(Integer reproducciones) {
        this.reproducciones = reproducciones;
    }


}
