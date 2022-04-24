package abstractFactory.factoryVideojuegos.impl;

import abstractFactory.factoryVideojuegos.InterfaceVideojuego;

public class VideojuegoHollowNightSilkSongnt implements InterfaceVideojuego {
    private double precio;
    private int duracionPrestamo;
    private String consola;

    public VideojuegoHollowNightSilkSongnt()
    {
        this.precio = 25000;
        this.duracionPrestamo = 15;
        this.consola = "PC";
    }

    @Override
    public void rentar() {
        System.out.println("Rentado juego Hollow Night Silk Songn't");
        
    }

    @Override
    public void devolver() {
        System.out.println("Devuelto juego Hollow Night Silk Songn't");
        
    }

    @Override
    public void extenderTiempo() {
        this.duracionPrestamo += 20;
        System.out.println("Extenddido tiempo por 20 dias");
        
    }
}
