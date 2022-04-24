package abstractFactory;

public class ConexionProductor {
    public static IconexionAbstractFactory getFactory(String tipoFabrica)
    {
        if(tipoFabrica.equalsIgnoreCase("CONFITERIA"))
        {
            return new ConexionConfiteriaFactory();
        }else if(tipoFabrica.equalsIgnoreCase("VIDEOJUEGO"))
        {
            return new ConexionVideojuegoFactory();
        }else if(tipoFabrica.equalsIgnoreCase("PELICULA"))
        {
            return new ConexionPeliculaFactory();
        }
        return null;
    }
}
