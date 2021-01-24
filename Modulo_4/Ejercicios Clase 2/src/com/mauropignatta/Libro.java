package com.mauropignatta;

public class Libro {
    private String titulo;
    private String autor;
    private Long isbn;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Long getIsbn() {
        return isbn;
    }

    public Libro(){

    }

    public Libro(String titulo, String autor, Long isbn){
        setTitulo(titulo);
        setAutor(autor);
        setIsbn(isbn);
    }

    public void prestamo(){

    }

    public void devolucion(){

    }

    @Override // Sobreescribiendo el método del que hereda
    public String toString(){
        return getTitulo()+", "+getIsbn()+", "+getAutor();
    }
}
