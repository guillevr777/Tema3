package parte6;

import java.util.Arrays;
import java.util.Scanner;

public class ejer3 {
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//craamos un booleano para contener el resultado de la funcion
		int resultado[];
		
		//creamos una tabla
		int tabla[] = {1 ,2 ,3 ,4,5 ,5 ,7 ,8,9 ,10 ,11 ,12,13 ,14 ,15 ,16};
		
		//llamamos a la funcion se la asignamos al booleano resultado y lo decimos por consola
		resultado = cambio(tabla);
		
		System.out.println(Arrays.toString(resultado));
		
		//cerramos el escaner
		reader.close();
	}
	//creamos la funcion buscar
	static int[] cambio(int t[]) {
		try (Scanner reader = new Scanner(System.in)) {
			int tab[] = t;
			
			for (int i = 0 ; i < t.length ; i++) {
				for (int j = 0 ; j < t.length ; j++) {
					
				}
			}
			
			//devolvemos la funcion
			return tab;
		}
	}
}
