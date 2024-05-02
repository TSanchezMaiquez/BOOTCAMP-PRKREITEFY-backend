package com.example.kreitek.kreitefy.application.dto;

import com.example.kreitek.kreitefy.domain.entity.Role;

public class UsuarioDto {


    private String nombreDeUsuario;
    private String password;
    private String apellidos;
    private String email;
    protected Role role;
    public UsuarioDto() {
    }

    public UsuarioDto(String nombreDeUsuario, String password, String apellidos, String email) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.password = password;
        this.apellidos = apellidos;
        this.email = email;
    }

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
