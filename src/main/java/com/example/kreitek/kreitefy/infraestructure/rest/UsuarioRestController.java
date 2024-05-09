package com.example.kreitek.kreitefy.infraestructure.rest;

import com.example.kreitek.kreitefy.application.dto.ReproduccionCancionDto;
import com.example.kreitek.kreitefy.application.dto.UsuarioDto;
import com.example.kreitek.kreitefy.application.dto.ValoracionCancionDto;
import com.example.kreitek.kreitefy.application.service.UsuarioService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @PutMapping(value = "/usuarios/{username}/reproducciones", produces = "application/json", consumes = "application/json")
    public ResponseEntity<List<ReproduccionCancionDto>> anadeReproduccionACancion(
            @PathVariable String username,
            @RequestBody ReproduccionCancionDto reproduccionCancionDto){
        List<ReproduccionCancionDto> reproduccionCancionDtos = usuarioService
                .anadeReproduccionACancion(username, reproduccionCancionDto);
        return new ResponseEntity<>(reproduccionCancionDtos,HttpStatus.OK);
    }
    @GetMapping(value = "/usuarios/{username}/reproducciones", produces = "application/json")
    public ResponseEntity<List<ReproduccionCancionDto>> obtenerReproduccionesDeUsuario
            (@PathVariable String username){
        List<ReproduccionCancionDto> reproduccionCancionDtos = usuarioService
                .obtenerReproduccionesCanciones(username);
        return new ResponseEntity<>(reproduccionCancionDtos, HttpStatus.OK);
    }
    @PatchMapping(value = "/usuarios/{nombreDeUsuario}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<UsuarioDto> actualizarUsuario(@PathVariable String nombreDeUsuario, @RequestBody UsuarioDto usuarioDto) {
        usuarioDto = usuarioService.actualizarUsuario(usuarioDto);
        return new ResponseEntity<>(usuarioDto, HttpStatus.OK);
    }
    @GetMapping(value = "/usuarios/reproducciones", produces = "application/json")
    public ResponseEntity<Page<ReproduccionCancionDto>> obtenerReproduccionesDeUsuario
            (@RequestParam(value = "filter", required = false) String filter, Pageable pageable){
        Page<ReproduccionCancionDto> reproduccionCancionDtos = usuarioService
                .obtenerReproduccionesCancionesByCriteriaStringPaged(pageable, filter);
        return new ResponseEntity<Page<ReproduccionCancionDto>>(reproduccionCancionDtos, HttpStatus.OK);
    }



}
