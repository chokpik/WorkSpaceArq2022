
package patrones.creacionales.singleton.model;

public class ConexionBD {

    
    private static ConexionBD instancia = null;
    
    private ConexionBD(){   
    }
    
    public static ConexionBD getInstancia(){
        if (instancia == null){
        instancia = new ConexionBD();
            System.out.println("*Creando instancia");
        }else {
            System.out.println("===Retornando instacia ya creada");
        }
    return instancia;
    }
    
    public void conectar(){
        System.out.println("Realizando Conexion con la BD");
    }
    
    public void desconectar(){
        System.out.println("Realizando Desconexion con la BD");
    }
    
}
