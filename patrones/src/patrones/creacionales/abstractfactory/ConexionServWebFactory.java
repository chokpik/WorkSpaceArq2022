package patrones.creacionales.abstractfactory;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IconexionDB;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl.ConexionServicioWebGenericaImpl;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl.ConexionServicioWebRESTImpl;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl.ConexionServicioWebSOAPImpl;

public class ConexionServWebFactory implements IConexionAbstractFactory{

	public ConexionServWebFactory() {
		
		
	}
	
	public IconexionDB getConexionDBFactory(String motor) {
		
		return null;
		
	}

	@Override
	public IConexionServicioWeb getConexionServWebFactory(String tipo) {
		// TODO Auto-generated method stub
		IConexionServicioWeb conn2Return = new ConexionServicioWebGenericaImpl();
		
		if(tipo.equalsIgnoreCase("SOAP"))
		{
			conn2Return = new ConexionServicioWebSOAPImpl();
		} else if(tipo.equalsIgnoreCase("REST"))
		{
			conn2Return = new ConexionServicioWebRESTImpl();
		}
		
		return conn2Return;
	}

}
