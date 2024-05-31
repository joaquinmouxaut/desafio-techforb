package com.spring.desafio_techforb.persistence.repositories;

import com.spring.desafio_techforb.persistence.entities.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface    ActorRepository extends JpaRepository<ActorEntity, Long> {
}
