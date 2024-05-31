package com.spring.desafio_techforb.services;

import com.spring.desafio_techforb.persistence.entities.ActorEntity;
import com.spring.desafio_techforb.persistence.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {
    @Autowired
    ActorRepository actorRepository;

    public List<ActorEntity> getActores() {
        return actorRepository.findAll();
    }

    public Optional<ActorEntity> getActorById(Long id) {
        return actorRepository.findById(id);
    }

    public void saveOrUpdateActor(ActorEntity actor) {
        actorRepository.save(actor);
    }

    public void deleteActor(Long id) {
        actorRepository.deleteById(id);
    }
}
