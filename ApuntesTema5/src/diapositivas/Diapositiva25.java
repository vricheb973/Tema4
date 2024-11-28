package diapositivas;

import java.util.Arrays;
import java.util.Random;

public class Diapositiva25 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(rellenaPares(5, 120)));
		
	}

	static int[] rellenaPares(int tamano, int fin) {
		int[] tabla = new int[tamano];
		for (int i = 0; i < tabla.length; i++) {
			Random random = new Random();
			int numero;
			do {
				numero=random.nextInt(2,(fin + 1));
				if (numero % 2 ==0) {
					tabla[i]= numero;
					
				}
			}while(numero%2!=0);
			
		}
		Arrays.sort(tabla);
		return tabla;
	}
}
