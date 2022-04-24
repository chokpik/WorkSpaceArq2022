package patrones.creacionales.abstractfactory.factoryConexionesDB.impl;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IconexionDB;

public class ConexionOracle implements IconexionDB{
	private String host;
    private String puerto;
    private String Usuario;
    private String pass;

    public ConexionOracle() {
        this.host = "localhost";
        this.puerto = "3406";
        this.Usuario = "roost";
        this.pass = "123";
    }

    
    @Override
    public void conectar() {
        System.out.println("Se conectó a MYQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de MY	SQL");
    }

    @Override
    public String toString() {
        return "ConexionSQLServer [host =" + host + ", puerto=" + puerto + ", usuario= " + Usuario + ", pass=" + pass + "]";
    }
}
