/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almacc.videojuegos.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Distribuidor dentro del sistema.
 *
 * <p>
 * Está mapeada como una entidad JPA (@Entity) para que se pueda persistir en la
 * base de datos.</p>
 *
 * <p>
 * Se debe usar el mismo nombre de atributo que de columna para mantener
 * coherencia entre la clase y la tabla.</p>
 *
 * <p>
 * Incluye constructores, getters y setters para mantener la encapsulación y
 * privacidad de los datos.</p>
 *
 * @author almac
 * @version 1.0
 * @since 2025-08-24
 */
@Entity
public class Distribuidor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_db;
    private String nombre;
    private String sitioWeb;
    /**
     * Relación uno-a-muchos con {@link Videojuego}.
     * <p>Un distribuidor puede estar asociado a múltiples videojuegos.</p>
     * 
     * <p>mappedBy = "distribuidor" debe coincidir con el nombre del campo en Videojuego.</p>
     */
    @OneToMany(mappedBy = "distribuidor", cascade = CascadeType.ALL)
    private List<Videojuego> videojuegos = new ArrayList<>();
    
    
    /**
     * Constructor vacío.
     * 
     * <p>Inicializa los atributos {@code nombre}, {@code sitioWeb}
     * con cadenas vacías.</p>
     */
    public Distribuidor() {
        this.nombre = "";
        this.sitioWeb = "";
    }
    
    /**
     * Constructor completo.
     * 
     * @param nombre Nombre del distribuidor.
     * @param sitioWeb URL de la web del distribuidor.
     */
    public Distribuidor(String nombre, String sitioWeb) {
        this.nombre = nombre;
        this.sitioWeb = sitioWeb;
    }
    
    /**
     * Getter del Id del distribuidor.
     * 
     * @return Id del distribuidor.
     */
    public Integer getId_db() {
        return id_db;
    }

    /**
     * Setter Id del distribuidor.
     * 
     * @param id_db Id del distribuidor.
     */
    public void setId_db(Integer id_db) {
        this.id_db = id_db;
    }

    /**
     * Getter del nombre.
     * 
     * @return nombre del distribuidor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre del distribuidor.
     * 
     * @param nombre del distribuidor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del sitio web del distribuidor.
     * 
     * @return sitio web del distribuidor.
     */
    public String getSitioWeb() {
        return sitioWeb;
    }

    /**
     * Setter del sitio web del distribuidor.
     * 
     * @param sitioWeb del distribuidor.
     */
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    

}
