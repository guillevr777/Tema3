package parte5;

import java.util.Arrays;
import java.util.Random;

public class Ejer2 {

	//funcion principal
	public static void main(String[] args) {

		//contador inicializado a 0
		int contador = 0;
		
		//creo una tabla bidimensional de 4 filas y 4 columnas
		int tabla[][] = new int[4][4];
		
		//creo una nueva tabla para almacenar el resulado de la funcion transposicion
		int resultado[][] = transposicion(tabla);
		
		//rellenamos la tabla con numeros del 1 al 16 con el for y el contador
		System.out.println("Tabla original :");
		//creamos el for para recorrer la tabla en busca del minimo y maximo
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla.length ; j++) {
				
				contador++;
				tabla[i][j] = contador;
						
			}
			//voy imprimiendo las filas de la tabla	
			System.out.println(Arrays.toString(tabla[i]));

		}
		//imrpimimos las filas de la tabla transposicion
		System.out.println();
		System.out.println("Tabla transposicion :");
		System.out.println(Arrays.toString(resultado[0]));
		System.out.println(Arrays.toString(resultado[1]));
		System.out.println(Arrays.toString(resultado[2]));
		System.out.println(Arrays.toString(resultado[3]));
		
	}
	//creo la funcion transposicion 
	static int[][] transposicion(int t[][]) {
		//creo una tabla para contener los valores 
		int tablaTrans[][] = new int[t.length][t.length];
		//creo un contador inicializado a 0
		int contador = 0;
		
		//creo un for para rellenar de forma inversa
		for (int i = 0 ; i < t.length ; i++) {
			for (int j = 0 ; j < t.length ; j++) {
				
				//incrementa contador por iteracion
				contador++;
				tablaTrans[j][i] = contador;
				
			}	
		}
		//creamos el return de la tabla que creamos para devolverla a la funcion principal
		return tablaTrans;
	}
}
