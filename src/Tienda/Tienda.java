package Tienda;

public class Tienda{
    private String modeloOrdenador;
    private String marcaOrdenador;
    private double precio;

    public Tienda(String marcaOrdenador,String modeloOrdenador,double precio){
        this.modeloOrdenador = modeloOrdenador;
        this.marcaOrdenador = marcaOrdenador;
        this.precio = precio;
    }

    public String getModeloOrdenador() {
        return modeloOrdenador;
    }

    public void setModeloOrdenador(String modeloOrdenador) {
        this.modeloOrdenador = modeloOrdenador;
    }

    public String getMarcaOrdenador() {
        return marcaOrdenador;
    }

    public void setMarcaOrdenador(String marcaOrdenador) {
        this.marcaOrdenador = marcaOrdenador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        return this.marcaOrdenador + " " + this.modeloOrdenador + ": " + this.precio + " €";
    }
}