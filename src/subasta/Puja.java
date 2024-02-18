package subasta;

public class Puja {
    private String num_p;
    private int dinero;
    private Lote lote;
    private Pujador pujador;


    public Puja(String num_p,int dinero,Lote lote,Pujador pujador){
        this.num_p = num_p;
        this.dinero = dinero;
        this.lote = lote;
        this.pujador = pujador;
    }

    public String getNum_p() {
        return num_p;
    }

    public void setNum_p(String num_p) {
        this.num_p = num_p;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }
}
