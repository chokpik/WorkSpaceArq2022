package Builder;

public class ArticuloBuilder {
    //atributos obligatorios
    private Long id;

    //atributos opcionales
    private String referencia;
    private String nombre;
    private String descripcion;
    private Double precioUnitario;
    private Long stock;
    private Double precioMayorista;

    public ArticuloBuilder(){}
    
    public Articulo build(){
        return new Articulo(this);
    }


    public ArticuloBuilder id(Long id){
        this.id = id;
        return this;
    }

    public ArticuloBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ArticuloBuilder idNombre(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
        return this;
    }

    public ArticuloBuilder idNombreDescripcion(Long id, String nombre, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        return this;
    }

    public ArticuloBuilder idPrecioUnitarioStock(Long id, Double precioUnitario, Long stock){
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        return this;
    }

    public ArticuloBuilder precioUnitarioStock(Double precioUnitario, Long stock){
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        return this;
    }

    public ArticuloBuilder idPrecioUnitarioMayorista(Long id, Double precioUnitario, Double precioMayorista){
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.precioMayorista = precioMayorista;
        return this;
    }
    
    public ArticuloBuilder precioUnitarioMayorista(Double precioUnitario, Double precioMayorista){
        this.precioUnitario = precioUnitario;
        this.precioMayorista = precioMayorista;
        return this;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Double getPrecioMayorista() {
        return precioMayorista;
    }

    public void setPrecioMayorista(Double precioMayorista) {
        this.precioMayorista = precioMayorista;
    }
    
    
}
