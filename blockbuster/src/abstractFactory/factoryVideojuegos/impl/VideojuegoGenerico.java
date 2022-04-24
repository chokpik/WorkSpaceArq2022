package abstractFactory.factoryVideojuegos.impl;

import abstractFactory.factoryVideojuegos.InterfaceVideojuego;

public class VideojuegoGenerico implements InterfaceVideojuego{

    private double precio;
    private int duracionPrestamo;
    private String consola;

    public VideojuegoGenerico()
    {
        this.precio = 0d;
        this.duracionPrestamo = 0;
        this.consola = null;
    }

    @Override
    public void rentar() {
        System.out.println("JUEGO GENERICO, INGRESE UN VALOR VALIDO");
        
    }

    @Override
    public void devolver() {
        System.out.println("JUEGO GENERICO, INGRESE UN VALOR VALIDO");
        
    }

    @Override
    public void extenderTiempo() {
        System.out.println("JUEGO GENERICO, INGRESE UN VALOR VALIDO");
        
    }
    
}
