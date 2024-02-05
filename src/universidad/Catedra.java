package universidad;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private int cod_cat;
    private String nombre;
    private Departamento departamento;
    private Facultad facultad;
    private Set<Adscrito> adscritos;

    public Catedra(int cod_cat,String nombre, Departamento departamento,Facultad facultad){
        this.cod_cat = cod_cat;
        this.nombre = nombre;
        this.departamento = departamento;
        this.facultad = facultad;
        this.adscritos = new HashSet<>();
    }

    public int getCod_cat() {
        return cod_cat;
    }

    public void setCod_cat(int cod_cat) {
        this.cod_cat = cod_cat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
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
        return this.cod_cat + " - " + this.nombre;
    }
}
