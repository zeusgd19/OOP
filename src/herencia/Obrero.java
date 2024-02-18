package herencia;

public class Obrero extends Trabajador {
    public Obrero(String nombre,double salario){

        super(nombre,salario);
    }
    public void construir(){
        System.out.println("Estoy consrtuyendo");
    }
    @Override
    public void fichar(){
        System.out.println("Ficho a las 10a.m");
    }
}
