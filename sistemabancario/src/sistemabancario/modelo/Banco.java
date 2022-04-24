package sistemabancario.modelo;

public class Banco {
	//Atributos
	private long nitBanco;
	private String nombreBanco;
	private String direccion;
	private String nombreGerente;
	private long numSucursales;

	
	//Constructor
	public Banco() {
		// TODO Auto-generated constructor stub
	}

	
	//Encapsulamiento
	public long getNitBanco() {
		return nitBanco;
	}


	public void setNitBanco(long nitBanco) {
		this.nitBanco = nitBanco;
	}


	public String getNombreBanco() {
		return nombreBanco;
	}


	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombreGerente() {
		return nombreGerente;
	}


	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}


	public long getNumSucursales() {
		return numSucursales;
	}


	public void setNumSucursales(long numSucursales) {
		this.numSucursales = numSucursales;
	}
	
	
	
	

}