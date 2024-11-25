package parte6;

import java.util.Arrays;
import java.util.Scanner;

public class ejer2 {

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
			int valor = 0;
			int posicion = 0;
			boolean respuesta = true;
			int verificar = 0;
			
			while (respuesta) {
				valor = 0;
				posicion = 0;
				
				System.out.println("Dime una posicion a cambiar el valor:");
				posicion = reader.nextInt();
				System.out.println("Dime el valor a cambiar:");
				valor = reader.nextInt();
				tab[posicion] = valor;
				System.out.println("Quieres cambiar mas valores? 0:NO / 1:SI");
				verificar = reader.nextInt();
				if (verificar == 0) {
					respuesta = false;
				}
			}
			
			//devolvemos la funcion
			return tab;
		}
	}
}
