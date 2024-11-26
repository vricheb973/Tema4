package diapositivas;

public class Diapositiva20 {

	public static void main(String[] args) {
		
		sumaImprime(2, 3);
		
		int radio = suma(2, 3);
		
		Diapositiva19.calculaCilindro(1, radio, 9);

	}
	
	static int suma(int a, int b) {		
		return a+b;
	}
	
	static void sumaImprime(int a, int b) {		
		int c = a+b;
		
		System.out.println(c);
	}

}
