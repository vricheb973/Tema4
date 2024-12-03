package apuntes;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {

		String caracter = validarString("Dime un caracter: ", 1);

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
