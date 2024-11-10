package parte2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creo las tablas 
		int tablaUno [] = new int [8];
		
		//asignamos valores a la tabla entre 0 y 9
		for (int i = 0; i < tablaUno.length ; i++) {
			
			System.out.println("Escribe puntuacion jugardor " + (i+1) + " : ");
			tablaUno[i] = reader.nextInt();
			
		}
				
		//Ordenamos la tabla
		Arrays.sort(tablaUno);
		
		//for para leer tabla de atras hacia alante
		for (int i = 7 ; i >= 0 ; i--) {
			
			System.out.print(tablaUno[i] + " ");
		}
		
		//cerramos el escaner
			reader.close();
	}
}
