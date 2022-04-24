package abstractFactory;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;
import abstractFactory.factoryPeliculas.InterfacePelicula;
import abstractFactory.factoryVideojuegos.InterfaceVideojuego;

public class Main {
    public static void main(String[] args) {
        IconexionAbstractFactory fabricaConfiteria = ConexionProductor.getFactory("CONFITERIA");
        InterfaceConfiteria combo1 = fabricaConfiteria.getConexionConfiteriaFactory("COMBO1");
        InterfaceConfiteria combo2 = fabricaConfiteria.getConexionConfiteriaFactory("COMBO2");
        InterfaceConfiteria combo3 = fabricaConfiteria.getConexionConfiteriaFactory("COMBO3");
        System.out.println("\t confiteria");
        System.out.println("------------------------------------------------------------------");
        combo1.agregarDulces();
        combo1.agregarGaseosa();
        combo1.comprar();
        System.out.println("------------------------------------------------------------------");
        combo2.agregarDulces();
        combo2.agregarGaseosa();
        combo2.comprar();
        System.out.println("------------------------------------------------------------------");
        combo3.agregarDulces();
        combo3.agregarGaseosa();
        combo3.comprar();
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");
        IconexionAbstractFactory fabricaPelicula = ConexionProductor.getFactory("PELICULA");
        InterfacePelicula harryPoper = fabricaPelicula.getConexionPeliculaFactory("HARRYPOPER1");
        InterfacePelicula COPPERMAN1 = fabricaPelicula.getConexionPeliculaFactory("COPPERMAN1");
        InterfacePelicula CHIGUIRO = fabricaPelicula.getConexionPeliculaFactory("LOSVIAJESDELCHIGUIRO");
        System.out.println("\t Peliculas");
        System.out.println("------------------------------------------------------------------");
        harryPoper.rentar();
        harryPoper.extenderTiempo();
        harryPoper.devolver();
        System.out.println("------------------------------------------------------------------");
        COPPERMAN1.rentar();
        COPPERMAN1.extenderTiempo();
        COPPERMAN1.devolver();
        System.out.println("------------------------------------------------------------------");
        CHIGUIRO.rentar();
        CHIGUIRO.extenderTiempo();
        CHIGUIRO.devolver();
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");
        IconexionAbstractFactory fabricaVideojuego = ConexionProductor.getFactory("VIDEOJUEGO");
        InterfaceVideojuego hollow = fabricaVideojuego.getConexionVideojuegoFactory("HOLLOWNIGHTSILKSONGN'T");
        InterfaceVideojuego overwatch2 = fabricaVideojuego.getConexionVideojuegoFactory("OVERWATCH2");
        InterfaceVideojuego halflife3 = fabricaVideojuego.getConexionVideojuegoFactory("HALFLIFE3");
        System.out.println("\t Videojuegos");
        System.out.println("------------------------------------------------------------------");
        hollow.rentar();
        hollow.extenderTiempo();
        hollow.devolver();
        System.out.println("------------------------------------------------------------------");
        overwatch2.rentar();
        overwatch2.extenderTiempo();
        overwatch2.devolver();
        System.out.println("------------------------------------------------------------------");
        halflife3.rentar();
        halflife3.extenderTiempo();
        halflife3.devolver();
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");



    }
}
