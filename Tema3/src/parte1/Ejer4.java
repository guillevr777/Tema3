package parte1;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		
		//creo una tabla y le asigno valores
		int numeros[] = new int[12];
		numeros[0] = 39;
		numeros[1] = -2;
		numeros[6] = 14;
		numeros[8] = 5;
		numeros[9] = 120;
		
		//Creo el for para que los ordene de menor a mayor
		for (int i = 0; i < numeros.length ; i++) {
			System.out.println(numeros[i]);
		}
		//cerramos el escnaer
		reader.close();
	}
}
