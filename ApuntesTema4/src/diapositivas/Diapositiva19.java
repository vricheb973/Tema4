package diapositivas;

public class Diapositiva19 {

	public static void main(String[] args) {
		
		calculaCilindro(5, 2, 4);

	}
	
	static void calculaCilindro(int opcion, double radio, double altura) {
		switch(opcion) {
			case 1:
				double area = 2 * Math.PI * radio * (altura + radio);
				System.out.printf("El área es %.2f \n", area);
				break;
			case 2:
				double volumen = Math.PI * Math.pow(radio, 2) * altura;
				System.out.printf("El volumen es %.2f \n", volumen);
				break;
			default:
				System.out.println("Opción incorrecta");
				break;				
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
