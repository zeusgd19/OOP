package universidad;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private int cod_d;
    private String nombreDepart;
    private AreaConocimiento areaConocimiento;
    private Set<Catedra> catedras;
    private Set<Profesor> profesores;

    public Departamento(int cod_d, String nombreDepart,AreaConocimiento areaConocimiento) {
        this.cod_d = cod_d;
        this.nombreDepart = nombreDepart;
        this.areaConocimiento = areaConocimiento;
        this.catedras = new HashSet<>();
        this.profesores = new HashSet<>();
    }

    public int getCod_d() {
        return cod_d;
    }

    public void setCod_d(int cod_d) {
        this.cod_d = cod_d;
    }

    public String getNombreDepart() {
        return nombreDepart;
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
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

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }
    public void addProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    @Override
    public String toString(){
        return this.cod_d + " - " + this.nombreDepart;
    }
}
