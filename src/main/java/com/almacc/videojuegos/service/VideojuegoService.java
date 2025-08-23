package com.almacc.videojuegos.service;

import com.almacc.videojuegos.domain.Videojuego;
import com.almacc.videojuegos.repository.VideojuegoRepository;
import java.util.Collections;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Servicio encargado de gestionar la lógica relacionada con los videojuegos.
 * 
 * <p>
 * Esta clase delega el acceso a datos en {@link VideojuegoRepository} y muestra
 * operaciones de mayor nivel para el controlador.
 * </p>
 *
 * <p>
 * Ctrl+Shift+I: autocompletar imports.</p>
 *
 * @author almac
 * @version 1.5
 * @since 2025-08-21
 */
@Service
public class VideojuegoService {

    /**
     * Repositorio que se encarga de acceder a la base de datos para operaciones sobre {@link Videojuego}.
     */
    private final VideojuegoRepository videojuegoRepository;

    /**
     * Constructor con inyección de dependencias.
     *
     * @param videojuegoRepository  repositorio encargado de acceder a los datos.
     */
    
    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }
    
    /**
     * Busca y devuelve una lista de todos los videojuegos.
     * 
     * <p>La lista es estática y contiene varios videojuegos populares
     * con su nombre, descripción e imagen. </p>
     * 
     * @return una lista de {@link Videojuego}
     */
    public List<Videojuego> buscarTodosVideojuegos() {

        /*Mediante JPA mapea a los objetos videojuego*/
        return videojuegoRepository.findAll(); /*select * from videojuego*/
    }
    
    /**
     * Busca y devuelve una lista de los videojuegos por nombre.
     * 
     * Si el parámetro es nulo o en blanco, devuelve una lista vacía para evitar
     * consultas innecesarias.
     * 
     * <p>Ej: SELECT * FROM videojuego WHERE nombre = 'Cyberpunk 2077';</p>
     * 
     * @return una lista de {@link Videojuego}
     *
     * @param nombre Texto a buscar dentro del nombre.
     * @return Lista de videojuegos que coinciden, o lista vacía si nombre es nulo/vacío.
     */
    public List<Videojuego> buscarPorNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            return Collections.emptyList();
        }
        return videojuegoRepository.findByNombreContainingIgnoreCase(nombre.trim());
    }
}
