package parte5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {

		//funcion principal
		public static void main(String[] args) {
			
			//creamos el escaner
			Scanner reader = new Scanner(System.in);
			
			//creo una tabla bidimensional de 4 filas y 4 columnas
			int tabla[][] = new int[3][3];
			
			//creo una nueva tabla para almacenar el resulado de la funcion transposicion
			boolean resultado = simetrico(tabla);
			
			//creamos el for para recorrer la tabla y rellenar los valores que se digan por consola
			for (int i = 0 ; i < tabla.length ; i++) {
				for (int j = 0 ; j < tabla.length ; j++) {
		
					System.out.println("Dime un valor");
					tabla[i][j] = reader.nextInt();
							
				}
			}
			System.out.println(resultado);
		}
		//creo la funcion simetrico 
		static boolean simetrico(int t[][]) {
			
			//creamos un contador
			int contador = 0;
			
			//creamos un booleano para devolver a la funcion principal
			boolean sim = false;
			
			//creo un for para verificar los valores de la tabla
			for (int i = 0 ; i < t.length ; i++) {
				for (int j = 0 ; j < t.length ; j++) {
					if (t[j][i] == t[i][j]) {
						contador++;
					}
				}	
			}
			
			if (contador == t.length*t.length) {
				sim = true;
			} else {
				sim = false;
			}
			
			//creamos el return de la tabla que creamos para devolverla a la funcion principal
			return sim;
	}
}
