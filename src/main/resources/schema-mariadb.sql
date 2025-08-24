/**
 * @author almac
 * @version 1.0
 * @since 2025-08-19
 */

drop table if exists videojuego;
drop table if exists distribuidor;

create table videojuego(
    id_vj int primary key auto_increment, 
        /*primary key: no puedo haber 2 videojuegos con el mismo número id
          auto_increment: la bbdd se encarga de incremetar el número sola mientras se realizan insercciones */
    nombre varchar(200) not null, /*no permito que el campo sea nulo*/
    descripcion varchar(3000),
    imagen_url varchar(500)
);

INSERT INTO videojuego (nombre, descripcion, imagen_url) VALUES
('Borderlands 3', 
'Shooter en primera persona con toques de rol. Enfréntate a los Gemelos Calypso en un universo caótico lleno de humor negro y acción cooperativa.', 
'https://cdn.mobygames.com/covers/448945-borderlands-3-playstation-4-front-cover.jpg'),

('Uncharted', 
'Nathan Drake vuelve a la acción junto a su hermano Sam en busca del tesoro del pirata Henry Avery, viajando por el mundo y enfrentando viejos enemigos.', 
'https://pictures.abebooks.com/isbn/9781616559274-es.jpg'),

('Until Dawn. Rush of Blood', 
'Shooter sobre raíles en una montaña rusa de terror. Recorre escenarios oscuros, enfréntate a criaturas y sobrevive usando distintas armas.', 
'https://images.igdb.com/igdb/image/upload/t_1080p_2x/co2afs.webp'),

('Red Dead Redemption 2', 
'Sigue la historia de Arthur Morgan y la banda de Van der Linde en el salvaje oeste con un realismo impresionante.', 
'https://image.api.playstation.com/gs2-sec/appkgo/prod/CUSA08519_00/12/i_3da1cf7c41dc7652f9b639e1680d96436773658668c7dc3930c441291095713b/i/icon0.png'),

('The Last of Us Part II', 
'Una secuela cargada de emociones donde Ellie emprende un viaje de venganza en un mundo postapocalíptico.', 
'https://m.media-amazon.com/images/I/71DLcVdoPTL._UF1000,1000_QL80_.jpg'),

('God of War', 
'Kratos y su hijo Atreus exploran la mitología nórdica en una aventura épica llena de acción y emociones.', 
'https://gaming-cdn.com/images/products/17355/orig/god-of-war-pc-juego-steam-latin-america-cover.jpg?v=1723201044'),

('Minecraft', 
'Un sandbox creativo donde puedes construir, explorar y sobrevivir en mundos infinitos generados proceduralmente.', 
'https://assets.nintendo.eu/image/upload/f_auto,c_limit,w_992,q_auto:low/MNS/NOE/70010000000963/SQ_NSwitch_Minecraft'),

('Cyberpunk', 
'RPG de mundo abierto en Night City con narrativa ramificada y ciberimplantes.', 
'https://cdn1.epicgames.com/offer/77f2b98e2cef40c8a7437518bf420e47/EGS_Cyberpunk2077_CDPROJEKTRED_S1_03_2560x1440-359e77d3cd0a40aebf3bbc130d14c5c7');


create table distribuidor(
    id_db int primary key auto_increment,
    nombre varchar(200) unique not null,
    sitio_web varchar(500)
);

INSERT INTO distribuidor (nombre, sitio_web) VALUES
('2K Games', 'https://www.2k.com'),
('Sony Interactive Entertainment', 'https://www.playstation.com'),
('Rockstar Games', 'https://www.rockstargames.com'),
('Mojang Studios', 'https://www.minecraft.net'),
('CD Projekt Red', 'https://www.cdprojektred.com');

alter table videojuego 
add column id_distribuidor int,
add foreign key (id_distribuidor) references distribuidor (id_db);

/* Borderlands 3 -> 2K*/
UPDATE videojuego v JOIN distribuidor d 
ON d.nombre = '2K Games' SET v.id_distribuidor = d.id_db
WHERE v.nombre = 'Borderlands 3';

/* Uncharted, Until Dawn RB, TLOU2, God of War -> Sony */
UPDATE videojuego v JOIN distribuidor d 
ON d.nombre = 'Sony Interactive Entertainment' SET v.id_distribuidor = d.id_db
WHERE v.nombre IN ('Uncharted', 'Until Dawn. Rush of Blood', 'The Last of Us Part II', 'God of War');

/* RDR2 -> Rockstar */
UPDATE videojuego v JOIN distribuidor d 
ON d.nombre = 'Rockstar Games' SET v.id_distribuidor = d.id_db
WHERE v.nombre = 'Red Dead Redemption 2';

/* Minecraft -> Mojang */
UPDATE videojuego v JOIN distribuidor d 
ON d.nombre = 'Mojang Studios' SET v.id_distribuidor = d.id_db
WHERE v.nombre = 'Minecraft';

/* Cyberpunk -> CDPR */
UPDATE videojuego v JOIN distribuidor d 
ON d.nombre = 'CD Projekt Red' SET v.id_distribuidor = d.id_db
WHERE v.nombre LIKE 'Cyberpunk%';

alter table videojuego
modify id_distribuidor int not null;

