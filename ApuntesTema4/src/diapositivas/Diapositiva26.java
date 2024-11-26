package diapositivas;

public class Diapositiva26 {

	public static void main(String[] args) {

		System.out.println();

	}
	
	static int divisoresPrimos(int numero) {
		int divisores = 0;
		
		for(int i=2; i<=numero; i++) {
			if(numero%i == 0 && Diapositiva25.esPrimo(i)) {
				divisores++;
			}
		}
		
		return divisores;
	}

}
