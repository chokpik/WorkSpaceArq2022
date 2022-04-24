package patrones.creacionales.factory.impl;

import patrones.creacionales.factory.IConexion;

public class ConexionVacia implements IConexion{

    public ConexionVacia() {
        System.out.println("No se especifico el motor de DB");
    }

    
    @Override
    public void conectar() {
    System.out.println("No se especifico el motor de DB");
    }

    @Override
    public void desconectar() {
    System.out.println("No se especifico el motor de DB");
    }
    
}
