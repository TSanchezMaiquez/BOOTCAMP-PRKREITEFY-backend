package com.example.kreitek.kreitefy.infraestructure.excepciones;

public class UsuarioNotFoundException extends Exception{
    public UsuarioNotFoundException(String message) {
        super(message);
    }
}
