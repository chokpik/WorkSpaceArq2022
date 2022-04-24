package patrones.creacionales.abstractfactory;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IconexionDB;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;

public interface IConexionAbstractFactory {
	IconexionDB getConexionDBFactory(String motor);
	IConexionServicioWeb getConexionServWebFactory(String tipo);
}
