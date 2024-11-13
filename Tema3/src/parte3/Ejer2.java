package parte3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		//ceamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creo variables para almacenar nota minima media y maxima de los alumnos
		double notaMaxima = 0;
		double notaMinima = 10;
		double media = 0;
		int contador = 0;
		double mediaNotas;
		
		//creamos la tabla
		int tabla[][] = new int [4][5]; // {{}, {}, {}}
		
		try {
		System.out.println("Dime la nota de los alumnos.");
		//ppedimos por un for las notas de los alumnos para almacenarlos en la tabla
		for (int i = 0 ; i < tabla.length ; i++) {
			
			System.out.println("Alumno " + (i+1) + " :");
			
			for (int a = 0 ; a <= 4 ; a++) {
				
				System.out.println("Nota " + (a+1) + " :");
				tabla[i][a] = reader.nextInt();
				
				media += tabla[i][a];
				contador++;
				
				if (notaMaxima < tabla[i][a]) {
					notaMaxima = tabla[i][a];
				} 
				if (notaMinima > tabla[i][a]) {
					notaMinima = tabla[i][a];
				}
				
			}
		}
		//mostramos las notas por consola
		System.out.print("\t");
		for (int i = 1 ; i <= 5 ; i++) {
			System.out.print("\tNota " + i);
		}
		System.out.println();
		
		for (int i = 0 ; i < tabla.length ;i++) {
			System.out.print("Alumno " + (i+1) + "\t");
			for (int j = 0 ; j < tabla[i].length ; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		} catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        } finally {
		mediaNotas = media/contador;
		
		System.out.println("La media ha sido de " + mediaNotas + " , la maxima de " + notaMaxima + " y la minima de " + notaMinima);
        }
	}
}