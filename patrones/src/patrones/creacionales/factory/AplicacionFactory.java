package patrones.creacionales.factory;

public class AplicacionFactory {
    public static void main(String[] args) {
        ConexionFactory fabrica = new ConexionFactory();
        IConexion conn1 = fabrica.getConexion("mySQL");
        conn1.conectar();
        conn1.desconectar();
    }
}
