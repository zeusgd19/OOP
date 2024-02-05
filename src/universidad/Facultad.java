package universidad;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Facultad {
    private int cod_f;
    private String nombre_f;

    private Set<Catedra> catedras;
    public Facultad(int cod_f,String nombre_f){
        this.cod_f = cod_f;
        this.nombre_f = nombre_f;
        this.catedras = new HashSet<>();
    }

    public int getCod_f() {
        return cod_f;
    }

    public void setCod_f(int cod_f) {
        this.cod_f = cod_f;
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public void setNombre_f(String nombre_f) {
        this.nombre_f = nombre_f;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
    @Override
    public String toString(){
        return  this.cod_f + " - " + this.nombre_f;
    }
}
