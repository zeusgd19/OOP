package Libro;

public class Autor{
    private String nombre;
    private String fecha_n;

    public Autor(String nombre,String fecha_n){
        this.nombre = nombre;
        this.fecha_n = fecha_n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(String fecha_n) {
        this.fecha_n = fecha_n;
    }

    @Override
    public String toString(){
        return this.nombre + ", nacio el: " + this.fecha_n;
    }
}