package patrones.estructurales.facade.apis;


public class HotelAPI {
    
    public void buscarHoteles(String fechaEntrada, String fechaSalida){
        //LOGICA COMPLEJA PARA BUSCAR VUELOS DISPONIBLES SEGUN PARAMETROS
        

        System.out.println("=================================");
        System.out.println("HOTELES ENCONTRADOS");
        System.out.println("Entrada: " + fechaEntrada + " Fecha Regreso " + fechaSalida);

        System.out.println("Hotel A");
        System.out.println("Hotel B");
        System.out.println("Hotel C");
        System.out.println("Hotel D");
        
        System.out.println("=================================");
    }


    public HotelAPI(){

    }
}
