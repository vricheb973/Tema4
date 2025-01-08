package actividades;

import java.util.Arrays;

public class Actividad17 {

	public static void main(String[] args) {

		int enteros[] = {1,1,1,2,2,3};

		System.out.println(medianaArrayInt(enteros));

	}
	
	static int medianaArrayInt(int array[]) {
		int posicion = (array.length-1) / 2;
		Arrays.sort(array);
		
		return array[posicion];
	}

}
