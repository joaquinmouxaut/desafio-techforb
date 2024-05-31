package com.spring.desafio_techforb.persistence.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "actor")
public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long peliculaId;

    private String titulo;

    private String estreno;

    private String sinopsis;

    @ManyToMany(mappedBy = "peliculas")
    private List<ActorEntity> actores;

    public PeliculaEntity() {}

    public PeliculaEntity(String titulo) {this.titulo = titulo;}

    public Long getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(Long peliculaId) {
        this.peliculaId = peliculaId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<ActorEntity> getActores() {
        return actores;
    }

    public void setActores(List<ActorEntity> actores) {
        this.actores = actores;
    }
}
