package Builder;

public class Articulo {
    //atributos obligatorios
    private Long id;

    //atributos opcionales
    private String referencia;
    private String nombre;
    private String descripcion;
    private Double precioUnitario;
    private Long stock;
    private Double precioMayorista;
    public Articulo(){}

    public Articulo(ArticuloBuilder builder){
        if(builder.getId() == null)
        {
            throw new IllegalArgumentException("Id es un atributo obligatorio");
        }

        this.id = builder.getId();
        this.referencia = builder.getReferencia();
        this.nombre = builder.getNombre();
        this.descripcion = builder.getDescripcion();
        this.precioUnitario = builder.getPrecioUnitario();
        this.stock = builder.getStock();
        this.precioMayorista = builder.getPrecioMayorista();
    }

    @Override
    public String toString() {
        
        return "id: " + id + " nombre: " + nombre + " referencia: " + referencia + " descripcion: " + descripcion + " precio Unitario: " + precioUnitario + " stock: " + stock + " precio Mayorista: " + precioMayorista;
    }
}
