package sistemabancario.modelo;

public class Movimiento {
	//Atributos
	private String tipoMovimiento;
	private String descMovimiento;
	private long valor;

	//Constructor
	public Movimiento() {
		// TODO Auto-generated constructor stub
	}

	//Encapsulamiento
	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public String getDescMovimiento() {
		return descMovimiento;
	}

	public void setDescMovimiento(String descMovimiento) {
		this.descMovimiento = descMovimiento;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	
	
	

}