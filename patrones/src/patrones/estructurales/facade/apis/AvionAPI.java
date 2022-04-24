package patrones.estructurales.facade.apis;

import java.util.Random;

public class AvionAPI {
    
    public void buscarVuelos(String fechaIda, String fechaRegreso, String origen, String destino, int numVuelos){
        //LOGICA COMPLEJA PARA BUSCAR VUELOS DISPONIBLES SEGUN PARAMETROS
        Random rnd = new Random();

        System.out.println("=================================");
        System.out.println("Vuelos encontrados para" + destino +" desde "+ origen);
        System.out.println("Fecha ida:" + fechaIda + " Fecha regreso: " + fechaRegreso);

        for(int nv = 1; nv<= numVuelos; nv++){
            System.out.println("===>Opcion " + nv + " VUELO #" + rnd.nextInt());
        }
        
        System.out.println("=================================");
    }

    public AvionAPI(){

    }
}
