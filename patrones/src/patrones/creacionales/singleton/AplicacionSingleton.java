package patrones.creacionales.singleton;

import patrones.creacionales.singleton.model.ConexionBD;

public class AplicacionSingleton {
    
    public static void main(String[] args) {
        ConexionBD conn = ConexionBD.getInstancia();
        conn.conectar();
        conn.desconectar();
        
        
        conn = ConexionBD.getInstancia();
        conn.conectar();
        conn.desconectar();
    }
    
}
