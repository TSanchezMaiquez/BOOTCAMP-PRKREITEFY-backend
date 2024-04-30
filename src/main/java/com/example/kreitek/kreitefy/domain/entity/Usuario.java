package com.example.kreitek.kreitefy.domain.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Usuario {

    @Id
    private String nombreDeUsuario;
    @Column(length =255, nullable = false)
    private String contraseña;
    @Column(length =100, nullable = false)
    private String apellidos;
    @Column(length =100, nullable = false)
    private String email;

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
