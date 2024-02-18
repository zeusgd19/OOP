package herencia;

public class Pepe extends Desempleado{
    public Pepe(String nombre, double salario){
        super(nombre,salario);
    }

    public void verAnime(){
        System.out.println("Yo veo anime");
    }
}
