package parte4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
	
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);

		int tabla[] = {1, 2 , 3, 4, 5, 2, 2, 1, 1, 5, 2, 4, 3, 1, 2};
		
		System.out.println("Dime un valor a buscar:");
		int clave = reader.nextInt();
		
		int resultado = buscar(tabla, clave);
		
		
		
		//System.out.println(Arrays.toString());
		//System.out.println();
			
	}
	public static int buscar(int[] t, int clave) {
        for (int i = 0; i < t.length; i++) {
        	
            if (t[i] == clave) {
                
            	
            	
            }
        }
        return -1;
    }
	static int[] bucarTodos(int t[], int valor) {
		int tamaño = numVeces(t,valor);
		int[] tabla = new int [tamaño];
		
		return tabla;
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
