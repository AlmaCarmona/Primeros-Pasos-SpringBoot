package com.almacc.videojuegos.repository;

import com.almacc.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

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
    


} 
    


