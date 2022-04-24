package abstractFactory;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;
import abstractFactory.factoryPeliculas.InterfacePelicula;
import abstractFactory.factoryVideojuegos.InterfaceVideojuego;
import abstractFactory.factoryVideojuegos.impl.VideoJuegoHalfLife3;
import abstractFactory.factoryVideojuegos.impl.VideojuegoGenerico;
import abstractFactory.factoryVideojuegos.impl.VideojuegoHollowNightSilkSongnt;
import abstractFactory.factoryVideojuegos.impl.VideojuegoOverwatch2;

public class ConexionVideojuegoFactory implements IconexionAbstractFactory{

    @Override
    public InterfaceConfiteria getConexionConfiteriaFactory(String combo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InterfacePelicula getConexionPeliculaFactory(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InterfaceVideojuego getConexionVideojuegoFactory(String nombre) {
        InterfaceVideojuego conn2Return = new VideojuegoGenerico();
        if(nombre.equalsIgnoreCase("HALFLIFE3"))
        {
            conn2Return = new VideoJuegoHalfLife3();
        }else if(nombre.equalsIgnoreCase("HOLLOWNIGHTSILKSONGN'T"))
        {
            conn2Return = new VideojuegoHollowNightSilkSongnt();
        }else if(nombre.equalsIgnoreCase("OVERWATCH2"))
        {
            conn2Return = new VideojuegoOverwatch2();
        }



        return conn2Return;
    }
    
}
