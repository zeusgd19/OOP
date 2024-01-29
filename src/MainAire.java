class Aire{
    private String nombre;
    private int temperaturaMax;
    private int temperaturaMin;

    public Aire(String nombre,int temperaturaMax,int temperaturaMin){
        this.nombre = nombre;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public int getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(int temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }
    @Override
    public String toString(){
        return this.nombre + " temperatura max: " + this.temperaturaMax + ", temperatura min: " + this.temperaturaMin;
    }
}
public class MainAire {
    public static void main(String[] args) {
        Aire a = new Aire("Fujitsu",30,10);
        System.out.println(a);

    }
}
