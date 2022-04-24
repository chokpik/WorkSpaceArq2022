package patrones.creacionales.abstractfactory.factoryConexionesSrvWeb;

public interface IConexionServicioWeb {
	void conectarServicio();
	void desconectarServicio();
	String enviarMensaje(String mensaje);
}
