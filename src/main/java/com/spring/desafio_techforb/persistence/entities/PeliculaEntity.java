package com.spring.desafio_techforb.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "actor")
public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long peliculaId;

    private String titulo;

    private Short estreno;

    private Short sinopsis;

    private char sexo;

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

    public Short getEstreno() {
        return estreno;
    }

    public void setEstreno(Short estreno) {
        this.estreno = estreno;
    }

    public Short getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(Short sinopsis) {
        this.sinopsis = sinopsis;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public List<ActorEntity> getActores() {
        return actores;
    }

    public void setActores(List<ActorEntity> actores) {
        this.actores = actores;
    }
}
