package abstractFactory.factoryPeliculas.impl;

import abstractFactory.factoryPeliculas.InterfacePelicula;

public class PeliculaGenerica implements InterfacePelicula{
    private double precio;
    private int duracion;
    private int duracionPrestamo;

    public PeliculaGenerica()
    {
        this.precio = 0d;
        this.duracion = 0;
        this.duracionPrestamo = 0;
    }
    
    @Override
    public void rentar() {
        System.out.println("PELICULA GENERICO, INGRESE UN VALOR VALIDO");
        
    }

    @Override
    public void devolver() {
        System.out.println("PELICULA GENERICO, INGRESE UN VALOR VALIDO");
        
    }

    @Override
    public void extenderTiempo() {
        System.out.println("PELICULA GENERICO, INGRESE UN VALOR VALIDO");
        
    }
}
