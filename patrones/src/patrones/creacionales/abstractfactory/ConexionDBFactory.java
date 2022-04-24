package patrones.creacionales.abstractfactory;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IconexionDB;
import patrones.creacionales.abstractfactory.factoryConexionesDB.impl.ConexionGenerica;
import patrones.creacionales.abstractfactory.factoryConexionesDB.impl.ConexionMySQL;
import patrones.creacionales.abstractfactory.factoryConexionesDB.impl.ConexionOracle;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;

public class ConexionDBFactory implements IConexionAbstractFactory  {

	public ConexionDBFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IconexionDB getConexionDBFactory(String motor) {
		
		IconexionDB conn2Return = new ConexionGenerica();
		
		if(motor.equalsIgnoreCase("MYSQL"))
		{
			conn2Return = new ConexionMySQL();
		} else if(motor.equalsIgnoreCase("ORACLE"))
		{
			conn2Return = new ConexionOracle();
		}
		
		return conn2Return;
	}

	@Override
	public IConexionServicioWeb getConexionServWebFactory(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
