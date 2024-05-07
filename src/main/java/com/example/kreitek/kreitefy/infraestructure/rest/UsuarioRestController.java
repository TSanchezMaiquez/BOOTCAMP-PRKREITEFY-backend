package com.example.kreitek.kreitefy.infraestructure.rest;

import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.application.dto.ValoracionCancionDto;
import com.example.kreitek.kreitefy.application.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioRestController {

    private final UsuarioService usuarioService;

    public UsuarioRestController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping(value = "/usuarios/{usuarioId}", produces = "application/json")
    public ResponseEntity<UsuarioDto> getItemById(@PathVariable String usuarioId) {
        Optional<UsuarioDto> usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        if (usuario.isPresent()) {
            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

   @PutMapping(value = "/usuarios/{username}/canciones", produces = "application/json", consumes = "application/json")
    public ResponseEntity<List<ValoracionCancionDto>> anadeValoracionACancion(
            @PathVariable String username,
            @RequestBody ValoracionCancionDto valoracionCancionDto){
        List<ValoracionCancionDto> valoracionCancionDtos = usuarioService
                .anadeValoracionACancion(username, valoracionCancionDto);
        return new ResponseEntity<>(valoracionCancionDtos,HttpStatus.OK);
    }
    @GetMapping(value = "/usuarios/{username}/canciones", produces = "application/json")
    public ResponseEntity<List<ValoracionCancionDto>> obtenerValoracionesDeUsuario
            (@PathVariable String username){
        List<ValoracionCancionDto> valoracionCancionDtos = usuarioService
                .obtenervaloracionesCanciones(username);
        return new ResponseEntity<>(valoracionCancionDtos, HttpStatus.OK);
    }
}
