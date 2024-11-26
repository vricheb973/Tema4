package diapositivas;

import java.util.Arrays;
import java.util.Scanner;

public class Diapositiva13 {

	public static void main(String[] args) {

		/*
		 * Crea tres tablas de cinco elementos: la primera de enteros, la segunda 
		 * de double y la tercera de booleanos. Intenta mostrarlas por pantalla.
		 */
		
		int[] enteros = new int[15];
		int[] enteros2 = new int[5];
		double decimales[] = new double[5];
		boolean booleanos[] = new boolean[5];

		System.out.println(Arrays.toString(enteros));
		System.out.println(Arrays.toString(enteros2));
		System.out.println(Arrays.toString(decimales));
		System.out.println(Arrays.toString(booleanos));
		
		System.out.println("Tamaño del array: " + enteros.length);
		

	}

}
