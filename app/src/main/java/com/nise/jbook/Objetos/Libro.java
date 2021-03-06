package com.nise.jbook.Objetos;

public class Libro extends Recurso {
    String autor, titulo, isbn;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Libro(String id, String descripcion, boolean estado, String ubicacion) {
        super(id, descripcion, estado, ubicacion);
    }

    public Libro(String id, String descripcion, boolean estado, String ubicacion, String autor, String titulo, String isbn) {
        super(id, descripcion, estado, ubicacion);
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", reservado=" + reservado +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
