package patrones.estructurales.proxy;

public class PaginaWebProxy implements PaginaWebInterface {
    
    private PaginaWebImpl paginaWeb;

    public PaginaWebProxy(){
        paginaWeb = new PaginaWebImpl();
    }
    
    @Override
    public void cargarPagina(String url) throws Exception {
        
        if(url.equalsIgnoreCase("facebook.com") || url.equalsIgnoreCase("instagram.com")){
            throw new Exception(url + " esta bloqueado por el proovedor");
        }
        else {
            paginaWeb.cargarPagina(url);
        }
        
    }
}
