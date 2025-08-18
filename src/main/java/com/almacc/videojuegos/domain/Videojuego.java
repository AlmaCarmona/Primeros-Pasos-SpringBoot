package com.almacc.videojuegos.domain;

/**
 *
 * @author almac
 */
public class Videojuego {
    private String nombre;
    private String descripcion;
    private String imagenUrl;

    /*Constructor vacío*/
    public Videojuego() {
        this.nombre = "";
        this.descripcion = "";
        this.imagenUrl = "";
    }

    /*Constructor completo*/
    public Videojuego(String nombre, String descripcion, String imagenUrl) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
    }
    
    /*Los getters y setter los utilizo para matener la privacidad de los datos*/
    /*Getter y Setter del Nombre del Vidojuego*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*Getter y Setter de la descrpción del Vidojuego*/
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    /*Getter y Setter del Nombre de la url de la imagen del Videojuego*/
    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
    
    
}
