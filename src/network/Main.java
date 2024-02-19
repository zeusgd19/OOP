package network;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Usuario> usuarios = new HashSet<>();
        Usuario pepe = new Usuario("Pepe");
        Usuario maria = new Usuario("Maria");
        Usuario juan = new Usuario("Juan");

        usuarios.add(pepe);
        usuarios.add(maria);
        usuarios.add(juan);

        Foto f = new Foto(maria,"imagen.png","pajaro");
        maria.addPublicacion(f);
        Foto f2 = new Foto(juan,"imagenJuan.png","pajaroJuan");
        juan.addPublicacion(f2);
        Foto f3 = new Foto(pepe,"imagenPepe.png","pajaroPepe");
        pepe.addPublicacion(f3);

        Mensaje m = new Mensaje(maria,"Qué tal?");
        Mensaje m2 = new Mensaje(juan,"Aquí andamos");
        maria.addPublicacion(m);
        juan.addPublicacion(m2);

        Comentario c = new Comentario(f2,"Muy bonita",maria);
        Comentario c2 = new Comentario(f,"Muy bonita tambien",juan);
        maria.comentar(f2,c);
        juan.comentar(f,c2);

        juan.meGusta(f);
        pepe.meGusta(f);
        for (Usuario u:usuarios) {
            System.out.println(u);
            for (Publicacion p: u.getPublicaciones()) {
                System.out.println("\t" + p);
                for (Comentario com:p.getComentarios()) {
                    System.out.println("\t\t" + com);
                }
            }
        }
    }
}
