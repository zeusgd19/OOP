package trabajadores;

public abstract class Operario extends Empleado{
    public Operario(String nombre){
        super(nombre);
    }
    @Override
    public String toString(){

        return this.getNombre();
    }
}
