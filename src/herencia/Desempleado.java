package herencia;

import java.lang.invoke.TypeDescriptor;

public class Desempleado extends Persona implements Contratable{
    private boolean isContratado = false;
    public  Desempleado(String nombre,double salario){
        super(nombre,salario);
    }
    public void inscritoETT(){
        System.out.println("Yo estoy inscrito en la ETT de castellon");
    }

    @Override
    public void origenIngresos(){
        if(!this.isContratado){
            System.out.println("Consigo el dinero del paro");
        } else {
            System.out.println("Consigo el dinero trabajando");
        }
    }

    public boolean isContratado() {
        return isContratado;
    }

    public void setContratado(boolean contratado) {
        isContratado = contratado;
    }

    public void verAnime(){
        System.out.println("Veo anime");
    }

    @Override
    public void contratar() {
        System.out.println("Me pueden contratar");
    }
}
