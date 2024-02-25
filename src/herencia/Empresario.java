package herencia;

import javax.xml.crypto.dsig.TransformService;
import java.util.HashSet;
import java.util.Set;

public class Empresario extends Trabajador{
    private Set<Persona> trabajadores;

    public Empresario(String nombre,double salario){
        super(nombre,salario);
        this.trabajadores = new HashSet<>();
    }


    public Set<Persona> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Set<Persona> trabajadores) {
        this.trabajadores = trabajadores;
    }


    public void contratar(Persona persona){
        if (persona instanceof Contratable){
            System.out.println("Mañana te llamaremos para la entrevista");
            if(!(persona instanceof Trabajador)){
                ((Desempleado) (persona)).setContratado(true);
            }
        } else {
            System.out.println("No podemos contratarte, lo sentimos");
        }
    }

    public void addTrabajador(Persona persona){
        if(persona instanceof Contratable){
            this.trabajadores.add(persona);
        } else {
            System.out.println("No se añadira a " + persona.getNombre() + " como trabajador");
        }
    }
    @Override
    public String toString(){
        return  "Empresari@: " + super.toString();
    }
}
