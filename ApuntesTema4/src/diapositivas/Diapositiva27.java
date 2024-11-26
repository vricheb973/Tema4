package diapositivas;

public class Diapositiva27 {

	public static void main(String[] args) {

		System.out.println(calculadora(1.0, 0.0, 4));

	}
	
	static double calculadora(double numero1, double numero2, int operacion) {
		double resultado = 0.0;
		
		switch(operacion) {
		case 1:
			resultado = numero1 + numero2;
			break;
		case 2:
			resultado = numero1 - numero2;
			break;
		case 3:
			resultado = numero1 * numero2;
			break;
		case 4: 
			resultado = numero1 / numero2;
			break;
		}
		
		return resultado;
	}

}
