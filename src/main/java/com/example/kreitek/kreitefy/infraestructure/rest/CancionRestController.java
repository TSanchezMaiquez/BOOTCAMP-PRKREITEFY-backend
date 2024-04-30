package com.example.kreitek.kreitefy.infraestructure.rest;

import com.example.kreitek.kreitefy.application.dto.CancionDto;
import com.example.kreitek.kreitefy.application.service.CancionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CancionRestController {

private final CancionService cancionService;

    public CancionRestController(CancionService cancionService) {
        this.cancionService = cancionService;
    }
    @GetMapping(value = "/albumes/{albumId}/canciones", produces = "application/json")
    public ResponseEntity<List<CancionDto>> obtenerTodasLasCancionesDeAlbum(@PathVariable Long albumId) {
        List<CancionDto> canciones = cancionService.obtenerTodasLasCancionesDeUnAlbum(albumId);
        return new ResponseEntity<>(canciones, HttpStatus.OK);
    }
    @GetMapping(value = "/canciones/{cancionId}", produces = "application/json")
    public ResponseEntity<CancionDto> obtenerCancionesPorId(@PathVariable Long cancionId) {
        Optional<CancionDto> cancion = cancionService.obtenerCancionPorId(cancionId);
        if (cancion.isPresent()) {
            return new ResponseEntity<>(cancion.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/canciones", produces = "application/json")
    public ResponseEntity<Page<CancionDto>> obtenerCancionesByCriteriaPaged(
            @RequestParam(value = "filter", required = false) String filter, Pageable pageable) {
        Page<CancionDto> canciones = cancionService.getItemsByCriteriaStringPaged(filter, pageable);
        return new ResponseEntity<Page<CancionDto>>(canciones, HttpStatus.OK);
    }
}
