package parte3;

import java.util.Arrays;

public class Ejer1 {

	public static void main(String[] args) {

		//creamos la tabla
		int tabla[][] = new int [3][6]; // {{}, {}, {}}
		
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;
		tabla[1][0] = 75;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;
				
		//Decimos la tabla por consola	
		System.out.println("Tabla:");
		for(int fila = 0; fila<tabla.length; fila++) {
			for(int col = 0; col<tabla[fila].length; col++) {
				System.out.print(tabla[fila][col] + " ");
			}
			System.out.println();
		}
	}
}