package herencia;

public class Main {


    public static void main(String[] args) {
        Obrero o = new Obrero("Paco",1000);
        o.origenIngresos();
        o.fichar();
        o.construir();

        Agricultor a = new Agricultor("Vicente",950);
        a.fichar();
        a.cultivar();
        a.origenIngresos();

        Pepe pepe = new Pepe("Pepe",600);
        pepe.origenIngresos();
        pepe.verAnime();
        pepe.inscritoETT();
    }
}
