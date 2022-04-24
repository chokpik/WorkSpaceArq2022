package abstractFactory;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;
import abstractFactory.factoryPeliculas.InterfacePelicula;
import abstractFactory.factoryPeliculas.impl.PeliculaCopperMan1;
import abstractFactory.factoryPeliculas.impl.PeliculaGenerica;
import abstractFactory.factoryPeliculas.impl.PeliculaHarryPoper1;
import abstractFactory.factoryPeliculas.impl.PeliculaLosViajesDelChiguiro;
import abstractFactory.factoryVideojuegos.InterfaceVideojuego;

public class ConexionPeliculaFactory implements IconexionAbstractFactory{

    @Override
    public InterfaceConfiteria getConexionConfiteriaFactory(String combo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InterfacePelicula getConexionPeliculaFactory(String nombre) {
        InterfacePelicula conn2Return = new PeliculaGenerica();
        if(nombre.equalsIgnoreCase("COPPERMAN1"))
        {
            conn2Return = new PeliculaCopperMan1();
        }else if(nombre.equalsIgnoreCase("HARRYPOPER1"))
        {
            conn2Return = new PeliculaHarryPoper1();
        }else if(nombre.equalsIgnoreCase("LOSVIAJESDELCHIGUIRO"))
        {
            conn2Return = new PeliculaLosViajesDelChiguiro();
        }



        return conn2Return;
    }

    @Override
    public InterfaceVideojuego getConexionVideojuegoFactory(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
