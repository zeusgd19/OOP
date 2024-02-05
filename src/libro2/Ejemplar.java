package libro2;

public class Ejemplar {
    private String nombre;
    private int n_reg;
    private Libro libro;

    public Ejemplar(String nombre,int n_reg,Libro libro){
        this.nombre = nombre;
        this.n_reg = n_reg;
        this.libro = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    @Override
    public String toString(){
        return this.n_reg + " - " + this.nombre;
    }
}
