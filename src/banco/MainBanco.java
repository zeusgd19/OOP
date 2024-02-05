package banco;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        Banco bbva = new Banco("BBVA",100,new HashSet<Sucursal>());
            Sucursal mayor = new Sucursal(101,"12-Mayor",bbva);
            bbva.addSucursal(mayor);
                CuentaCorriente c1 = new CuentaCorriente("1010",mayor);
                CuentaCorriente c2 = new CuentaCorriente("1011",mayor);
                Domiciliacion d1 = new Domiciliacion("3829q31",c1);
                Domiciliacion d2 = new Domiciliacion("424235s",c2);
                c1.addDomiciliacion(d1);
                mayor.addCuenta(c1);
                Cliente maria = new Cliente("313124","Maria");
                Cliente pepe = new Cliente("4356567","pepe");

                c1.addCliente(maria);
                c1.addCliente(pepe);
                pepe.addCuentaCorriente(c1);
                maria.addCuentaCorriente(c1);

                Prestamo p1 = new Prestamo(1,100,mayor,maria);
                    mayor.addPrestamo(p1);
                    maria.addPrestamo(p1);
            Sucursal enmedio = new Sucursal(102,"C/ Enmedio",bbva);
            bbva.addSucursal(enmedio);
                 c2.addDomiciliacion(d2);
                 enmedio.addCuenta(c2);
                Cliente juan = new Cliente("65464h","Juan");
                Prestamo p2 = new Prestamo(2,1000,enmedio,juan);
                Prestamo p3 = new Prestamo(3,3000,enmedio,juan);

                c2.addCliente(juan);
                juan.addCuentaCorriente(c2);
                    enmedio.addPrestamo(p2);
                    enmedio.addPrestamo(p3);
                    juan.addPrestamo(p1);
                    juan.addPrestamo(p2);

        System.out.println(bbva);
        for (Sucursal s: bbva.getSucursales()
             ) {
            System.out.println("\t" + s);
            for (CuentaCorriente c:s.getCuentas()
            ) {
                System.out.println("\t\t" + "Cuenta: " + c.getN_cc() + " " +c.getDomiciliaciones());
                System.out.println("\t\t\t" + "Clientes: " + c.getClientes());
            }
            for (Prestamo p:s.getPrestamos()
                 ) {
                System.out.print("\t\t" + p);
                System.out.println(" DNI: " + p.getCliente());

            }
        }
    }
}
