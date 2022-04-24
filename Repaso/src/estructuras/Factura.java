package estructuras;

import java.util.Scanner;

public class Factura {

	/**
	 * CONSTRUCTOR DE LA CLASE
	 */
	public Factura() {}

	/**
	 * METODO PARA EJECUTAR LA CLASE -PARA EJERCICIO EN CLASE
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Nombre del cliente:");
		String nombreCliente = entrada.nextLine();
		
		System.out.println("Tipo de cliente (1: SuperEspecial 2:Especial 3:Nuevo");
		Integer tipoCliente = entrada.nextInt();
				
		System.out.println(" ARTICULOS COMPRADOS ");
		
		String rta="si";
		int cntArticulos = 0;
		
		Double valorArticulo = 0D, totalComprado = 0.0;
		while (rta.toLowerCase().equals("si")) {
			cntArticulos++;

			System.out.println("Valor del articulo #"+cntArticulos);
			valorArticulo = entrada.nextDouble();
			totalComprado = totalComprado+valorArticulo;
					
			System.out.println("¿Otro articulo?");
			rta = entrada.next();
		}
		
		
		Double valorDescuento = 0D;
		if (tipoCliente == 1) {
			valorDescuento= (totalComprado*0.30);
		} else if (tipoCliente == 2) {
			valorDescuento= (totalComprado*0.20);
		}else if (tipoCliente == 3) {
			valorDescuento= (totalComprado*0.10);
		}
		
		// Calculo del valor a pagar
		Double totalPagar = 0.0;
		totalPagar=totalComprado-valorDescuento;
		
		System.out.println("============================");
		System.out.println("== Cliente: "+nombreCliente);
		System.out.println("== Tipo: "+tipoCliente);
		System.out.println("== Total de articulos: "+cntArticulos);
		System.out.println("== Total Comprado: "+totalComprado);
		System.out.println("== Valor Descuento: "+valorDescuento);
		System.out.println("== Total a Pagar:" +totalPagar);
	}

}
