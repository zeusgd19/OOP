package network;

import java.util.HashSet;
import java.util.Set;

public class Usuario{
    private String nombre;
    private Set<Publicacion> publicaciones;
    private Set<Comentario> comentarios;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new HashSet<>();
        this.comentarios = new HashSet<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
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

    public void addPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }


    public void recogerPublicaciones(){
        System.out.println(publicaciones);
    }

    public void meGusta(Publicacion publicacion){
        publicacion.setLikes(publicacion.getLikes() + 1);
    }
    public void comentar(Publicacion publicacion,Comentario comentario){
        publicacion.addComentario(comentario);
    }
    public String toString() {
        return "Usuario: " + this.nombre;
    }

}