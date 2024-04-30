package com.example.kreitek.kreitefy.infraestructure.rest;

import com.example.kreitek.kreitefy.application.dto.ArtistaDto;
import com.example.kreitek.kreitefy.application.service.ArtistaService;
import com.example.kreitek.kreitefy.domain.entity.Artista;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ArtistaRestController {

    private final ArtistaService artistaService;

    public ArtistaRestController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping(value = "/artistas", produces = "application/json")
    public ResponseEntity<List<ArtistaDto>> obtenerArtistas(
            @RequestParam(name = "partialName", required = false) String partialName) {
        List<ArtistaDto> artistas;

        if (partialName != null) {
            artistas = artistaService.obtenerTodosLosArtistasPorNombre(partialName);
        } else {
            artistas = artistaService.obtenerTodosLosArtistas();
        }

        return new ResponseEntity<>(artistas, HttpStatus.OK);
    }
    @GetMapping(value = "/artistas/{artistaId}", produces = "application/json")
    public ResponseEntity<ArtistaDto> obtenerArtistaPorId(@PathVariable Long artistaId) {
        Optional<ArtistaDto> artista = artistaService.obtenerArtistaPorId(artistaId);
        if (artista.isPresent()) {
            return new ResponseEntity<>(artista.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
