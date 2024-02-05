package universidad;

public class Adscrito {
    private Profesor profesor;
    private Catedra catedra;
    private String data;

    public Adscrito(Profesor profesor, Catedra catedra, String data) {
        this.profesor = profesor;
        this.catedra = catedra;
        this.data = data;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    @Override
    public String toString(){
        return this.data;
    }
}
