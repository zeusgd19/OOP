package banco;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {
    private String n_cc;
    private Sucursal sucursal;
    private Set<Domiciliacion> domiciliaciones;
    private Set<Cliente> clientes;

    public CuentaCorriente(String n_cc, Sucursal sucursal){
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.domiciliaciones = new HashSet<>();
        this.clientes = new HashSet<>();
    }

    public String getN_cc() {
        return n_cc;
    }

    public void setN_cc(String n_cc) {
        this.n_cc = n_cc;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public void addDomiciliacion(Domiciliacion domiciliacion){
        this.domiciliaciones.add(domiciliacion);
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Set<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(Set<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }
    @Override
    public String toString(){
        return this.n_cc + " Domiciliaciones: " + this.domiciliaciones;
    }
}
