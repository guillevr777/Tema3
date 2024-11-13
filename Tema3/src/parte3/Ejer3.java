package parte3;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		//creamos las variables para almacenar el valor de filas y columnas
		int filas;
		int columnas;
		
		//preguntamos por el valor de las filas y columnas
		System.out.println("Dime cuantas filas :");
		filas = reader.nextInt();
		System.out.println("Dime cuantas columnas :");
		columnas = reader.nextInt();
		
		//creamos la tabla
		int tabla[][] = new int[filas][columnas];
		
		
	}

}
