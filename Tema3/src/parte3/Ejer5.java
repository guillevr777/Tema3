package parte3;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		//creamos el random
		Random random = new Random();
		
		//creamos la variable que contendra el resultado de la tabla
		int resultado = 0;
		
		//suma filas
		int filas = 0;
		
		//suma columnas 
		int columnas = 0;
		
		//creamos el array
		int tabla[][] = new int[4][5];
		
		//creamos el for para generar los numeros de 100 a 1000 y ubicarlos en sus posiciones pertinentes 
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int a = 0 ; a < tabla[i].length ; a++) {
				tabla[i][a] = random.nextInt(100,1000);
				resultado += tabla[i][a];
			}
		}
		//creamos el for para mostrar la tabla
		for (int i = 0 ; i < tabla.length ;i++) {
			filas = 0;
			for (int j = 0 ; j < tabla[i].length ; j++) {
				System.out.print(tabla[i][j] + "\t");
				filas += tabla[i][j];
			}
			System.out.print("Fila: " + filas);
			System.out.println();
		}
		//creamos el for para mostrar los resultados en la tabla
		for (int i = 0 ; i < tabla[i].length ; i++) {
			columnas = 0;
			for (int a = 0 ; a < tabla.length ; a++) {
				columnas += tabla[i][a];
				}
				System.out.print("Cl:" + columnas + " ");	
			}
		System.out.print("Total : " + resultado);
	}
}
