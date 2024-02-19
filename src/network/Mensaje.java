package network;

public class Mensaje extends Publicacion{
    private String mensaje;

    public Mensaje(Usuario usuario, String mensaje) {
        super(usuario);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    @Override
    public String toString(){
        return this.mensaje;
    }
}
