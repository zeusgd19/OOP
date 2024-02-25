package herencia;

public class Agricultor extends Trabajador{
    public Agricultor(String nombre, double salario){

        super(nombre,salario);
    }

    public void cultivar(){
        System.out.println("Estoy cultivando ahora mismo");
    }
}
