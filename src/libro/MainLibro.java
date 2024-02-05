package libro;

import java.util.ArrayList;




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
