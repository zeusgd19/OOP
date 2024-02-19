package network;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Publicacion {
    private int id;
    private Usuario usuario;
    private String fecha;
    private int likes;
    private List<String> comentarios;

    public Publicacion(Usuario usuario) {
        this.id = (int) (Math.random() * 1000);
        this.usuario = usuario;
        for (Publicacion publicacion:usuario.getPublicaciones()) {
            if(this.id == publicacion.getId()){
                while(this.id != publicacion.getId()){
                    this.id = (int) (Math.random() * 1000);
                }
            }
        }
        Date marcaTemporal = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        fecha = sdf.format(marcaTemporal);
        this.likes = 0;
        this.comentarios = new ArrayList<>();
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
    public void addComentario(String comentario){
        this.comentarios.add(comentario);
    }
}