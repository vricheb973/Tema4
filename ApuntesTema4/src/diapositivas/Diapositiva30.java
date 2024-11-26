package diapositivas;

public class Diapositiva30 {

	public static void main(String[] args) {

		

	}

	static int maximo(int a, int b) {
		int result = a;
		
		if(b>a) {
			result = b;
		}
		
		return result;
	}
	
	static int maximo(int a, int b, int c) {		
		return maximo(maximo(a, b), c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
