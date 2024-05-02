package com.example.kreitek.kreitefy.application.dto;

public class LoginDto {
    private String nombreDeUsuario;
    private String password;

    public LoginDto() {
    }

    public LoginDto(String nombreDeUsuario, String password) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.password = password;
    }

    public String getUsername() {
        return nombreDeUsuario;
    }

    public void setUsername(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
