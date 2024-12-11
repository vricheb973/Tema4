package apuntes;

import java.util.Arrays;
import java.util.Scanner;

public class RepasoExamen {

	public static void main(String[] args) {

		//Declaración arrays
		int enteros[] = new int[5];
		enteros[0] = 5;
		enteros[1] = 6;		
		
		//Solo podemos inicializar de esta manera en el momento de la declaración
		int enteros2[] = {5,6,9,8,5,4,5};		
		
		//Otros tipos de Arrays
		
		String colores[] = {"verde", "rojo", "amarillo"};
		
		double puntuaciones[] = {1.75, 10.0, 9.5};
		
		//Esto no tiene sentido, pero podemos crear arrays de cualquier tipo
		Scanner scanners[] = {new Scanner(System.in), new Scanner(System.in)};
		
		//La clase Arrays
		int numeros[] = {5,6,9,8,7,4,5,6};
		
//		System.out.println(Arrays.toString(numeros));
//		
//		Arrays.sort(numeros);
//
//		System.out.println(Arrays.toString(numeros));
//		
//		System.out.println(Arrays.binarySearch(numeros, 9));
		
		int numeros2[] = Arrays.copyOf(numeros, numeros.length);		
		
		//Recorrido
		int numeros3[] = {4,9,6,5,6,8,7,4};
		System.out.println(Arrays.toString(numeros3));		
		
		//For y foreach
		//El for clásico se usa cuando vamos a leer, 
		// pero necesitamos conocer la posición de cada elemento
		System.out.print("[");
		for(int i=0; i<numeros3.length; i++) {
			if(i < numeros3.length-1) {
				System.out.print(numeros3[i] + ", ");
			}
			else {
				System.out.print(numeros3[i]);
			}	
		}
		System.out.println("]");
		
		
		//En el for extendido no podemos saber la posición de los elementos
		System.out.print("[");
		for(int elem : numeros3) {
			System.out.print(elem + " ");
		}
		System.out.println("]");
		
		//Modificar datos del array
		String letras[] = {"A", "B", "C"};
		
		//El for extendido se usa solo para leer elementos de un array
		for(String letra : letras) {
			letra = "A";
		}
		
		//For clásico se usa para modificar elementos de un array
		for(int i=0; i<letras.length; i++) {
			letras[i] = "A";			
		}
		
		System.out.println(Arrays.toString(letras));
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
