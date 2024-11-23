package parte5;

import java.util.Arrays;

public class Ejer5Corregido {
	//funcion principal
	public static void main(String[] args) {
		
		// creo una tabla bidimensional de 4 filas y 4 columnas
		int tabla[][] = {{1 ,2 ,3 ,4},{5 ,6 ,7 ,8},{9 ,10 ,11 ,12},{13 ,14 ,15 ,16}};
		
		//creo una nueva tabla para almacenar el resulado de la funcion transposicion
		int resultado[][] = gira90(tabla);
		
		System.out.println("Tabla convertida:");
		System.out.println();
		//imprimimos la tabla
		for (int i = 0; i < tabla.length ; i++) {
            for (int j = 0; j < tabla.length ; j++) {
                System.out.print(resultado[i][j] + "   ");
            }
            System.out.println();
        }
	}
	//creo la funcion simetrico 
	static int[][] gira90(int tablaInicio[][]) {
		int t[][] = new int[tablaInicio.length][tablaInicio.length];
		
		//pasamos los valores de una tabla a otra mediante la funcion usando for 
		for (int i = 0; i < tablaInicio.length ; i++) {
            for (int j = 0; j < tablaInicio.length ; j++) {
                t[j][tablaInicio.length - 1 - i] = tablaInicio[i][j]; 
            }
        }
		//devolvemos la tabla
        return t;
    }
}