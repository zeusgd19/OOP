package subasta;

import java.awt.*;

public class MainSubasta {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String[] args) {

        Subasta subasta1 = new Subasta("Vehiculos");
        Lote lote1 = new Lote("Alta gama",subasta1);
        Lote lote2 = new Lote("Media",subasta1);
        Articulo a1 = new Articulo("Mercedes",100,lote1);
        lote1.addArticulo(a1);
        subasta1.addLotes(lote1);
        subasta1.addLotes(lote2);
        Articulo a2 = new Articulo("BMW",1000,lote1);
        lote1.addArticulo(a2);
        Articulo a3 = new Articulo("Audi",500,lote1);
        lote1.addArticulo(a3);

        Pujador pepe = new Pujador("Pepe");
        Puja puja1 = new Puja("1",1650,lote1,pepe);
        lote1.addPuja(puja1);
        pepe.addPuja(puja1);

        Pujador maria = new Pujador("Maria");
        Puja puja2 = new Puja("1",1700,lote1,maria);
        lote1.addPuja(puja2);
        maria.addPuja(puja2);

        Pujador juan = new Pujador("Juan");
        Puja puja3 = new Puja("1",2000,lote1,juan);
        lote1.addPuja(puja3);
        juan.addPuja(puja3);

        lote1.precioInicial();

        subasta1.setCerrada(true);

        System.out.println(ANSI_BLUE + subasta1 + ANSI_RESET);
        for (Lote lote: subasta1.getLotes()) {
            System.out.println(ANSI_RED + lote + ANSI_RESET);
            for (Articulo a: lote.getArticulos()) {
                System.out.println(ANSI_GREEN + "\t\t" + a + ANSI_RESET);
            }
            System.out.println(ANSI_PURPLE + "\tPujadores: " + ANSI_RESET);
            for (Puja p: lote.getPujas()) {
                System.out.println(ANSI_CYAN + "\t\t" + p.getPujador() + ANSI_RESET);
            }
        }
        System.out.println(ANSI_YELLOW + subasta1.ganadoresLotes() + ANSI_RESET);
    }
}
