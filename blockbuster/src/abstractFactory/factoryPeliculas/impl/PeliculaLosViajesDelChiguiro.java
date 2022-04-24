package abstractFactory.factoryPeliculas.impl;

import abstractFactory.factoryPeliculas.InterfacePelicula;

public class PeliculaLosViajesDelChiguiro implements InterfacePelicula{
    private double precio;
    private int duracion;
    private int duracionPrestamo;

    public PeliculaLosViajesDelChiguiro()
    {
        this.precio = 20000d;
        this.duracion = 150;
        this.duracionPrestamo = 10;
    }
    
    @Override
    public void rentar() {
        System.out.println("Pelicula Los viajes del chiguiro rentada");
        
    }

    @Override
    public void devolver() {
        System.out.println("Pelicula Los viajes del chiguiro devuelta");
        
    }

    @Override
    public void extenderTiempo() {
        this.duracionPrestamo += 10;
        System.out.println("Extenddido tiempo por 10 dias");
    }    
}
