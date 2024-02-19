package network;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Publicacion {
    private static int cuenta = 0;
    private int id;
    private Usuario usuario;
    private Date fecha;
    private int likes;
    private Set<Comentario> comentarios;

    public Publicacion(Usuario usuario) {
        this.id = cuenta++;
        this.usuario = usuario;
        this.fecha = new Date();
        this.likes = 0;
        this.comentarios = new HashSet<>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    public void addComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }

    @Override
    public String toString(){
        return this.id + " Tiene: " + this.likes + " likes, " + this.fecha;
    }
}