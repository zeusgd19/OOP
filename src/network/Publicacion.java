package network;

import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {
    private String id;
    private Usuario usuario;
    private long marcaTemporal;
    private int likes;
    private List<String> comentarios;

    public Publicacion(Usuario usuario) {
        this.id = this.id;
        this.usuario = usuario;
        this.marcaTemporal = System.currentTimeMillis();
        this.likes = 0;
        this.comentarios = new ArrayList();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getMarcaTemporal() {
        return this.marcaTemporal;
    }

    public void setMarcaTemporal(long marcaTemporal) {
        this.marcaTemporal = marcaTemporal;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<String> getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}