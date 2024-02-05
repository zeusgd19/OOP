package libro;

public class Tema{
    private String tema;
    public Tema(String tema){
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return this.tema;
    }
}