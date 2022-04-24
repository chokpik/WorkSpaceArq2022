
package patrones.creacionales.factory.impl;

import patrones.creacionales.factory.IConexion;
public class ConexionMySQL implements IConexion{

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }
    
    

    @Override
    public void conectar() {
        System.out.println("Se conecto a la base de datos MySQL");
    }

    @Override
    public void desconectar() {
    }

    @Override
    public String toString() {
        return "ConexionMySQL [host=" + host+ ", puerto=" + puerto + ", usuario= " +usuario+ ",contrasana=" +contrasena+"]"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
