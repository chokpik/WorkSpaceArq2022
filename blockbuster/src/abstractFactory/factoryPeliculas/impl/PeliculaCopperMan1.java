package abstractFactory.factoryPeliculas.impl;

import abstractFactory.factoryPeliculas.InterfacePelicula;

public class PeliculaCopperMan1 implements InterfacePelicula {
    private double precio;
    private int duracion;
    private int duracionPrestamo;

    public PeliculaCopperMan1()
    {
        this.precio = 20000d;
        this.duracion = 115;
        this.duracionPrestamo = 10;
    }
    
    @Override
    public void rentar() {
        System.out.println("Pelicula Iron Man 1 rentada");
        
    }

    @Override
    public void devolver() {
        System.out.println("Pelicula Iron Man 1 devuelta");
        
    }

    @Override
    public void extenderTiempo() {
        this.duracionPrestamo += 10;
        System.out.println("Extenddido tiempo por 10 dias");
    }
}
