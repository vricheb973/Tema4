package tema5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int numeros[] = {1,2,3,4};
		
		System.out.println(Arrays.toString(numeros));
		
		FuncionesArrays.desplazaUnoIzquierda(numeros);
		
		System.out.println(Arrays.toString(numeros));
		
	}

}
