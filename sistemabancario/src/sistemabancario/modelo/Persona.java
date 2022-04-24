package sistemabancario.modelo;

public class Persona {
	//Atributos de la clase persona
	private long identificacion;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String direccion;
	
	
	
	//Constructor principal de la clase
	public Persona() {}


	public Boolean esMayorEdad(int pEdad) {
		Boolean esMayorEdad=false;
		if (pEdad >= 18) {
			 esMayorEdad=true;
		}
		return  esMayorEdad;
	}

	//Encapsulamiento
	public long getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	

}