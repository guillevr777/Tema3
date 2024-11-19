package parte4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
	
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);

		//creamos la tabla
		int tabla[] = {1, 2 , 3, 4, 5, 2, 2, 1, 1, 5, 2, 4, 3, 1, 2};
		
		//pedimos el valor
		System.out.println("Dime un valor a buscar:");
		int valor = reader.nextInt();
		
		//creamos tabla con los valores de la funcion buscarTodos
		int[] indices = buscarTodos(tabla, valor);
		
		//nos aseguramos de que la tabla tenga minimo 1 valor
		if (indices.length == 0) {
			System.out.println("No se encuentra el valor");
		} else {
			System.out.println("DIcho valor se encuentra en :" + Arrays.toString(indices));
		}
		//cerramos el escaner
		reader.close();
	}
	//creamos la funcion buscarTodos para encontrar todos los indices con dicho valor
	static int[] buscarTodos(int t[], int valor) {
		
		//creamos variable tamaño para crear la tabla con una longitud especifica
		int tamaño = numVeces(t,valor);
		
		//si es 0 devuelve tabla vacia
		if (tamaño == 0) {
			return new int[0];
		}
		
		//sino crea tabla con la medida 
		int[] indices = new int [tamaño];
		int indiceActual = 0;
		
		//creamos for para recorrer la tabla , en caso de encontrar un valor igual al buscado guarda el indice en la tabla
		for (int i = 0 ; i < t.length ; i++) {
			if (t[i] == valor) {
				indices[indiceActual] = i;
				indiceActual++;
			}
		}
		//devuelve la tabla indices
		return indices;
	}
	//creamos una funcion para contar el numero de indices que cuentan con el valor que queremos
	static int numVeces(int t[], int valor) {
		//se crea un contador 
		int contador = 0;
		
		//creamos un for para recorrer la tabla e incrementar el valor del contador en caso de encontrar el valor buscado
		for (int contenido : t) {
			if (contenido == valor) {
				contador++;
			}
		}
		//se devuelve el valor del contador
		return contador;
	}
}
