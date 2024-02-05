package ordenador;

public class Ordenador {
    private String modeloOrdenador;
    private String marcaOrdenador;
    private double precio;

    public Ordenador(String marcaOrdenador, String modeloOrdenador, double precio){
        this.marcaOrdenador = marcaOrdenador;
        this.modeloOrdenador = modeloOrdenador;
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