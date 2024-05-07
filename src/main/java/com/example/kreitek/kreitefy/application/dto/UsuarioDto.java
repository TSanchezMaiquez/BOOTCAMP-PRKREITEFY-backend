package com.example.kreitek.kreitefy.application.dto;

import com.example.kreitek.kreitefy.domain.type.Role;

import java.util.List;

public class UsuarioDto {


    private String nombreDeUsuario;
    private String password;
    private String apellidos;
    private String email;
    protected Role role;
    private List<ValoracionCancionDto> valoracionesDeCanciones;
    public UsuarioDto() {
    }

    public UsuarioDto(String nombreDeUsuario, String password, String apellidos, String email, Role rol) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.password = password;
        this.apellidos = apellidos;
        this.email = email;
        this.role = rol;
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

   public List<ValoracionCancionDto> getValoracionesDeCanciones() {
        return valoracionesDeCanciones;
    }

    public void setValoracionesDeCanciones(List<ValoracionCancionDto> valoracionesDeCanciones) {
        this.valoracionesDeCanciones = valoracionesDeCanciones;
    }
}
