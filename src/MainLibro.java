import java.util.ArrayList;

class Autor{
    private String nombre;
    private String fecha_n;

    public Autor(String nombre,String fecha_n){
        this.nombre = nombre;
        this.fecha_n = fecha_n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(String fecha_n) {
        this.fecha_n = fecha_n;
    }

    @Override
    public String toString(){
        return this.nombre + ", nacio el: " + this.fecha_n;
    }
}
class Tema{
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
class Libro{
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
        return "Libro{" +
                "titulo='" + titulo + "\n" +
                " autor=" + autor + "\n" +
                " paginas=" + paginas + "\n" +
                " temas=" + temas +
                '}';
    }
}
public class MainLibro {
    public static void main(String[] args) {
        Autor autor = new Autor("J.K.R","30-07-1965");
        ArrayList<Tema> temas = new ArrayList<>();
        temas.add(new Tema("Magia"));
        temas.add(new Tema("Adolescencia"));
        temas.add(new Tema("Muerte"));

        Libro libro = new Libro("Harry Potter y la pierda filosofal",autor,256,temas);
        System.out.println(libro);
    }
}
