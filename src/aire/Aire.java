package aire;

public class Aire{
    private String nombre;
    private int temperaturaMax;
    private int temperaturaMin;
    private int temperatura;

    public Aire(String nombre,int temperatura, int temperaturaMax,int temperaturaMin){
        this.nombre = nombre;
        this.temperatura = temperatura;
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

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    @Override
    public String toString(){
        return this.nombre + "\n temperatura actual: " + this.temperatura +
                " \n temperatura max: " +
                this.temperaturaMax + ", temperatura min: " + this.temperaturaMin;
    }
    public void aumentar() {
        if (this.temperatura + 1 <= this.temperaturaMax){
            this.temperatura++;
        }
    }
    public void reducir() {
        if (this.temperatura - 1>= this.temperaturaMin){
            this.temperatura--;
        }
    }

}
