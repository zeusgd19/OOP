package banco;

public class Domiciliacion {
    private String num_d;
    private CuentaCorriente cuenta;
    public Domiciliacion(String num_d, CuentaCorriente cuenta){
        this.num_d = num_d;
        this.cuenta = cuenta;
    }

    public String getNum_d() {
        return num_d;
    }

    public void setNum_d(String num_d) {
        this.num_d = num_d;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }
    @Override
    public String toString(){
        return this.num_d;
    }
}
