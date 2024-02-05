package libro2;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private String nombre;
    private int cod_t;
    private Set<Libro> libros;

    public Tema(String nombre,int cod_t){
        this.nombre = nombre;
        this.cod_t = cod_t;
        this.libros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_t() {
        return cod_t;
    }

    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
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
        return this.cod_t + " - " + this.nombre;
    }
}
