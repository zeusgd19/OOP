package herencia;

public class Desempleado extends Persona{
    public  Desempleado(String nombre,double salario){
        super(nombre,salario);
    }
    public void inscritoETT(){
        System.out.println("Yo estoy inscrito en la ETT de castellon");
    }

    @Override
    public void origenIngresos(){
        System.out.println("Consigo el dinero del paro");
    }
    public void verAnime(){
        System.out.println("Veo anime");
    }
}
