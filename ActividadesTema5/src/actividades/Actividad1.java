package actividades;

import java.util.Arrays;

import tema5.FuncionesArrays;

public class Actividad1 {
	
	/*
	 * Escribe un programa que genere 20 números enteros aleatorios entre 0 
	 * y 100 y que los almacene en un array. El programa debe ser capaz de 
	 * pasar todos los números pares a las primeras posiciones del array (del 
	 * 0 en adelante) y todos los números impares a las celdas restantes. 
	 * Utiliza arrays auxiliares si es necesario.
	 */

	public static void main(String[] args) {
		
		int enteros[] = FuncionesArrays.generaArrayInt(20, 0, 100);
		
		System.out.println(Arrays.toString(enteros));
		
		int copiaEnteros[] = Arrays.copyOf(enteros, enteros.length);
		int p = 0;
		int i = enteros.length-1;
		
		for(int elem : copiaEnteros) {
			if(elem % 2 == 0) {
				enteros[p] = elem;
				p++;
			}
			else {
				enteros[i] = elem;
				i--;
			}
		}
		
		System.out.println(Arrays.toString(enteros));

	}
	
	

}
