package patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;

import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;

public class ConexionServicioWebRESTImpl implements IConexionServicioWeb {
	private String url;
	private String parametrosE;
	private String parametrosS;
	
	public ConexionServicioWebRESTImpl()
	{
		this.url = null;
		this.parametrosE = null;
		this.parametrosS = null;
	}
	
	@Override
	public void conectarServicio() {
		// TODO Auto-generated method stub
		System.out.println("COnexion generica a servicio web REST");
	}

	@Override
	public void desconectarServicio() {
		// TODO Auto-generated method stub
		System.out.println("Desconectado a servicio REST");
	}
	
	@Override
	public String enviarMensaje(String mensaje)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD 'at' HH:MM:SS z");
		Date date = new Date(System.currentTimeMillis());
		
		String recibido = "Mensaje recibido " + mensaje;
		String respuesta = "Mensaje proc" + formatter.format(date);
		return recibido + " " +respuesta;
	}
}
