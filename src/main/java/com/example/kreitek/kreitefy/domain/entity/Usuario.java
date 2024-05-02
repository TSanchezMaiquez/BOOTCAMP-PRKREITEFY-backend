package com.example.kreitek.kreitefy.domain.entity;

import com.example.kreitek.kreitefy.domain.type.Role;
import jakarta.persistence.*;

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
}
