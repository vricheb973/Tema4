package diapositivas;

public class Diapositiva18 {

	public static void main(String[] args) {
		
		numerosComprendidos(3, 9);

	}
	
	static void numerosComprendidos(int inferior, int superior) {
		for(int i=inferior+1; i<superior; i++) {
			System.out.println(i);
		}
	}

}
