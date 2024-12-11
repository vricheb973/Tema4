package actividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actividad19 {

	public static void main(String[] args) {
		
		int fibonacci[] = calculaFibonacci(7);
		
		System.out.println(Arrays.toString(fibonacci));
		
		int fibonacciInverso[] = calculaFibonacciInverso(17);
		
		System.out.println(Arrays.toString(fibonacciInverso));

		
		
	}
	
	static int[] calculaFibonacci(int n) {
		int fibonacci[] = new int[n+1];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i=2; i<fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		
		return fibonacci;
	}
	
	static int[] calculaFibonacciInverso(int n) {
		int fibonacci[] = calculaFibonacci(n);
		
		fibonacci[0] = fibonacci[fibonacci.length-1];
		fibonacci[1] = fibonacci[fibonacci.length-2];
		
		for(int i=2; i<fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-2] - fibonacci[i-1];
		}
		
		
		return fibonacci;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
