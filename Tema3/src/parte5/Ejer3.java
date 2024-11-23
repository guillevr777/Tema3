package parte5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {

		//funcion principal
		public static void main(String[] args) {
			
			//creamos el escaner
			Scanner reader = new Scanner(System.in);
			
			// creo una tabla bidimensional de 4 filas y 4 columnas
			int tabla[][] = {{1 ,2 ,3},{2 ,4 ,5},{3 ,5 ,6}};
			
			//creo una nueva tabla para almacenar el resulado de la funcion transposicion
			boolean resultado = esSimetrica(tabla);
			
			System.out.println(resultado);
		}
		//creo la funcion simetrico 
		static boolean esSimetrica(int[][] matriz) {
			
			//creamos variable booleana para almacenar la respuesta 
			boolean esSimetrica = true;
			
	        //verificamos la simetria
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = i + 1; j < matriz[i].length; j++) {
	                if (matriz[i][j] != matriz[j][i]) {
	                    esSimetrica = false;
	                }
	            }
	        }
	        //devolvemos la funcion dando true o false
	        return esSimetrica;
	    }
}
