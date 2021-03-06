package patrones.creacionales.abstractfactory;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IconexionDB;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;

public class Aplicacion {

	public Aplicacion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		IConexionAbstractFactory fabricaDB = ConexionProductor.getFactory("DB");
		IconexionDB motorMysql = fabricaDB.getConexionDBFactory("MYSQL");
		motorMysql.conectar();
		motorMysql.desconectar();
		
		IConexionAbstractFactory fabricaSrvWeb = ConexionProductor.getFactory("SERVICIOWB");
		IConexionServicioWeb fabricaSrvWebRest = fabricaSrvWeb.getConexionServWebFactory("REST");
		fabricaSrvWebRest.conectarServicio();
		String rta = fabricaSrvWebRest.enviarMensaje("mensaje recibido");
		System.out.println(rta);
		fabricaSrvWebRest.desconectarServicio();

	}

}
