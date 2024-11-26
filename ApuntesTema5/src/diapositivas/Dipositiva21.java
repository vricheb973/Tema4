package diapositivas;

import java.util.Scanner;

public class Dipositiva21 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime el tamaño del array: ");
		int tam = sca.nextInt();
		
		int numeros[] = new int[tam];
		
		for(int i=0; i<numeros.length; i++) {
			System.out.printf("Dime número %d: ", i+1);
			numeros[i] = sca.nextInt();			
		}

		int contPositivos = 0;
		int sumaPositivos = 0;
		int contNegativos = 0;
		int sumaNegativos = 0;
		int contCeros = 0;
		
		for(int elemento : numeros) {
			if(elemento == 0) {
				contCeros++;
			}
			else if(elemento > 0) {
				sumaPositivos += elemento;
				contPositivos++;
			}
			else {
				sumaNegativos += elemento;
				contNegativos++;
			}			
		}
		
		if(contPositivos > 0) {
			System.out.printf("Media positivos %.2f \n", sumaPositivos*1.0/contPositivos);
		}
		else if(contNegativos > 0) {
			System.out.printf("Media positivos %.2f \n", sumaNegativos*1.0/contNegativos);
		}
		
		System.out.println("Cantidad de ceros: " + contCeros);
		
		
	}

}
