package libro2;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String titulo;
    private int isbn;
    private Tema tema;
    private Editorial editorial;
    private Set<Autor> autores;
    private Set<Ejemplar> ejemplares;

    public Libro(String titulo,int isbn,Tema tema,Editorial editorial){
        this.titulo = titulo;
        this.isbn = isbn;
        this.tema = tema;
        this.editorial = editorial;
        this.autores = new HashSet<>();
        this.ejemplares = new HashSet<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
    public void addAutor(Autor autor){
        this.autores.add(autor);
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString(){
        return this.titulo + " - " + this.isbn;
    }
}
