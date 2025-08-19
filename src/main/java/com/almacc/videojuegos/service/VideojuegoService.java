package com.almacc.videojuegos.service;

import com.almacc.videojuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Servicio encargado de gestionar la lógica relacionada con los videojuegos.
 * 
 * <p>En esta implementación de ejemplo, el servicio devuelve una lista
 * predefinida de videojuegos destacados. En un proyecto real, este servicio
 * podría conectarse a una base de datos o a una API externa para recuperar 
 * los videojuegos destacados dinámicamente.</p>
 * 
 * @author almac
 */
@Service
public class VideojuegoService {

    /**
     * Busca y devuelve una lista de videojuegos destacados.
     * 
     * <p>La lista es estática y contiene varios videojuegos populares
     * con su nombre, descripción e imagen. En un escenario real,
     * este método podría aplicar reglas de negocio para determinar
     * qué juegos son destacados.</p>
     * 
     * @return una lista de {@link Videojuego} destacados
     */
    public List<Videojuego> buscarDestacados() {

        List<Videojuego> vjDestacados = new ArrayList<>();

        Videojuego juego1 = new Videojuego();
        juego1.setNombre("Borderlands 3");
        juego1.setDescripcion("Es un videojuego de disparos en primera persona con elementos de rol, desarrollado por Gearbox Software. Ambientado en un universo caótico y lleno de humor negro, el juego sigue a un grupo de nuevos buscadores de la Cámara que deben enfrentarse a los Gemelos Calypso, líderes de un culto fanático que busca apoderarse del poder de las Cámaras repartidas por distintos planetas. Con acción explosiva, un vasto arsenal de armas y un estilo artístico distintivo, el juego combina tiroteos frenéticos con narrativa irreverente en una aventura cooperativa o en solitario.");
        juego1.setImagenUrl("https://cdn.mobygames.com/covers/448945-borderlands-3-playstation-4-front-cover.jpg");

        Videojuego juego2 = new Videojuego();
        juego2.setNombre("Uncharted");
        juego2.setDescripcion("En esta entrega, Nathan Drake, ya retirado de la vida de cazatesoros, se ve obligado a regresar a la aventura cuando su hermano Sam, a quien creía muerto, aparece pidiéndole ayuda. Juntos, emprenden la búsqueda del tesoro perdido del pirata Henry Avery, lo que los lleva por todo el mundo, enfrentándose a peligrosos enemigos y desenterrando secretos del pasado. La historia explora temas como la familia, la redención y los límites del sacrificio.");
        juego2.setImagenUrl("https://pictures.abebooks.com/isbn/9781616559274-es.jpg");

        Videojuego juego3 = new Videojuego();
        juego3.setNombre("Until Dawn. Rush of Blood");
        juego3.setDescripcion("El juego es un spin-off directo de Until Dawn. El jugador juega en un carrito de montaña rusa mientras atraviesa un parque de diversiones de carnaval con temática de terror que se vuelve más intenso a medida que el jugador avanza en el juego. El juego presenta siete montañas rusas diferentes que presentan algunas de las mismas ubicaciones y personajes de sus hermanos, aunque con diferentes temas, y se cargan rápidamente de forma predeterminada con pistolas, aunque hay otras armas disponibles.");
        juego3.setImagenUrl("https://images.igdb.com/igdb/image/upload/t_1080p_2x/co2afs.webp");

        Videojuego juego4 = new Videojuego();
        juego4.setNombre("Red Dead Redemption 2");
        juego4.setDescripcion("Sigue la historia de Arthur Morgan y la banda de Van der Linde en el salvaje oeste con un realismo impresionante.");
        juego4.setImagenUrl("https://image.api.playstation.com/gs2-sec/appkgo/prod/CUSA08519_00/12/i_3da1cf7c41dc7652f9b639e1680d96436773658668c7dc3930c441291095713b/i/icon0.png");

        Videojuego juego5 = new Videojuego();
        juego5.setNombre("The Last of Us Part II");
        juego5.setDescripcion("Una secuela cargada de emociones donde Ellie emprende un viaje de venganza en un mundo postapocalíptico.");
        juego5.setImagenUrl("https://m.media-amazon.com/images/I/71DLcVdoPTL._UF1000,1000_QL80_.jpg");

        Videojuego juego6 = new Videojuego();
        juego6.setNombre("God of War");
        juego6.setDescripcion("Kratos y su hijo Atreus exploran la mitología nórdica en una aventura épica llena de acción y emociones.");
        juego6.setImagenUrl("https://gaming-cdn.com/images/products/17355/orig/god-of-war-pc-juego-steam-latin-america-cover.jpg?v=1723201044");

        Videojuego juego7 = new Videojuego();
        juego7.setNombre("Minecraft");
        juego7.setDescripcion("Un sandbox creativo donde puedes construir, explorar y sobrevivir en mundos infinitos generados proceduralmente.");
        juego7.setImagenUrl("https://assets.nintendo.eu/image/upload/f_auto,c_limit,w_992,q_auto:low/MNS/NOE/70010000000963/SQ_NSwitch_Minecraft");

        Videojuego juego8 = new Videojuego();
        juego8.setNombre("Cyberpunk");
        juego8.setDescripcion("RPG de mundo abierto en Night City con narrativa ramificada y ciberimplantes.");
        juego8.setImagenUrl("https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S1_03_2560x1440-359e77d3cd0a40aebf3bbc130d14c5c7");

        vjDestacados.add(juego1);
        vjDestacados.add(juego2);
        vjDestacados.add(juego3);
        vjDestacados.add(juego4);        
        vjDestacados.add(juego5);
        vjDestacados.add(juego6);
        vjDestacados.add(juego7);
        vjDestacados.add(juego8);

        return vjDestacados;
    }
}
