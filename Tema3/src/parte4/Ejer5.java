package parte4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
	
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);

		int tabla[] = {1, 2 , 3, 4, 5, 2, 2, 1, 1, 5, 2, 4, 3, 1, 2};
		
		System.out.println("Dime un valor a buscar:");
		int valor = reader.nextInt();
		
		int[] indices = buscarTodos(tabla, valor);
		
		if (indices.length == 0) {
			System.out.println("No se encuentra el valor");
		} else {
			System.out.println("DIcho valor se encuentra en :" + Arrays.toString(indices));
		}
		reader.close();
	}
	static int[] buscarTodos(int t[], int valor) {
		int tamaño = numVeces(t,valor);
		
		if (tamaño == 0) {
			return new int[0];
		}
		
		int[] indices = new int [tamaño];
		int indiceActual = 0;
		
		for (int i = 0 ; i < t.length ; i++) {
			if (t[i] == valor) {
				indices[indiceActual] = i;
				indiceActual++;
			}
		}
		
		return indices;
	}
	static int numVeces(int t[], int valor) {
		int contador = 0;
		
		for (int contenido : t) {
			if (contenido == valor) {
				contador++;
			}
		}
		return contador;
	}
}
