package herencia;

public class Obrero extends Trabajador implements Contratable{
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

    @Override
    public void contratar() {
        System.out.println("Me pueden contratar");
    }
}
