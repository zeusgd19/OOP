package network;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nombre;
    private Set<Mensaje> mensajes;
    private Set<Foto> fotos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.mensajes = new HashSet();
        this.fotos = new HashSet();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addMensaje(Mensaje mensaje) {
        this.mensajes.add(mensaje);
    }

    public void addFoto(Foto foto) {
        this.fotos.add(foto);
    }

    public Set<Mensaje> getMensajes() {
        return this.mensajes;
    }

    public void setMensajes(Set<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Set<Foto> getFotos() {
        return this.fotos;
    }

    public void setFotos(Set<Foto> fotos) {
        this.fotos = fotos;
    }

    public void recogerPublicaciones() {
        System.out.println(this.mensajes);
        System.out.println(this.fotos);
    }

    public String toString() {
        return "Usuario: " + this.nombre;
    }
}