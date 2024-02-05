package banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String dni;
    private String nombre;

    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentaCorrientes;

    public Cliente(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
        this.cuentaCorrientes = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Prestamo> getPrestamo(){
        return prestamos;
    }
    public void setPrestamo(Set<Prestamo> prestamos){
        this.prestamos = prestamos;
    }
    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    public Set<CuentaCorriente> getCuentaCorrientes() {
        return cuentaCorrientes;
    }

    public void setCuentaCorrientes(Set<CuentaCorriente> cuentaCorrientes) {
        this.cuentaCorrientes = cuentaCorrientes;
    }

    public void addCuentaCorriente(CuentaCorriente cuentaCorriente){
        this.cuentaCorrientes.add(cuentaCorriente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
