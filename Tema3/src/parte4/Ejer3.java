package parte4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
	
	public static void main(String[] args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
				
		//pedimos la longitud de la tabla y el fin
		System.out.println("Dime la longitud de la tabla");
		int longitud = reader.nextInt();
		
		System.out.println("Dime el numero mas grande posible");
		int fin = reader.nextInt();
		
		int[] tabla = rellenaPares(longitud , fin);

		//imprimimos el resultado
		System.out.println("Tabla con numeros pares : ");
		
		 for (int i = 0; i < tabla.length; i++) {
	            System.out.print(tabla[i] + " ");
	        }
	}
	
	static int []rellenaPares(int longitud , int fin) {

		//creamos el random
		Random random = new Random();
		
		//llenamos la tabla con la longitud que diga el usuario
		int tabla[] = new int[longitud];
		
		//generamos los numeros aleatorios
		for (int i = 0 ; i < longitud ; i++) {
			
			int numeroRandom = 0;
			
			numeroRandom = random.nextInt(2,(fin-1));
			
			if (numeroRandom % 2 != 0) {
				numeroRandom++;
				}
			tabla[i] = numeroRandom;
			}
		Arrays.sort(tabla);
		//devolemos la tabla
		return tabla;
	}
}
