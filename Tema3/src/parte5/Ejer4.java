package parte5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {

	// funcion principal
	public static void main(String[] args) {

		// creamos el escaner
		Scanner reader = new Scanner(System.in);

		// creo una tabla bidimensional de 4 filas y 4 columnas
		int tabla[][] = {{4 ,9 ,2},{3 ,5 ,7},{8 ,1 ,6}};

		// creo una nueva tabla para almacenar el resulado de la funcion transposicion
		boolean resultado = esMagica(tabla);

		//creamos un for para imprimir la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {

				System.out.print(tabla[i][j]);
			}
			System.out.println();
		}
		System.out.println(resultado);
	}

	// creo la funcion simetrico
	static boolean esMagica(int t[][]) {

		// creamos un booleano para devolver a la funcion principal
		boolean magico = true;

		// suma de filas
		int filas = 0;
		
		//creamos contadores
		int contadorF = 0;
		int contadorC = 0;
		int sumaActualFila = 0;
		int sumaActualColumna = 0;

		//creo un for para coger el valor de la primera fila
		for (int i = 0; i < t.length; i++) {
			filas += t[0][i];
		}
		
		 // Verificar si todas las filas suman lo mismo
        while (contadorF < t.length && magico) {
            sumaActualFila = 0;
            contadorC = 0;
            while (contadorC < t[contadorF].length) {
                sumaActualFila += t[contadorF][contadorC];
                contadorC++;
            }
            if (sumaActualFila != filas) {
            	magico = false;
            }
            contadorF++;
        }

        // Verificar si todas las columnas suman lo mismo
        if (magico) {
        	contadorC = 0;
            while (contadorC < t[0].length && magico) {
                sumaActualColumna = 0;
                contadorF = 0;
                while (contadorF < t.length) {
                    sumaActualColumna += t[contadorF][contadorC];
                    contadorF++;
                }
                if (sumaActualColumna != filas) {
                	magico = false;
                }
                contadorC++;
            }
        }


        // Finalmente, devolvemos el resultado
        return magico;
    }
}