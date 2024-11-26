package funciones;

public class Main {

	public static void main(String[] args) {		

		int numero = 1;
		
		System.out.println(sumaUno(numero));
		
	}
	
	static int sumaUno(int n) {
		n++;
		
		return n;
	}
	
	static void variosSaludos(int v) {
		System.out.printf("Voy a saludar %d veces \n", v);
		for(int i=0; i<v; i++) {			
			System.out.println("Hola. ");
		}
	}
	
	static void cuatroSaludos() {
		System.out.println("Voy a saludar 4 veces");
		for(int i=0; i<4; i++) {			
			System.out.println("Hola. ");
		}
	}

}
