package libro;

import java.util.ArrayList;

public class Libro{
    private String titulo;
    private Autor autor;
    private int paginas;
    private ArrayList<Tema> temas;

    public Libro(String titulo, Autor autor, int paginas,ArrayList<Tema> temas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Libro.Libro{" +
                "titulo='" + titulo + "\n" +
                " autor=" + autor + "\n" +
                " paginas=" + paginas + "\n" +
                " temas=" + temas +
                '}';
    }
}