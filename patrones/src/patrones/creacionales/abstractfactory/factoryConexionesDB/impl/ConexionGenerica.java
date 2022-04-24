package patrones.creacionales.abstractfactory.factoryConexionesDB.impl;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IconexionDB;

public class ConexionGenerica implements IconexionDB {
	private String host;
    private String puerto;
    private String Usuario;
    private String pass;

    public ConexionGenerica() {
        this.host = "localhost";
        this.puerto = "3406";
        this.Usuario = "roost";
        this.pass = "123";
    }

    
    @Override
    public void conectar() {
        System.out.println("Se conectó a SQLServer");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de SQLServer");
    }

    @Override
    public String toString() {
        return "ConexionSQLServer [host =" + host + ", puerto=" + puerto + ", usuario= " + Usuario + ", pass=" + pass + "]";
    }
	
}
