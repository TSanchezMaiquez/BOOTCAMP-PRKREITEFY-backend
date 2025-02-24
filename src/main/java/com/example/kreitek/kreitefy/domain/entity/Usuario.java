package com.example.kreitek.kreitefy.domain.entity;

import com.example.kreitek.kreitefy.domain.type.Role;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Usuario {

    @Id
    private String nombreDeUsuario;
    @Column(length =255, nullable = false)
    private String password;
    @Column(length =100, nullable = false)
    private String apellidos;
    @Column(length =100, nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany( fetch = FetchType.EAGER,  mappedBy = "usuario", cascade = CascadeType.ALL)
    private Set<ValoracionCancion> valoracionesDeCanciones;

    @OneToMany( fetch = FetchType.EAGER,  mappedBy = "usuario", cascade = CascadeType.ALL)
    private Set<ReproduccionCancion> reproduccionesDeCanciones;
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<ValoracionCancion> getValoracionesDeCanciones() {
        return valoracionesDeCanciones;
    }

    public void setValoracionesDeCanciones(Set<ValoracionCancion> valoracionesDeCanciones) {
        this.valoracionesDeCanciones = valoracionesDeCanciones;
    }

    public Set<ReproduccionCancion> getReproduccionesDeCanciones() {
        return reproduccionesDeCanciones;
    }

    public void setReproduccionesDeCanciones(Set<ReproduccionCancion> reproduccionesDeCanciones) {
        this.reproduccionesDeCanciones = reproduccionesDeCanciones;
    }
}
