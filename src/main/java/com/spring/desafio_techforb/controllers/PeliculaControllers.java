package com.spring.desafio_techforb.controllers;

import com.spring.desafio_techforb.persistence.entities.PeliculaEntity;
import com.spring.desafio_techforb.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pelicula")
public class PeliculaControllers {

    @Autowired
    private final PeliculaService peliculaService;

    public PeliculaControllers(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping
    public List<PeliculaEntity> getAll() {
        return peliculaService.getPeliculas();
    }

    @GetMapping("/{peliculaId}")
    public Optional<PeliculaEntity> getById(@PathVariable("{peliculaId}") Long peliculaId) {
        return peliculaService.getPeliculaById(peliculaId);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody PeliculaEntity pelicula) {
        peliculaService.saveOrUpdatePelicula(pelicula);
    }

    @DeleteMapping("/{peliculaId}")
    public void delete(@PathVariable("{peliculaId}") Long peliculaId) {
        peliculaService.deletePelicula(peliculaId);
    }
}
