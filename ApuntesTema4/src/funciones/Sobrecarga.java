package funciones;

import java.util.Scanner;

public class Sobrecarga {

	public static void main(String[] args) {
		
		sumaPonderada(9, 1.0, 8, 9.0);
		
	}
	
	//Sobrecargo alterando el orden de los parámetros (no tiene sentido)
	static double sumaPonderada(int nota1, double pond1, int nota2, double pond2) {
		return nota1 * pond1 + nota2 * pond2;
	}
	
	static double sumaPonderada(int nota1, int nota2, double pond1, double pond2) {
		return nota1 * pond1 + nota2 * pond2;
	}	
	
	//Sobrecargo cambiado el número de parámetros
	static int suma(int a, int b) {
		return a+b;
	}
	
	static int suma(int a, int b, int c) {
		return a+b+c;
	}
	
	//Sobrecargo cambiando el tipo de los parámetros
	static int sumaUno(int a) {
		return a+1;
	}
	
	static int sumaUno(double a) {
		return (int) a+1;
	}

}
