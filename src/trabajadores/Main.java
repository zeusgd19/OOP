package trabajadores;

public class Main {
    public static void main(String[] args) {
        Directivo juan = new Directivo("Juan");
        Oficial pepe = new Oficial("Pepe");
        Tecnico maria = new Tecnico("Maria");

        System.out.println(juan);
        System.out.println(pepe);
        System.out.println(maria);
    }
}
