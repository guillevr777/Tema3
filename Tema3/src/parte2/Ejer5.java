package parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos un random para dar valores aleatorios
		Random random = new Random();
		
		//variable que almacena numero consola
		int numero;
		
		//creo un contador
		int contador = 0;
		//creo las tablas 
		int tablaUno [] = new int [1000];
		
		try {
		//asignamos valores a la tabla entre 0 y 9
		for (int i = 0; i < tablaUno.length ; i++) {
			
			tablaUno[i] = random.nextInt(0,100);
		
		}
				
		//Ordenamos la tabla
		Arrays.sort(tablaUno);
		
		System.out.println("Dime un numero :");
		numero = reader.nextInt();
		
		int posicion = Arrays.binarySearch(tablaUno, numero);
		
		for (int i = 0 ; i < tablaUno.length ; i++) {
			
			if (tablaUno[i] == numero) {
			contador++;
			}
		}
 
		if (contador > 0) {
			System.out.println("Encontrado en el indice " + contador + " veces.");
		} else {
		System.out.println("No se encontro el numero.");
		}
		
		} catch (InputMismatchException e) {
			System.out.println("Error: Por favor ingrese un número válido.");
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
		} finally {
    	
	//cerramos el escaner
		reader.close();
		
    	}
	}
}