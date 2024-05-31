package com.spring.desafio_techforb.persistence.repositories;

import com.spring.desafio_techforb.persistence.entities.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long> {
}
