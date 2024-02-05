package universidad;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private int cod_prof;
    private String nombre_prof;
    private Departamento departamento;
    private Set<Adscrito> adscritos;
    public Profesor(int cod_prof,String nombre_prof,Departamento departamento){
        this.cod_prof = cod_prof;
        this.nombre_prof = nombre_prof;
        this.departamento = departamento;
        this.adscritos = new HashSet<>();
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    public String getNombre_prof() {
        return nombre_prof;
    }

    public void setNombre_prof(String nombre_prof) {
        this.nombre_prof = nombre_prof;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    public Set<Adscrito> getAdscritos() {
        return adscritos;
    }

    public void setAdscrito(Set<Adscrito> adscritos) {
        this.adscritos = adscritos;
    }

    public void addAdscritos(Adscrito adscrito){
        this.adscritos.add(adscrito);
    }
    @Override
    public String toString(){
        return this.cod_prof + " - " + this.nombre_prof;
    }
}
