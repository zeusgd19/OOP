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

        Desempleado juan = new Desempleado("Juan",500);
        juan.inscritoETT();
        juan.verAnime();
    }
}
