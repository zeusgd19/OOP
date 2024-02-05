package libro2;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String nombre;
    private int cod_aut;
    private Set<Libro> libros;

    public Autor(String nombre,int cod_aut){
        this.nombre = nombre;
        this.cod_aut = cod_aut;
        this.libros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_aut() {
        return cod_aut;
    }

    public void setCod_aut(int cod_aut) {
        this.cod_aut = cod_aut;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }
    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    @Override
    public String toString(){
        return this.cod_aut + " - " + this.nombre;
    }
}
