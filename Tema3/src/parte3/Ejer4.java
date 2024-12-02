package parte3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//creamos contadores
		int contadorUno = 0;
		int contadorDos = 0;
		int contadorTres = 0;
		
		//creamos la tabla
		int tabla[][] = new int[10][10];
		
		//creamos el for para establecer los valores de las filas y columnas con las variables de for i e a
		for (int i = 0 ; i < tabla.length ; i++) {
			
			contadorUno++;
			
			for (int a = 0 ; a < 10 ; a++) {
				
				contadorDos++;
				tabla[i][a] = contadorUno*contadorDos;
				
			}
			contadorDos = 0;
		}
		
		for (int i = 0 ; i < tabla.length ; i++) {
			System.out.println("Tabla del " + (i+1));
			for (int a = 0 ; a < 10 ; a++) {
				contadorTres++;
				System.out.println((i+1) + " * " + (contadorTres) + " = " + tabla[i][a]);
			}
			contadorTres = 0;
		}
		
		//mostramos por consola la tabla
		System.out.println(Arrays.deepToString(tabla));
		
	//cerramos el escaner
	reader.close();
	}
}
