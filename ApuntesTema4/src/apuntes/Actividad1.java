package apuntes;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int entero;
		do {
			System.out.println("Dime un entero entre 3 y 6: ");
			entero = sc.nextInt();
		}while(entero < 3 || entero > 6);

	}
	
	static String validarString(String mensaje, int caracteres) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		do {
			System.out.println(mensaje);
			cadena = sc.next();
		}
		while(cadena.length() != caracteres);
		
		return cadena;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
