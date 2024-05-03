package com.example.kreitek.kreitefy.infraestructure.rest;

import com.example.kreitek.kreitefy.application.dto.AlbumDto;
import com.example.kreitek.kreitefy.application.service.AlbumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlbumRestController {
    public final AlbumService albumService;

    public AlbumRestController(AlbumService albumService) {
        this.albumService = albumService;
    }
    @GetMapping(value = "/albumes", produces = "application/json")
    public ResponseEntity<List<AlbumDto>> obtenerTodosLosAlbums(
            @RequestParam(name = "partialName", required = false) String partialName) {
        List<AlbumDto> albumes;

        if (partialName != null) {
            albumes = albumService.obtenerTodosLosAlbumPorNombre(partialName);
        } else {
            albumes = albumService.obtenerTodosLosAlbum();
        }

        return new ResponseEntity<>(albumes, HttpStatus.OK);
    }

    @GetMapping(value = "/albumes/{albumId}", produces = "application/json")
    public ResponseEntity<AlbumDto> getItemById(@PathVariable Long albumId) {
        Optional<AlbumDto> album = albumService.obtenerAlbumPorId(albumId);
        if (album.isPresent()) {
            return new ResponseEntity<>(album.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @CrossOrigin
    @PatchMapping(value = "/albumes/{albumId}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<AlbumDto> actualizarAlbum(@PathVariable Long albumId, @RequestBody AlbumDto albumDto) {
        albumDto = albumService.guardarAlbum(albumDto);
        return new ResponseEntity<>(albumDto, HttpStatus.OK);
    }
}
