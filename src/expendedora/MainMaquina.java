package expendedora;

public class MainMaquina {
    public static void main(String[] args) {
        MaquinaExpendedora m1 = new MaquinaExpendedora(120,400);
        m1.setDinero(120);
        m1.addDinero(30);
        System.out.println(m1.sacarTique());
        System.out.println(m1.getCajon());
    }
}
