package patrones.estructurales.facade;

public class Aplicacion {
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2022", "08/07/2022", "Lima", "Cancun");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("02/07/2022", "08/07/2022", "Bogota", "Madrid");
    }
}
