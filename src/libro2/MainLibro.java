package libro2;

public class MainLibro {
    public static void main(String[] args) {
        Tema magia = new Tema("Magia",1);
        Editorial ed1 = new Editorial("Minalima",1);
        Libro libro1 = new Libro("Harry Potter y la piedra filosofal",1373845,magia,ed1);
        magia.addLibro(libro1);
        ed1.addLibro(libro1);
        Autor autor1 = new Autor("J.K.R",1);
        libro1.addAutor(autor1);
        autor1.addLibro(libro1);
        Ejemplar ejemplar1 = new Ejemplar("Harry Potter",1,libro1);
        libro1.addEjemplar(ejemplar1);


    }
}
