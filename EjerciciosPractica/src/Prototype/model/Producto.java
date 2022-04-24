package Prototype.model;

public class Producto {
    private String nombre;
    private Long stock;
    private Double precio;

    public Producto(){}

    public Producto(String nombre, Long stock, Double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        
        return "nombre: " + nombre + " precio: " + precio + " stock: " + stock + "\n";
    }
}
