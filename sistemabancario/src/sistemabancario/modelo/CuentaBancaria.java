package sistemabancario.modelo;



public class CuentaBancaria {
	//atributos
	private long numeroCuenta;
	private Persona persona;
	private Banco banco;
	private String tipoCuenta;
	private Movimientos movimientos;
	
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}

	
	public void abrirCuenta(Persona pPersona, String pTipoCuenta, long pNumeroCuenta, Banco pBanco) {
		this.setPersona(pPersona);
		this.setTipoCuenta(pTipoCuenta);
		this.setNumeroCuenta(pNumeroCuenta);
		this.setBanco(pBanco);
		
		this.movimientos = new Movimientos();
		
		System.out.println("******* Cuenta creada con el No. " + pNumeroCuenta + " para el cliente " + pPersona.getNombre() + " En el Banco " + pBanco.getNombreBanco());
	}

	
	public void registrarMovimiento(Movimiento pMovimiento) {
		movimientos = this.getMovimientos();
		movimientos.agregarMovimiento(pMovimiento);
	}
	
	public void verMovimientos() {
		movimientos.listarMovimientos();
	}
	
	public void mayorConsignacion()
	{
		movimientos.mayorConsignacion();
	}
	
	public void mayorRetiro()
	{
		movimientos.mayorRetiro();
	}
	
	
	public long getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public Movimientos getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(Movimientos movimientos) {
		this.movimientos = movimientos;
	}

}