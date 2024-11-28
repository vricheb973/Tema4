package diapositivas;

import java.util.Arrays;
import java.util.Random;

public class Diapositiva20 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int inicio = 1;
		int fin = 100;
		
		int numeros[] = new int[10]; //[0,0,0,0,0,0,0,0,0,0] Inicializa a 0 por defecto
		
		// Utilizo un for clásico porque voy a escribir cada elemento del array
		for(int i=0; i<numeros.length; i++) { //i-> 0 1 2 3 4 5 
			numeros[i] = random.nextInt(inicio, fin+1);
		}
		
		System.out.println(Arrays.toString(numeros));
		
		int suma = 0;
		
		// Utilizo un for extendido porque voy a leer cada elemento del array 
		// y no necesito saber la posición de cada uno
		for(int elem : numeros) {
			suma = suma + elem;
		}
		
		System.out.println("La suma de los elementos es: " + suma);
		
	}

}
