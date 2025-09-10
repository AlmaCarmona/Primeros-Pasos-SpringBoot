package com.almacc.videojuegos.repository;

import com.almacc.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author almac
 * @version 1.5
 * @since 2025-08-22
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
     */
    @Query("select vj from Videojuego vj order by vj.nombre")
    List<Videojuego> findAllVj();
    
} 
    


