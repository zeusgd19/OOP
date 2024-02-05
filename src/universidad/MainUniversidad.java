package universidad;

import java.util.ArrayList;

public class MainUniversidad {
    public static void main(String[] args) {
        AreaConocimiento a1 = new AreaConocimiento(100,"Álgebra");
        Departamento d1 = new Departamento(1000,"Departamento de Álgebra",a1);
        a1.addDepartamento(d1);
        Facultad f1 = new Facultad(1,"Ciencias");

        Catedra c1 = new Catedra(10000,"Álgebra",d1,f1);
        d1.addCatedra(c1);
        f1.addCatedra(c1);


        Profesor maria = new Profesor(472423,"Maria",d1);
        Profesor pepe = new Profesor(24244,"Pepe",d1);
        d1.addProfesor(pepe);
        d1.addProfesor(maria);

        Adscrito pepeAdscrito = new Adscrito(pepe,c1,"01-02-2024");
        Adscrito mariaAdscrito = new Adscrito(maria,c1,"01-02-2024");
        pepe.addAdscritos(pepeAdscrito);
        c1.addAdscritos(pepeAdscrito);
        maria.addAdscritos(mariaAdscrito);
        c1.addAdscritos(mariaAdscrito);

        AreaConocimiento a2 = new AreaConocimiento(101,"Física");
        Departamento d2 = new Departamento(1001,"Departamento de Fisica",a2);
        a2.addDepartamento(d2);

        Catedra c3 = new Catedra(100001,"Fisica",d2,f1);
        Catedra c4 = new Catedra(100002,"Mates",d2,f1);
        Catedra c5 = new Catedra(100003,"Biologia",d2,f1);
        d2.addCatedra(c3);
        f1.addCatedra(c3);
        d1.addCatedra(c4);
        f1.addCatedra(c4);
        d2.addCatedra(c5);
        f1.addCatedra(c5);

        Profesor juan = new Profesor(53434,"Juan",d2);
        Profesor felipe = new Profesor(53463,"Felipe",d2);
        d2.addProfesor(juan);
        d2.addProfesor(felipe);

        Adscrito juanAdscrito = new Adscrito(juan,c3,"05-02-2024");
        Adscrito felipeAdscrito = new Adscrito(felipe,c4,"05-02-2024");
        Adscrito juanAdscrito2 = new Adscrito(juan,c4,"05-02-2024");
        juan.addAdscritos(juanAdscrito);
        felipe.addAdscritos(felipeAdscrito);
        juan.addAdscritos(juanAdscrito2);
        c3.addAdscritos(juanAdscrito);
        c4.addAdscritos(felipeAdscrito);
        c4.addAdscritos(juanAdscrito);

        ArrayList<AreaConocimiento> areas = new ArrayList<>();
        areas.add(a1);
        areas.add(a2);

        for (AreaConocimiento a: areas) {
            System.out.println(a);
            for (Departamento d:a.getDepartamentos()) {
                System.out.println("\t" + d);
                for (Profesor p:d.getProfesores()) {
                    System.out.println("\t\t" + "Profesor: " +p);
                    System.out.println("\t\t" + "Facultad: ");
                    for (Adscrito ads:p.getAdscritos()) {
                        System.out.println("\t\t\t" + ads.getCatedra().getFacultad());
                            System.out.println("\t\t\t\t"+ "Adscrito el: " + ads + " en: ");
                            System.out.println("\t\t\t\t" + ads.getCatedra());
                        }
                    }
                }
            }
    }
}
