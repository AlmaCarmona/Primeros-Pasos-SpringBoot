/**
 * @author almac
 * @version 1.0
 * @since 2025-08-19
 */

drop table if exists videojuego;

create table videojuego(
    id_vj int primary key auto_increment, 
        /*primary key: no puedo haber 2 videojuegos con el mismo número id
          auto_increment: la bbdd se encarga de incremetar el número sola mientras se realizan insercciones */
    nombre varchar(200) not null, /*no permito que el campo sea nulo*/
    descripcion varchar(3000),
    imagen_url varchar(500)
);

INSERT INTO videojuego (nombre, descripcion, imagen_url) VALUES
("Borderlands 3", 
"Es un videojuego de disparos en primera persona con elementos de rol, desarrollado por Gearbox Software. Ambientado en un universo caótico y lleno de humor negro, el juego sigue a un grupo de nuevos buscadores de la Cámara que deben enfrentarse a los Gemelos Calypso, líderes de un culto fanático que busca apoderarse del poder de las Cámaras repartidas por distintos planetas. Con acción explosiva, un vasto arsenal de armas y un estilo artístico distintivo, el juego combina tiroteos frenéticos con narrativa irreverente en una aventura cooperativa o en solitario.", 
"https://cdn.mobygames.com/covers/448945-borderlands-3-playstation-4-front-cover.jpg"),

("Uncharted", 
"En esta entrega, Nathan Drake, ya retirado de la vida de cazatesoros, se ve obligado a regresar a la aventura cuando su hermano Sam, a quien creía muerto, aparece pidiéndole ayuda. Juntos, emprenden la búsqueda del tesoro perdido del pirata Henry Avery, lo que los lleva por todo el mundo, enfrentándose a peligrosos enemigos y desenterrando secretos del pasado. La historia explora temas como la familia, la redención y los límites del sacrificio.", 
"https://pictures.abebooks.com/isbn/9781616559274-es.jpg"),

("Until Dawn. Rush of Blood", 
"El juego es un spin-off directo de Until Dawn. El jugador juega en un carrito de montaña rusa mientras atraviesa un parque de diversiones de carnaval con temática de terror que se vuelve más intenso a medida que el jugador avanza en el juego. El juego presenta siete montañas rusas diferentes que presentan algunas de las mismas ubicaciones y personajes de sus hermanos, aunque con diferentes temas, y se cargan rápidamente de forma predeterminada con pistolas, aunque hay otras armas disponibles.", 
"https://images.igdb.com/igdb/image/upload/t_1080p_2x/co2afs.webp"),

("Red Dead Redemption 2", 
"Sigue la historia de Arthur Morgan y la banda de Van der Linde en el salvaje oeste con un realismo impresionante.", 
"https://image.api.playstation.com/gs2-sec/appkgo/prod/CUSA08519_00/12/i_3da1cf7c41dc7652f9b639e1680d96436773658668c7dc3930c441291095713b/i/icon0.png"),

("The Last of Us Part II", 
"Una secuela cargada de emociones donde Ellie emprende un viaje de venganza en un mundo postapocalíptico.", 
"https://m.media-amazon.com/images/I/71DLcVdoPTL._UF1000,1000_QL80_.jpg"),

("God of War", 
"Kratos y su hijo Atreus exploran la mitología nórdica en una aventura épica llena de acción y emociones.", 
"https://gaming-cdn.com/images/products/17355/orig/god-of-war-pc-juego-steam-latin-america-cover.jpg?v=1723201044"),

("Minecraft", 
"Un sandbox creativo donde puedes construir, explorar y sobrevivir en mundos infinitos generados proceduralmente.", 
"https://assets.nintendo.eu/image/upload/f_auto,c_limit,w_992,q_auto:low/MNS/NOE/70010000000963/SQ_NSwitch_Minecraft"),

("Cyberpunk", 
"RPG de mundo abierto en Night City con narrativa ramificada y ciberimplantes.", 
"https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S1_03_2560x1440-359e77d3cd0a40aebf3bbc130d14c5c7");
