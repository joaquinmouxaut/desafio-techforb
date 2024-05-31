package com.spring.desafio_techforb.services;

import com.spring.desafio_techforb.persistence.entities.ActorEntity;
import com.spring.desafio_techforb.persistence.entities.PeliculaEntity;
import com.spring.desafio_techforb.persistence.repositories.ActorRepository;
import com.spring.desafio_techforb.persistence.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {
    @Autowired
    PeliculaRepository peliculaRepository;

    public List<PeliculaEntity> getPeliculas() {
        return peliculaRepository.findAll();
    }

    public Optional<PeliculaEntity> getPeliculaById(Long id) {
        return peliculaRepository.findById(id);
    }

    public void saveOrUpdatePelicula(PeliculaEntity actor) {
        peliculaRepository.save(actor);
    }

    public void deletePelicula(Long id) {
        peliculaRepository.deleteById(id);
    }
}
