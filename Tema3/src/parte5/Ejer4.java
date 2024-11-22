package parte5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {

	// funcion principal
	public static void main(String[] args) {

		// creamos el escaner
		Scanner reader = new Scanner(System.in);

		// creo una tabla bidimensional de 4 filas y 4 columnas
		int tabla[][] = {{4 ,9 ,2},{3 ,5 ,7},{8 ,1 ,6}};

		// creo una nueva tabla para almacenar el resulado de la funcion transposicion
		boolean resultado = esMagica(tabla);

		//creamos un for para imprimir la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {

				System.out.print(tabla[i][j]);
			}
			System.out.println();
		}
		System.out.println(resultado);
	}

	// creo la funcion simetrico
	static boolean esMagica(int t[][]) {

		// creamos un booleano para devolver a la funcion principal
		boolean magico = true;

		// suma de filas y columnas
		int columnas = 0;
		int filas = 0;
		int columna = 0;

		// creo un contador
		int contador = 0;

		//creo un for para coger el valor de la primera fila
		for (int i = 0; i < t.length; i++) {
			columna += t[i][0];
		}
		
		// creo un for para verificar los valores de la tabla
		while (contador == -1) {
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t.length; j++) {

					filas += t[i][j];

					columnas += t[j][i];

					if (columna != filas || columna != columnas) {
						magico = false;
						contador = -1;
					}
				}
			}
		}

		// creamos el return de la tabla que creamos para devolverla a la funcion
		return magico;
	}
}