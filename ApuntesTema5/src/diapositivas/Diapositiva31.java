package diapositivas;

public class Diapositiva31 {

	public static void main(String[] args) {

		int numeros[] = {45,65,4,86,4,4,55,6,7,441,56};
		
		System.out.println(buscar(numeros, 4));
	}
	
	static int buscar(int t[], int clave) {
		int result = -1;
		boolean encontrado = false;
		
		for(int i=0; i<t.length && !encontrado; i++) {
			if(t[i] == clave) {
				result = i;
				encontrado = true;
			}
		}
		
		return result;
	}

}
