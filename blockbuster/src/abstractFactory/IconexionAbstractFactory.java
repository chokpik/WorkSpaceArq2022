package abstractFactory;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;
import abstractFactory.factoryPeliculas.InterfacePelicula;
import abstractFactory.factoryVideojuegos.InterfaceVideojuego;

public interface IconexionAbstractFactory {

    InterfaceConfiteria getConexionConfiteriaFactory(String combo);
    InterfacePelicula getConexionPeliculaFactory(String nombre);
    InterfaceVideojuego getConexionVideojuegoFactory(String nombre);

    
}
