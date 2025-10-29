package com.almacc.videojuegos.repository;

import com.almacc.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author almac
 * @since 2025-08-22
 * @version 1.6
 * @update 2025-10-29
 * Repositorio que se encarga de acceder a los datos de la base de datos. Se
 * inyecta automáticamente gracias a la Inversión de Control de Spring.
 */
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{/*<Clase con la que trabaja, tipo de dato del id de la clase>*/

    /*Realiza la búsqued por nombre de los videojuegos*/
    List<Videojuego> findByNombreContainingIgnoreCase(String nombre);
    
    /*
     * Hago una sobrecarga del método para filtar por orden (mismo nombre != prototipo)
     * Realiza la búsqued por nombre de los videojuegos ordenados
     */
    List<Videojuego> findByNombreContainingIgnoreCase(String texto, Sort orden);
    
    /**
     * Spring Data JPA resulve el método mediante el Query. El query es JPQL (lenguaje de consultas de JPA).
     * 
     * En JPQL se consultan objetos (en vez de tablas), y atributos de las instancias (en lugar de columnas). 
     * Se pueden usar todas las clases que estén mapeadas con JPA.
     *
     * Puedo utilizar la etiqueta (nativeQuery = true) de esta forma permito que Query admita SQL básico, pero no es lo más común.
     * 
     * Lo normal es poner la sentencia para obtener todas las instancias de la siguiente manera: from Videojuego vj order by vj.nombre 
     */
    @Query("select vj from Videojuego vj order by vj.nombre")
    List<Videojuego> findAllVj();
    
    /**
     * Puedo agregar parámetros al métoro de Query, y para referenciarlos hay que utilizar:
     * ?1, ?2, ?3, ..., ?n. Así sucesivamente.
     * 
     * Realiza la búsqueda por id del distribuidor y devuelve la Lista de Videojuegos ordenas por nombre.
     */
    @Query("from Videojuego vj where vj.distribuidor.id_db = ?1 order by nombre")
    List<Videojuego> buscarPorDistribuidor(int id_db);
    
} 
    


