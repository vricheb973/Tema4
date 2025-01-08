package actividades;

public class Actividad18 {

	public static void main(String[] args) {

		int enteros[] = {1,1,1,2,2,3};
		
		System.out.println(calculaModaInt(enteros));

	}
	
	// [1, 2, 2, 1, 1, 2, 2, 3]
	
	static int calculaModaInt(int array[]) {
		int moda = array[0];
		int contador = 0;
		
		for(int i=0; i<array.length; i++) {
			int repeticiones = 0;
			for(int j=0; j<array.length; j++) {
				if(array[i] == array[j]) {
					repeticiones++;
				}			
			}
			
			if(repeticiones > contador) {
				contador = repeticiones;
				moda = array[i];
			}
			
		}
		
		return moda;
	}

}
