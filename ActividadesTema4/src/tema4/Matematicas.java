package tema4;

public class Matematicas {

	static boolean esPrimo(int numero) {
		boolean result = true;

		for (int i = 2; i < numero && result; i++) {
			if (numero % i == 0) {
				result = false;
			}
		}

		return result;
	}

	static int siguientePrimoRecursiva(int numero) {
		return esPrimo(numero + 1) ? numero + 1 : siguientePrimo(numero + 1);
	}

	static int siguientePrimo(int numero) {
		int result = numero + 1;

		while (!esPrimo(result)) {
			result++;
		}

		return result;
	}

	static int potencia(int base, int exponente) {
		int result = base;

		for (int i = 1; i < exponente; i++) {
			result *= base;
		}

		return result;
	}

	// potencia(base, exp) = base * potencia(base, exp-1)
	// 2^4 = 2 * 2^3
	// 2^3 = 2 * 2^2
	// 2^2 = 2 * 2^1
	// 2^1 = 2
	// 2^0 = 1

	static int potenciaRecursiva(int base, int exponente) {
		if (exponente == 1) {
			return base;
		}

		return base * potenciaRecursiva(base, exponente - 1);
	}

	static int digitos(int numero) {
		int contador = 0;

		for (int i = numero; i > 0; i = i / 10) {
			contador++;
		}

//		while(numero>0) {
//			contador++;
//			
//			numero=numero/10;
//		}

		return contador;
	}

	static int digitosRecursivo(int numero) {
		if (numero == 0) {
			return 0;
		}

		return 1 + digitos(numero / 10);
	}

	static int voltea(int numero) {
		int result = 0;

		for (int i = numero; i > 0; i = i / 10) {
			int digito = i % 10;
			result = result * 10 + digito;
		}

		return result;
	}

	static boolean esCapicua(int numero) {
		return numero == voltea(numero);
	}

	static int digitoN(int numero, int posicion) {
		int result = 0;
		int pos = 0;
		numero = voltea(numero);
		
		for (int i = numero; i > 0; i = i / 10) {
			int digito = i % 10;
			if (pos == posicion) {
				result = digito;
			}pos++;

		}
		
		return result;
	}
	
	static int digitoN2(int numero, int posicion) {
		for(int i=posicion; i != digitos(numero)-1; numero/=10) {
			
		}
		return numero%10;
	}
	
	static int digitoN3(int numero, int posicion) {
		numero = numero / (int) potencia(10, digitos(numero)-1-posicion);
		return numero%10;
	}

}
