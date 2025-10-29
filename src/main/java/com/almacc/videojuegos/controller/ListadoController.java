package com.almacc.videojuegos.controller;

import com.almacc.videojuegos.domain.Videojuego;
import com.almacc.videojuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador que gestiona las peticiones a la aplicación relacionadas
 * con los videojuegos.
 * 
 * <p>En este caso, se encarga de atender la ruta <b>/videojuegos</b>
 * y devolver la vista correspondiente con el listado de videojuegos.</p>
 * 
 * <p>Este controlador delega la obtención de datos a la capa
 * {@link com.almacc.videojuegos.service.VideojuegoService VideojuegoService},
 * siguiendo el patrón MVC de Spring.</p>
 * 
 * @author almac
 * @since 2025-07-22 
 * @version 1.6
 * @update 2025-10-29
 */
@Controller
public class ListadoController {
    
    /**
     * Servicio que contiene la lógica de negocio para gestionar videojuegos.
     * Se inyecta automáticamente gracias a la Inversión de Control de Spring.
     */
    private final VideojuegoService videojuegoService;

    /**
     * Constructor con inyección de dependencias.
     * 
     * @param videojuegoService Servicio encargado de recuperar los videojuegos.
     */
    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }
    
    /**
     * Atiende las peticiones GET a la ruta <b>/videojuegos</b>.
     * Recupera la lista de videojuegos destacados desde el servicio
     * y los añade al modelo para ser mostrados en la vista.
     * 
     * @param model Modelo de Spring usado para pasar datos a la vista. (Es decir, actúa para guardar los datos, y los guarda hasta que Spring renderice el HTML)
     * @return Nombre de la vista a renderizar: "listado.html".
     */
    @RequestMapping("/videojuegos")
    public String listarVideojuegos(Model model){
        List<Videojuego> vjDestacados = videojuegoService.buscarTodosVideojuegos();
        model.addAttribute("destacados", vjDestacados);
        return "listado";
    }
    
    /**
     * Endpoint de búsqueda: recoge el parámetro "texto" enviado desde el
     * formulario. Añade los resultados al modelo bajo la clave "destacados" y
     * devuelve la plantilla "listado".
     *
     * @param texto Texto de búsqueda escrito por el usuario en el formulario (puede
     * ser nulo/vacío).
     * @param orden Orden que segirá a la hora de filtar los datos
     * @param opcion Opción entre nombre o descrpcion para filtrar
     * @param model Modelo para pasar datos a la vista.
     * @return Nombre de la plantilla a renderizar (listado.html).
     */
    @GetMapping("/videojuegos/buscar")
    public String buscar(
            @RequestParam(name = "texto") String texto,
            @RequestParam(name = "orden", defaultValue = "ASC") String orden,
            @RequestParam(name = "opcion", defaultValue = "nombre") String opcion,
            Model model) {
        // Llamada al service
        List<Videojuego> resultados;
        
        if(texto==null || texto.isBlank())
            resultados = videojuegoService.filtrarTodosPorOrden(orden, opcion);
        else
            resultados = videojuegoService.filtrarPorNombreOrdenado(texto, orden, opcion);

        model.addAttribute("destacados", resultados);
        model.addAttribute("busqueda", texto);
        model.addAttribute("orden", orden);
        model.addAttribute("opcion", opcion);

        return "listado";
    }

    /**
     * Atiende las peticiones GET a la ruta <b>/vjPorDistribuidor</b>. Recupera la
     * lista de videojuegos por distribuidor desde el servicio y los añade al modelo
     * para ser mostrados en la vista.
     *
     * @param distribuidorId Id de distribuidor
     * @param model Modelo de Spring usado para pasar datos a la vista. (Es
     * decir, actúa para guardar los datos, y los guarda hasta que Spring
     * renderice el HTML)
     * @return Nombre de la vista a renderizar: "listado.html".
     */
    @RequestMapping("/videojuegos/vjPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model){
        List<Videojuego> vj = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("destacados", vj);
        
        return "listado";
    }
}
