package patrones.creacionales.factory;

import patrones.creacionales.factory.impl.ConexionMySQL;
import patrones.creacionales.factory.impl.ConexionVacia;

public class ConexionFactory {
   
    public IConexion getConexion(String motor){
        if (motor == null) {
            return new ConexionVacia();
        }
        else if(motor.equalsIgnoreCase("MySQL")){
                return new ConexionMySQL();
        }
        return new ConexionMySQL();
    }
    
}
