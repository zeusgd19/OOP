package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int n_suc;
    private String direccion;
    private Banco banco;
    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentas;

    public Sucursal(int n_suc, String direccion, Banco banco) {
        this.n_suc = n_suc;
        this.direccion = direccion;
        this.banco = banco;
        this.prestamos = new HashSet<>();
        this.cuentas = new HashSet<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public Banco getBanco() {
        return banco;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public void addCuenta(CuentaCorriente cuenta){
        this.cuentas.add(cuenta);
    }

    public Set<CuentaCorriente> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<CuentaCorriente> cuentas) {
        this.cuentas = cuentas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString(){

        return this.n_suc + " - " +  this.direccion;
    }
}
