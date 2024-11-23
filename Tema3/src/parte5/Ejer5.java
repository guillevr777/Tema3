package parte5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {

			//funcion principal
			public static void main(String[] args) {
				
				//creamos el escaner
				Scanner reader = new Scanner(System.in);
				
				// creo una tabla bidimensional de 4 filas y 4 columnas
				int tabla[][] = {{1 ,2 ,3 ,4},{5 ,6 ,7 ,8},{9 ,10 ,11 ,12},{13 ,14 ,15 ,16}};
				
				//creo una nueva tabla para almacenar el resulado de la funcion transposicion
				int resultado[][] = gira90(tabla);
				
				System.out.println(Arrays.deepToString(resultado));
			}
			//creo la funcion simetrico 
			static int[][] gira90(int tablaInicio[][]) {
				int t[][] = new int[tablaInicio.length][tablaInicio.length];
				int contador = 0;
				int almacen = 0;
				
				for (int j = tablaInicio.length ; j > 0 ; j--) {
					for (int i = 0 ; j < tablaInicio.length ; j++) {
						
						t[i][j] = tablaInicio[contador][i];
					}
					contador++;
				}
				
		        return t;
		    }
}
