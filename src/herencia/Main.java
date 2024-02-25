package herencia;

public class Main {


    public static void main(String[] args) {
        Obrero paco = new Obrero("Paco",1000);
        paco.origenIngresos();
        paco.fichar();
        paco.construir();
        System.out.println();

        Agricultor vicente = new Agricultor("Vicente",950);
        vicente.fichar();
        vicente.cultivar();
        vicente.origenIngresos();
        System.out.println();

        Desempleado juan = new Desempleado("Juan",500);
        juan.inscritoETT();
        juan.verAnime();
        juan.origenIngresos();
        System.out.println();

        Empresario maria = new Empresario("Maria",2000);
        System.out.println(maria);
        maria.contratar(paco);
        maria.addTrabajador(paco);

        maria.contratar(vicente);
        maria.addTrabajador(vicente);

        maria.contratar(juan);
        maria.addTrabajador(juan);

        juan.origenIngresos();

    }
}
