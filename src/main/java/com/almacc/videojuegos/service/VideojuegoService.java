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
        juego1.setNombre("The Last of Us Part II");
        juego1.setDescripcion("Una secuela cargada de emociones donde Ellie emprende un viaje de venganza en un mundo postapocalíptico.");
        juego1.setImagenUrl("https://m.media-amazon.com/images/I/71DLcVdoPTL._UF1000,1000_QL80_.jpg");

        Videojuego juego2 = new Videojuego();
        juego2.setNombre("God of War");
        juego2.setDescripcion("Kratos y su hijo Atreus exploran la mitología nórdica en una aventura épica llena de acción y emociones.");
        juego2.setImagenUrl("https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S1_03_2560x1440-359e77d3cd0a40aebf3bbc130d14c5c7");

        Videojuego juego3 = new Videojuego();
        juego3.setNombre("Minecraft");
        juego3.setDescripcion("Un sandbox creativo donde puedes construir, explorar y sobrevivir en mundos infinitos generados proceduralmente.");
        juego3.setImagenUrl("https://assets.nintendo.eu/image/upload/f_auto,c_limit,w_992,q_auto:low/MNS/NOE/70010000000963/SQ_NSwitch_Minecraft");

        Videojuego juego4 = new Videojuego();
        juego4.setNombre("Red Dead Redemption 2");
        juego4.setDescripcion("Sigue la historia de Arthur Morgan y la banda de Van der Linde en el salvaje oeste con un realismo impresionante.");
        juego4.setImagenUrl("https://image.api.playstation.com/gs2-sec/appkgo/prod/CUSA08519_00/12/i_3da1cf7c41dc7652f9b639e1680d96436773658668c7dc3930c441291095713b/i/icon0.png");

        vjDestacados.add(juego1);
        vjDestacados.add(juego2);
        vjDestacados.add(juego3);
        vjDestacados.add(juego4);

        return vjDestacados;
    }
}
