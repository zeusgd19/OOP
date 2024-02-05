package universidad;

import java.util.HashSet;
import java.util.Set;

public class AreaConocimiento {
    private int cod_a;
    private String nombreArea;
    private Set<Departamento> departamentos;

    public AreaConocimiento(int cod_a, String nombreArea) {
        this.cod_a = cod_a;
        this.nombreArea = nombreArea;
        this.departamentos = new HashSet<>();
    }

    public int getCod_a() {
        return cod_a;
    }

    public void setCod_a(int cod_a) {
        this.cod_a = cod_a;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }
    @Override
    public String toString(){
        return this.cod_a + " - " + this.nombreArea;
    }
}
