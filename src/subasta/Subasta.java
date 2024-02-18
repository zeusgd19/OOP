package subasta;

import java.util.HashSet;
import java.util.Set;

public class Subasta {
    private String nombre;
    private Set<Lote> lotes;
    private boolean cerrada;
    public Subasta(String nombre){
        this.nombre = nombre;
        this.lotes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }
    public void addLotes(Lote lote){
        this.lotes.add(lote);
    }

    public boolean isCerrada() {
        return cerrada;
    }
    public String ganadoresLotes(){
        String ganadores = "";
        if(this.isCerrada()){
            for (Lote lote:this.lotes) {
                    if(lote.getPujas().isEmpty()){
                        ganadores += "Lote " + lote.getNombre() + " no adjudicado" + "\n";
                    } else {
                        String ganador = "";
                        int max = Integer.MIN_VALUE;
                        for (Puja puja:lote.getPujas()) {
                            if(puja.getDinero() > max){
                                max = puja.getDinero();
                                ganador = puja.getPujador().getNombre();
                            }
                        }
                        ganadores+="Lote " + lote.getNombre() + " adjudicado a " + ganador;
                    }
            }
            return ganadores;
        }
        return "La subasta no esta cerrada";
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
