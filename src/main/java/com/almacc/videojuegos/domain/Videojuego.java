package com.almacc.videojuegos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase que representa un Videojuego dentro del sistema.
 * 
 * <p>Está mapeada como una entidad JPA (@Entity) para que se pueda
 * persistir en la base de datos.</p>
 * 
 * <p>Se debe usar el mismo nombre de atributo que de columna para
 * mantener coherencia entre la clase y la tabla.</p>
 *
 * <p>Incluye constructores, getters y setters para mantener
 * la encapsulación y privacidad de los datos.</p>
 * 
 * @author almac
 * @version 1.0
 * @since 2025-08-19
 */
@Entity
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_vj;
    private String nombre;
    private String descripcion;
    private String imagenUrl; /*El atributo utiliza camelCase, lo que JPA interpreta
                                como una columna con nombre "imagen_url" en la base de datos.*/
    
    /**
     * Constructor vacío.
     * 
     * <p>Inicializa los atributos {@code nombre}, {@code descripcion}
     * e {@code imagenUrl} con cadenas vacías.</p>
     */
    public Videojuego() {
        this.nombre = "";
        this.descripcion = "";
        this.imagenUrl = "";
    }

    /**
     * Constructor completo.
     * 
     * @param nombre Nombre del videojuego.
     * @param descripcion Descripción del videojuego.
     * @param imagenUrl URL de la imagen representativa del videojuego.
     */
    public Videojuego(String nombre, String descripcion, String imagenUrl) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
    }
    
    /**
     * Getter del nombre del videojuego.
     * 
     * @return nombre del videojuego.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre del videojuego.
     * 
     * @param nombre nuevo nombre del videojuego.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la descripción del videojuego.
     * 
     * @return descripción del videojuego.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter de la descripción del videojuego.
     * 
     * @param descripcion nueva descripción del videojuego.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter de la URL de la imagen del videojuego.
     * 
     * @return URL de la imagen del videojuego.
     */
    public String getImagenUrl() {
        return imagenUrl;
    }

    /**
     * Setter de la URL de la imagen del videojuego.
     * 
     * @param imagenUrl nueva URL de la imagen del videojuego.
     */
    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}
