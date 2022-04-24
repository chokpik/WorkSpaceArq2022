package patrones.creacionales.abstractfactory;

public class ConexionProductor {

	public static IConexionAbstractFactory getFactory(String tipoFabrica)
	{
		if(tipoFabrica.equalsIgnoreCase("DB"))
		{
			return new ConexionDBFactory();
		}else if (tipoFabrica.equalsIgnoreCase("SERVICIOWB"))
		{
			return new ConexionServWebFactory();
		}
		
		return null;
	}

}
