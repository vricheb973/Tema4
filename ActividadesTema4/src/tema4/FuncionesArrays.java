package tema4;

import java.util.Random;

public class FuncionesArrays {
	
	static int[] generaArrayInt(int tamano, int min, int max) {
		int array[] = new int[tamano];
		Random random = new Random();
		
		for(int i=0; i<array.length; i++) {
			array[i] = random.nextInt(min, max+1);
		}
		
		return array;
	}
	
	static int maximo(int array[]) {
		int maximo = array[0];
		
		for(int elem : array) {
			if(elem > maximo) {
				maximo = elem;
			}
		}
		
		return maximo;
	}
	
	static int minimo(int array[]) {
		int minimo = array[0];
		
		for(int elem : array) {
			if(elem < minimo) {
				minimo = elem;
			}
		}
		
		return minimo;
	}
	
	static double mediaArrayInt(int array[]) {
		double media = 0.0;
		
		for(int elem : array) {
			media = media + elem;
		}
		
		media = media / array.length;
		
		return media;
	}
	
	static boolean estaEnArrayInt(int array[], int numero) {
		boolean encontrado = false;
		
		for(int i=0; i<array.length && !encontrado; i++) {
			if(array[i] == numero) {
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	static int posicionEnArrayInt(int array[], int numero) {
		int posicion = -1;
		
		for(int i=0; i<array.length && posicion == -1; i++) {
			if(array[i] == numero) {
				posicion = i;
			}
		}
		
		return posicion;
	}
	
	static int[] volteaArrayInt(int array[]) {
		int arrayVolteado[]=new int[array.length];
		int desdeAtras=array.length-1;
		
		for(int i=0;i<array.length;i++) {
			arrayVolteado[i]=array[desdeAtras];
			desdeAtras--;
		}
		
		return arrayVolteado;
	}

	static void desplazaUnoDerecha(int array[]) {
		int ultimo = array[array.length-1];
		for(int i=array.length-1; i>=1; i--) {
			array[i] = array[i-1];
		}
		array[0] = ultimo;
	}

	static void desplazaUnoIzquierda(int array[]) {
		int primero = array[0];
		for(int i=0; i<array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1] = primero;
	}
	
	static void desplazaDerechaArrayInt(int array[], int n) {
		for(int i=0; i<n; i++) {
			desplazaUnoDerecha(array);
		}
	}

	static void desplazaIzquierdaArrayInt(int array[], int n) {
		for(int i=0; i<n; i++) {
			desplazaUnoIzquierda(array);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
