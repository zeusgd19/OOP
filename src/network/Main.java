package network;

public class Main {
    public static void main(String[] args){
        Usuario pepe = new Usuario("Pepe");
        Mensaje mensaje = new Mensaje(pepe, "Hola mi gente");
        Foto foto = new Foto(pepe, "gatos.png", "MI GATO");
        pepe.addPublicacion(mensaje);
        pepe.addPublicacion(foto);
        pepe.recogerPublicaciones();
        System.out.println(foto.getUsuario());
        System.out.println(mensaje.getUsuario());
        System.out.println(mensaje.getId());
        System.out.println(foto.getId());

        Usuario maria = new Usuario("Maria");
        maria.meGusta(foto);
        maria.recogerPublicaciones();
        maria.comentar(foto,"Me gusta la foto");
        System.out.println(foto.getComentarios());
        System.out.println(foto.getTitulo() + " tiene " + foto.getLikes() + " likes");
    }
}
