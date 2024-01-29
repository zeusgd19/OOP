package Cuenta;


public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Darius",400);
        c1.ingresar(100);
        c1.retirar(600);

        System.out.println(c1);
    }
}
