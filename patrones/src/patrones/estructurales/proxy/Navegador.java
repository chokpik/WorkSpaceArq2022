package patrones.estructurales.proxy;

public class Navegador {
    public static void main(String[] args) {
        PaginaWebProxy paginaWebProxy = new PaginaWebProxy();
        try {
            paginaWebProxy.cargarPagina("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n======================================\n");

        try {
            paginaWebProxy.cargarPagina("instagram.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n======================================\n");

        try {
            paginaWebProxy.cargarPagina("youtube.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
