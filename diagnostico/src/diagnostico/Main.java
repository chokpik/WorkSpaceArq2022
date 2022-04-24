package diagnostico;

import java.util.Scanner;



public class Main {
	
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos productos tiene la tienda");
		
		Double ventaDia = 0d;
		
		Producto[] productos = new Producto[entrada.nextInt()];
		
		Integer opcion = 1;
		do {
		System.out.println("\t************************");
		System.out.println("\t******  M E N U   ******");
		System.out.println("\t************************");
		System.out.println("\t1. Crear producto");
		System.out.println(
				"\t2. vender productos");
		System.out.println("\t3. Abastecer tienda");
		System.out.println("\t4. Dinero total ganado");
		System.out.println("\t5. Producto mas vendido");
		System.out.println("\t6. Total de ventas del dia (Cantidad)");
		//Opcion creativa
		System.out.println("\t7. Activar descuento");
		System.out.println("\t0. Salir del programa");
		System.out.println("\t************************");
		System.out.println("\tIngrese su opci�n: ");
		opcion  = entrada.nextInt();
		switch (opcion) {
		case 1:
			
			for (int i = 0; i < productos.length; i++) {
				
			
				System.out.println("Ingrese el nombre del producto" + (i+1));
				String nombre = entrada.next();
				//entrada.next();
				System.out.println("Ingrese el tipo del producto #" +(i+1) +"\n1. papeleria\n2. supermercado\n3. drogueria" );
				String tipo = "";
				switch (entrada.nextInt()) {
				case 1:
					tipo = "papeleria";
					break;
				case 2:
					tipo = "supermercado";
					break;
				case 3:
					tipo = "drogueria";
					break;

				default:
					break;
				}
				System.out.println("Ingrese la cantidad del producto disponible" + (i+1));
				int cantidad = entrada.nextInt();
				System.out.println("Ingrese el valor del producto (sin iva)" + (i+1));
				Double precio = entrada.nextDouble();
				
				productos[i] = new Producto(nombre, tipo, cantidad, precio);
				
			}
			
			break;
			
		case 2:
			
			for (int i = 0; i < productos.length; i++) {
				System.out.println((i+1) + productos[i].toString());
			}
			System.out.println("Seleccione el producto deseado");
			int index = entrada.nextInt();
			productos[index-1].setCantidad(productos[index-1].getCantidad()-1);
			ventaDia += productos[index-1].calculoImpuesto(productos[index-1]);
			System.out.println("El precio de venta + iva es: " + productos[index-1].calculoImpuesto(productos[index - 1]));
			productos[index-1].setCantidadVendida(productos[index-1].getCantidadVendida() + 1);
			
			
			break;
			
		case 3:
			for (int i = 0; i < productos.length; i++) {
				System.out.println((i+1) + productos[i].toString());
			}
			System.out.println("Seleccione el producto deseado");
			int index1 = entrada.nextInt();
			productos[index1-1].setCantidad(productos[index1-1].getCantidad()+1);
			
			break;
			
		case 4:
			System.out.println("La venta total del dia actual es " + ventaDia);			
			break;
			
		case 5:
			int maxNum = productos[0].getCantidadVendida();
			int index2 = 0;
	        for (int i = 0; i < productos.length; i++) {
	        	if (productos[i].getCantidadVendida() > maxNum)
				{
					maxNum = productos[i].getCantidadVendida();
	            	index2 = i;
				}
			}        
	        System.out.println("El producto que mas se vendio (cantidad) es " + productos[index2].toString());
			
			break;
		
		case 6:
			System.out.println("Total de ventas del dia (Cantidad)");
			for (int i = 0; i < productos.length; i++) {
				System.out.println(productos[i].totalVentasCantidad());
			}
			break;


		case 7:
			System.out.println("Activar descuento");
			for (int i = 0; i < productos.length; i++) {
				System.out.println((i+1) + productos[i].toString());
			}
			System.out.println("Seleccione un producto");
			int selec = entrada.nextInt();
			System.out.println("Ingrese el descuento total (en porcentaje)");
			Double desc = (entrada.nextDouble())/100;
			productos[selec - 1].setDescuento(desc);
			productos[selec - 1].setPrecioDeVenta(productos[selec - 1].getPrecioDeVenta()*(1-desc));
			System.out.println("El precio de venta del producto " + productos[selec - 1].getNombre() + " es de " + productos[selec - 1].getPrecioDeVenta());
			break;


		case 0:
			System.out.println("Hasta luego buen dia");
			break;

		default:
			break;
		}
		}while(opcion != 0);

	}

}
