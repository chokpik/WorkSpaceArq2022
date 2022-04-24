package abstractFactory.factoryVideojuegos.impl;

import abstractFactory.factoryVideojuegos.InterfaceVideojuego;

public class VideoJuegoHalfLife3 implements InterfaceVideojuego {


    private double precio;
    private int duracionPrestamo;
    private String consola;

    public VideoJuegoHalfLife3()
    {
        this.precio = 25000;
        this.duracionPrestamo = 15;
        this.consola = "PC";
    }

    @Override
    public void rentar() {
        System.out.println("Rentado juego Half Life 3");
        
    }

    @Override
    public void devolver() {
        System.out.println("Devuelto juego Half Life 3");
        
    }

    @Override
    public void extenderTiempo() {
        this.duracionPrestamo += 20;
        System.out.println("Extenddido tiempo por 20 dias");
    }
    
}
