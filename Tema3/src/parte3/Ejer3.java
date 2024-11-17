package parte3;

import java.util.Arrays;
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
		
		//creamos el for para establecer los valores de las filas y columnas con las variables de for i e a
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int a = 0 ; a < columnas ; a++) {
				tabla[i][a] = (10*i)+a;
			}
		}
		
		//mostramos por consola la tabla
		System.out.println(Arrays.deepToString(tabla));
		
	//cerramos el escaner
	reader.close();
	}
}
