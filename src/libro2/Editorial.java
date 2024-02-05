package libro2;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private String nombre;
    private int cod_ed;
    private Set<Libro> libros;

    public Editorial(String nombre,int cod_ed){
        this.nombre = nombre;
        this.cod_ed = cod_ed;
        this.libros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public void setCod_ed(int cod_ed) {
        this.cod_ed = cod_ed;
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
        return this.cod_ed + " - " + this.nombre;
    }
}
