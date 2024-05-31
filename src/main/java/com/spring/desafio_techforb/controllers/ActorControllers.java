package com.spring.desafio_techforb.controllers;

import com.spring.desafio_techforb.persistence.entities.ActorEntity;
import com.spring.desafio_techforb.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/actor")
public class ActorControllers {

    @Autowired
    private final ActorService actorService;

    public ActorControllers(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<ActorEntity> getAll() {
        return actorService.getActores();
    }

    @GetMapping("/{actorId}")
    public Optional<ActorEntity> getById(@PathVariable("{actorId}") Long actorId) {
        return actorService.getActorById(actorId);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody ActorEntity actor) {
        actorService.saveOrUpdateActor(actor);
    }

    @DeleteMapping("/{actorId}")
    public void delete(@PathVariable("{actorId}") Long actorId) {
        actorService.deleteActor(actorId);
    }
}
