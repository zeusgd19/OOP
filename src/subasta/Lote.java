package subasta;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private String nombre;
    private Set<Articulo> articulos;
    private Subasta subasta;
    private Set<Puja> pujas;
    private double precio;

    public Lote(String nombre,Subasta subasta){
        this.nombre = nombre;
        this.subasta = subasta;
        this.articulos = new HashSet<>();
        this.pujas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }
    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void precioInicial(){
        this.precio=articulos.stream()
                .map(Articulo::getPrecio)
                .mapToDouble(Double::valueOf)
                .sum();
    }

    @Override
    public String toString(){

        return this.nombre + " - " + this.precio;
    }
}
