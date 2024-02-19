package network;

public class Comentario {
    private static int cuenta = 0;
    private int ID;
    private Publicacion publicacion;
    private String texto;
    private Usuario usuario;
    public Comentario(Publicacion publicacion,String texto,Usuario usuario){
        this.ID = cuenta++;
        this.publicacion = publicacion;
        this.texto = texto;
        this.usuario = usuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString(){
        return this.usuario + ": " +this.texto;
    }
}
