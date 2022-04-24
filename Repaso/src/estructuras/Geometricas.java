package estructuras;

import java.util.Scanner;

public class Geometricas {
	//Definición de variables
	static Scanner entrada = new Scanner(System.in);
		
	public Geometricas() {}

	public static void main(String[] args) {
		System.out.println("\t************************");
		System.out.println("\t******  M E N U   ******");
		System.out.println("\t************************");
		System.out.println("\t1. Figura1");
		System.out.println("\t2. Figura2");
		System.out.println("\t3. Figura3");
		System.out.println("\t************************");
		System.out.println("\tIngrese su opción: ");
		Integer opcion  = entrada.nextInt();
		
		//case
		switch (opcion) {
		case 1: dibujarFigura1();
		break;
		case 2:
			dibujarFigura2();
		break;
		case 3:
			dibujarFigura3();
		break;
		
		default: opcionErrada();
		break;
		}
		
	}


	private static void dibujarFigura1() {
		int tam, fila, col;
		String caract;
		
		System.out.println("\tTamaño:");
		tam = entrada.nextInt();
		
		System.out.print ("\n");
		
		System.out.println("\tCaracter:");
		caract = entrada.next();
		

		for (fila=1; fila <=tam; fila++) {
			for (col=1; col <=tam; col++) {
				System.out.print(caract+" ");
			}	
			System.out.println("");
		}
		
	}
	
	private static void dibujarFigura2()
	{
		
		//paralelogramo
		int n, fila, col;
		String caract;
		
		System.out.println("\tTamaño:");
		n = entrada.nextInt();
		
		System.out.print ("\n");
		
		System.out.println("\tCaracter:");
		caract = entrada.next();
		
		
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j>0; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print(" "+caract);
			}
			System.out.println();
		}
		
		
	}
	
	private static void dibujarFigura3()
	{
		//triangulo de base n
		int n, fila, col;
		String caract;
		
		System.out.println("\tTamaño:");
		n = entrada.nextInt();
		
		System.out.print ("\n");
		
		System.out.println("\tCaracter:");
		caract = entrada.next();
		
		
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" "+caract);
			}
			System.out.println();
		}
		
		
	}

	private static void opcionErrada() {
		System.out.println("\tIngresaste una opción errada");
	}

}