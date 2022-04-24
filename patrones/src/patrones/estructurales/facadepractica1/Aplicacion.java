package patrones.estructurales.facadepractica1;

public class Aplicacion {
    public static void main(String[] args) {
        CheckFacade encryp1 = new CheckFacade();
        encryp1.Enviar("Hola");
        CheckFacade encryp2 = new CheckFacade();
        encryp2.Enviar("Camilo!");
        CheckFacade encryp3 = new CheckFacade();
        encryp3.Enviar("chokpikc:");
    }
}
