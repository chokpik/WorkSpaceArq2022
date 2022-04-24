package abstractFactory;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;
import abstractFactory.factoryConfiteria.impl.ConfiteriaCombo1;
import abstractFactory.factoryConfiteria.impl.ConfiteriaCombo2;
import abstractFactory.factoryConfiteria.impl.ConfiteriaCombo3;
import abstractFactory.factoryConfiteria.impl.ConfiteriaGenerica;
import abstractFactory.factoryPeliculas.InterfacePelicula;
import abstractFactory.factoryVideojuegos.InterfaceVideojuego;

public class ConexionConfiteriaFactory implements IconexionAbstractFactory{

    @Override
    public InterfaceConfiteria getConexionConfiteriaFactory(String combo) {
        InterfaceConfiteria conn2Return = new ConfiteriaGenerica();
        if(combo.equalsIgnoreCase("COMBO1"))
        {
            conn2Return = new ConfiteriaCombo1();
        }else if(combo.equalsIgnoreCase("COMBO2"))
        {
            conn2Return = new ConfiteriaCombo2();
        }else if(combo.equalsIgnoreCase("COMBO3"))
        {
            conn2Return = new ConfiteriaCombo3();
        }



        return conn2Return;
    }

    @Override
    public InterfacePelicula getConexionPeliculaFactory(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InterfaceVideojuego getConexionVideojuegoFactory(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
