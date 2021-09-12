package com.example.tp3peliculasvsda.Modelo;

public class Pelicula {
    private int foto;
    private String titulo;
    private String resenia;

    public Pelicula(int foto, String titulo, String resenia) {
        this.foto = foto;
        this.titulo = titulo;
        this.resenia = resenia;
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
