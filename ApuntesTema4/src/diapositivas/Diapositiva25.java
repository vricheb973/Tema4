package diapositivas;

public class Diapositiva25 {

	public static void main(String[] args) {

		

	}
	
	static boolean esPrimo(int n) {
		boolean result = true;
		
		for(int i=2; i<=Math.sqrt(n) && result; i++) {
			if(n%i==0) {
				result = false;
			}
		}
		
		return result;
	}


}
