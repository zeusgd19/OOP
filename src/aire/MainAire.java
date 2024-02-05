package aire;

import java.util.Scanner;

public class MainAire {
    public static void main(String[] args) {
        Aire a = new Aire("Fujitsu",30,40, 10);
        Scanner sc = new Scanner(System.in);
        String pulsador;
        do {
            System.out.println(a);
            pulsador = sc.nextLine();
            switch (pulsador){
                case "+":
                    a.aumentar();
                    break;
                case "-":
                    a.reducir();
                    break;
            }
            if(pulsador.equals("Exit")) break;
        } while (true);

    }
}
