package expendedora;

public class MaquinaExpendedora {
    private int dinero;
    private int precio;
    private int cajon;

    public MaquinaExpendedora(int precio,int cajon){
        this.precio = precio;
        this.cajon = cajon;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public void addDinero(int dinero){
        this.dinero += dinero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    public String sacarTique(){
        if(this.cajon >= this.dinero - this.precio) {
            this.cajon+=this.precio;
            String devolver = getDevolver();
            return "Tiquet" + "\n" + devolver;

        } else if(this.dinero < this.precio) {
            return "Introduzca: " + (this.precio - this.dinero);
        } else {
            return "Introduzca el importe exacto";
        }
    }

    private String getDevolver() {
        String devolver = "";
        if(this.dinero > this.precio) {
            int[] billetes = {1000,500, 200, 100, 50, 20, 10, 5, 2, 1};
            int devuelta = this.dinero - this.precio;
            for (int i = 0; i < billetes.length; i++) {
                int division = devuelta / billetes[i];
                devuelta=devuelta%billetes[i];
                    while (division != 0) {
                        if (billetes[i] == 500) {
                            devolver += "5€" + " ";
                        } else if (billetes[i] == 200) {
                            devolver += "2€" + " ";
                        } else if (billetes[i] == 100) {
                            devolver += "1€" + " ";
                        } else {
                            devolver += billetes[i] + "cent" + " ";
                        }
                        division--;
                    }

            }
        }
        return devolver;
    }
}
