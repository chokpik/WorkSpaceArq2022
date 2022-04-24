package patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl;

import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;

public class ConexionServicioWebGenericaImpl implements IConexionServicioWeb{
	private String url;
	private String parametrosE;
	private String parametrosS;
	
	public ConexionServicioWebGenericaImpl()
	{
		this.url = null;
		this.parametrosE = null;
		this.parametrosS = null;
	}

	@Override
	public void conectarServicio() {
		// TODO Auto-generated method stub
		System.out.println("CONEXION GENERICA, INGRESE UNA VALIDA");
	}

	@Override
	public void desconectarServicio() {
		// TODO Auto-generated method stub
		System.out.println("DESCONECTADO SERVICIO WEB GENERICO");
		
	}
	
	@Override
	public String enviarMensaje(String mensaje)
	{
		return "NO SE PUEDE ENVIAR EL MENSAJE "+mensaje +"  A UNA CONEXI�N GENERICA DEBE EXPECIFICAR UN TIPO DE SERVICIO WEB VALIDO";
		
	}
	
}
