package com.almacc.videojuegos.domain;

/* Spring Boot 3 ya no reconoce javax.* 
 * Not a managed type: class ... etc.
*/
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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
     * Relación muchos-a-uno con {@link Distribuidor}. La columna
     * [id_distribuidor en videojuego] referencia la [(PK)id_db en distribuidor].
     */
    @ManyToOne
    @JoinColumn(name = "id_distribuidor", referencedColumnName = "id_db", nullable = true)
    private Distribuidor distribuidor;

    
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
     * Getter del Id del videojuego.
     * 
     * @return Id del videojuego.
     */
    public Integer getId_vj() {
        return id_vj;
    }

    /**
     * Setter del ID del videojuego.
     * 
     * @param id_vj nuevo Id del videojuego.
     */
    public void setId_vj(Integer id_vj) {
        this.id_vj = id_vj;
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

    /**
     * Getter del Distribuidor del videojuego.
     * 
     * @return Distribuidor del videojuego.
     */
    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    /**
     * Setter del Distribuidor del videojuego.
     * 
     * @param Distribuidor del videojuego.
     */
    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    
}
