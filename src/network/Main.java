//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package network;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Usuario pepe = new Usuario("Pepe");
        Mensaje mensaje = new Mensaje(pepe, "Hola gente estamos activo papi");
        Foto foto = new Foto(pepe, "gatitos.jpeg", "MI GATO");
        pepe.addMensaje(mensaje);
        pepe.addFoto(foto);
        System.out.println(mensaje.getUsuario());
        pepe.recogerPublicaciones();
    }
}
