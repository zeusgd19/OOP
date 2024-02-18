package herencia;

public abstract class Trabajador extends Persona {
    public Trabajador(String nombre,double salario){
        super(nombre,salario);
    }

    @Override
    public void origenIngresos(){
        System.out.println("Cnsigo el dinero trabajando");
    }

    public void fichar(){
        System.out.println("Ficho a las 8a.m");
    }
}
