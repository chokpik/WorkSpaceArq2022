package diagnostico;

public class Producto {
	String nombre;
	String tipo;
	int Cantidad;
	Double precioDeVenta;
	int cantidadVendida;
	Double descuento;
	
	
	public Producto(String nombre, String tipo, int cantidad, Double precioDeVenta) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.Cantidad = cantidad;
		this.precioDeVenta = precioDeVenta;
		this.descuento = 0d;
	}
	
	public int getCantidad() {
		return Cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecioDeVenta() {
		return precioDeVenta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public Double getDescuento()
	{
		return descuento;
	}
	
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecioDeVenta(Double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDescuento(Double descuento){
		this.descuento = descuento;
	}
	
	
	public Double calculoImpuesto(Producto miProducto)
	{
		Double valorTotal = 0d;
		Double precio = miProducto.getPrecioDeVenta();
		String tipo = miProducto.getTipo();
		
		switch (tipo) {
		case "papeleria":
			valorTotal = precio +(precio*0.16);
			break;

		case "supermercado"://4
			valorTotal = precio+(precio*0.04);
			break;

		case "drogueria"://12
			valorTotal = precio+(precio*0.12);
			break;

			
		default:
			break;
		}
		
		return valorTotal;
	}

	public String totalVentasCantidad()
	{
		return " nombre: " + this.nombre + " cantidad vendida: " + this.cantidadVendida + " tipo: " + this.tipo + " Valor con iva: " + this.calculoImpuesto(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " nombre: " + this.nombre + " cantidad actual: " + this.Cantidad + " tipo: " + this.tipo + " Valor con iva: " + this.calculoImpuesto(this);
	}
	
	
}

