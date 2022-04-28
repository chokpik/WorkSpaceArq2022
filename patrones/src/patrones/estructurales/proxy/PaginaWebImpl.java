package patrones.estructurales.proxy;

public class PaginaWebImpl implements PaginaWebInterface {
    
    
    
    @Override
    public void cargarPagina(String url) throws Exception {
        System.out.println(url + " cargada exitosamente");
        
    }
}
