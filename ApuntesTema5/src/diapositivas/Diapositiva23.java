package diapositivas;

import java.util.Arrays;

public class Diapositiva23 {

	public static void main(String[] args) {

		int enteros[] = {4,5,8,9,4,5,6,9};	
		
		imprimeArray(enteros);
		Arrays.sort(enteros);
		imprimeArray(enteros);
		
//		System.out.println(Arrays.toString(enteros));
//		imprimeArray(enteros);

	}
	
	static int maximo(int array[]) {
		int maximo = array[0];		
		
		for(int numero : array) {
			if(numero > maximo) {
				maximo = numero;
			}
		}

		return maximo;
	}
	
	static void imprimeArray(int array[]) {
		System.out.print("[");
		
		for(int i=0; i<array.length;i++) {
			if(i == array.length-1) {
				System.out.print(array[i]);
			}
			else {
				System.out.print(array[i] + ", ");
			}
		}
		
		System.out.println("]");
	}

}
