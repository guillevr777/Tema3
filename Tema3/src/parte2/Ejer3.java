package parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {

		// creamos el escaner
		Scanner reader = new Scanner(System.in);

		// creamos un random para dar valores aleatorios
		Random random = new Random();

		// creo las tablas
		int tablaUno[] = new int[30];

		try {
			// asignamos valores a la tabla entre 0 y 9
			for (int i = 0; i < tablaUno.length; i++) {

				tablaUno[i] = random.nextInt(1, 31);

			}

			// Ordenamos la tabla
			Arrays.sort(tablaUno);

			// decimos por pantalla la tabla ordenada
			System.out.println(Arrays.toString(tablaUno));

		} catch (InputMismatchException e) {
			System.out.println("Error: Por favor ingrese un número válido.");
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
		} finally {

			// cerramos el escaner
			reader.close();

		}
	}
}
