package sistemabancario.vista;

import sistemabancario.modelo.Banco;
import sistemabancario.modelo.CuentaBancaria;
import sistemabancario.modelo.Persona;
import sistemabancario.modelo.Movimiento;

import java.util.Random;
import java.util.Scanner;

public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Definición de variables de entrada
		Scanner entrada = new Scanner(System.in);
		Random r = new Random();

		CuentaBancaria cuenta = new CuentaBancaria();
		Persona propietarioCuenta = new Persona();
		Banco bancoCuenta = new Banco();

		int opcion = 1;
		while (opcion != 0) {
			System.out.println ("\t=============================");
			System.out.println ("\t========= BANCA MIA =========");
			System.out.println ("\t=============================");
			System.out.println ("\t==> 1. Abrir Cuenta  ");
			System.out.println ("\t==> 2. Consignar  ");
			System.out.println ("\t==> 3. Retirar  ");
			System.out.println ("\t==> 4. Ver Movimientos  ");
			System.out.println ("\t==> 5. Generar Saldo  ");
			System.out.println ("\t==> 6. Mostrar mayor consignacion  ");
			System.out.println ("\t==> 7. Mostrar mayor retiro  ");

			System.out.println ("\t==> 0. Salir  ");
			System.out.println ("\t=============================");

			System.out.print ("\t Ingrese su opción: ");
			opcion = entrada.nextInt();

			if (opcion == 1 ) {
				System.out.println ("\t==> Ha ingresado a la opción -1- Abrir Cuenta  ");

				//Configurar la persona que va a abrir la cuenta
				System.out.println ("\t==> DATOS PERSONALES  ");
				System.out.print (". Número de Identificación:  ");
				long identificacion = entrada.nextLong();
				propietarioCuenta.setIdentificacion(identificacion);

				System.out.print (". Nombre:  ");
				String  nombre = entrada.next();
				propietarioCuenta.setNombre(nombre);

				System.out.print (". Apellido:  ");
				String  apellido = entrada.next();
				propietarioCuenta.setApellido(apellido);

				System.out.print (". Edad:  ");
				int  edad = entrada.nextInt();
				propietarioCuenta.setEdad(edad);

				System.out.print (". Genero:  ");
				String  genero = entrada.next();
				propietarioCuenta.setGenero(genero);

				System.out.println (". Dirección:  ");
				String  direccion = entrada.nextLine();
				propietarioCuenta.setDireccion(direccion);

				//Configurar los datos del Banco
				System.out.println ("\t==> DATOS DEL BANCO  ");
				System.out.print (". Nit del Banco:  ");
				long nitBanco = entrada.nextLong();
				bancoCuenta.setNitBanco(nitBanco);

				System.out.print (". Nombre del Banco:  ");
				String nombreBanco = entrada.next();
				bancoCuenta.setNombreBanco(nombreBanco);

				System.out.print (". Dirección del Banco:  ");
				String dirBanco = entrada.next();
				bancoCuenta.setDireccion(dirBanco);

				//TipoCuenta
				System.out.print (". Tipo de cuenta (C/A):  ");
				String tipoCuenta=entrada.next();
				//TODO 2- Validar que solo se ingrese Tipo de cuenta C o A 

				//Generar Número de cuenta
				Long numeroCuenta = r.nextLong();

				//APERTURA DE LA CUENTA

				// TODO VALIDAR QUE EL DUEÑO DE LA CUENTA SEA MAYOR DE EDAD, SINO, NO PERMITA CREAR LA CUENTA
				//. Crear un metodo publico - que retorne un valor booleano, si la persona es mayor de edad. (mayor o igual a 18 años)
				//. Si este metodo retorna V, se entra al la ejecución de abrir cuenta
				if (propietarioCuenta.esMayorEdad(edad)) {
					cuenta.abrirCuenta(propietarioCuenta, tipoCuenta, numeroCuenta, bancoCuenta);
				} else {
					System.out.println("*ERROR* No es posible abrir la cuenta a un menor de edad");
				}
			
			} else if (opcion == 2) {
				System.out.println("Has elegido Consignar");
				
				Movimiento consignacion = new Movimiento();
				consignacion.setTipoMovimiento("C");
				System.out.println("Valor a consignar: ");
				long valcon = entrada.nextLong();
				consignacion.setValor(valcon);
				
				cuenta.registrarMovimiento(consignacion);
		
			} else if (opcion == 3) {
				System.out.println("Has elegido Retirar");
				
				Movimiento retiro = new Movimiento();
				retiro.setTipoMovimiento("R");
				System.out.println("Valor a retirar: ");
				long valret = entrada.nextLong();
				retiro.setValor(valret);
				
				cuenta.registrarMovimiento(retiro);				
			
			
			} else if (opcion == 4) {
				System.out.println("Has elegido Listar Movimientos");
				
				cuenta.verMovimientos();		
			
			
			
			
			}else if(opcion == 6) {
				cuenta.mayorConsignacion();
			}else if(opcion == 7) {
				cuenta.mayorRetiro();
			}
			
			
			else if (opcion == 0) {
				System.out.println("Salir del sistema");
			}


		}
	
	}

}