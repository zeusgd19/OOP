class Cuenta{
    private String titular;
    private double cantidad;

    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 200.0;
    }
    public Cuenta(String titular,double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if(cantidad > 0) {
            this.cantidad += cantidad;
        }
    }
    public void retirar(double cantidad){
        this.cantidad-=cantidad;
        if (this.cantidad < 0) this.cantidad = 0;
    }
}
public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Darius",400);
        c1.ingresar(200);
        c1.retirar(100);

        System.out.println(c1);
    }
}
