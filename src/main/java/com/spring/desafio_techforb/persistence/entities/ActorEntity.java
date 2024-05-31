package com.spring.desafio_techforb.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "actor")
public class ActorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actorId;

    private String nombre;

    private Short edad;

    private Short altura;

    private char sexo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "actor_pelicula", joinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "actorId"),
            inverseJoinColumns = @JoinColumn(name = "pelicula_id", referencedColumnName = "peliculaId")
    )

    private List<PeliculaEntity> peliculas;

    public ActorEntity() {}

    public ActorEntity(String nombre) {this.nombre = nombre;}

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public Short getAltura() {
        return altura;
    }

    public void setAltura(Short altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public List<PeliculaEntity> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<PeliculaEntity> peliculas) {
        this.peliculas = peliculas;
    }
}
