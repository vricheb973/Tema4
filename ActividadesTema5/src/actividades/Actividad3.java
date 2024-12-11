package actividades;

import java.util.Scanner;

import tema5.FuncionesArrays;

public class Actividad3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que rellene un array de 100 elementos con 
		 * números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
		 *  A continuación el programa mostrará el array y preguntará si el 
		 *  usuario quiere destacar el máximo o el mínimo. Seguidamente se 
		 *  volverá a mostrar el array escribiendo el número destacado entre 
		 *  dobles asteriscos.
		 */
		
		int enteros[] = FuncionesArrays.generaArrayInt(100, 0, 500);
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Maximo (M) o minimo (m): ");
		String letra = sca.next();		
		
		if(letra.equals("M")) {
			int maximo = FuncionesArrays.maximo(enteros);
			
			System.out.print("[");
			for(int i=0; i<enteros.length; i++) {
				if(enteros[i] == maximo) {
					System.out.print(" **" + enteros[i] + "** ");	
				}		
				else {
					System.out.print(enteros[i] + " ");
				}
			}
			System.out.println("]");
			
		}
		else if(letra.equals("m")) {
			
		}
		
		
		
		
		
		
		
		

	}

}
