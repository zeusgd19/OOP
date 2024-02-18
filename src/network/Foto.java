package network;

public class Foto extends Publicacion{
    private String nombreArchivo;
    private String titulo;
    public Foto(Usuario usuario, String nombreArchivo, String titulo){
        super(usuario);
        this.nombreArchivo = nombreArchivo;
        this.titulo = titulo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
