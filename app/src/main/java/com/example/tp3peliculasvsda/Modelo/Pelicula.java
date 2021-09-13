package com.example.tp3peliculasvsda.Modelo;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private int foto;
    private String titulo;
    private String resenia;
    private String actor;
    private String director;

    public Pelicula(int foto, String titulo, String resenia, String actor, String director) {
        this.foto = foto;
        this.titulo = titulo;
        this.resenia = resenia;
        this.actor=actor;
        this.director=director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }
}
