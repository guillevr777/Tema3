package parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creo la variable para almacenar numero usuario
		int valor = 0;
		
		//creo las tablas 
		int tablaUno [] = new int [10];
		int tablaDos [] = new int [10];
		
		try {
		System.out.println("Dime los valores que quieres que tengan las tablas :");
		System.out.println("Tabla 1");
		for (int i = 0; i < tablaUno.length ; i++) {
		//pregunto al usuario por el valor
		System.out.println("Dime el " + (i+1) + " : ");
		valor = reader.nextInt();
		
		}
		System.out.println("Tabla 2");
		for (int i = 0; i < tablaDos.length ; i++) {
			//pregunto al usuario por el valor
			System.out.println("Dime el " + (i+1) + " : ");
			valor = reader.nextInt();
			}
				
		//Comparamos las tablas
		if (Arrays.equals(tablaUno, tablaDos)) {
			System.out.println("Ambas tablas son iguales");
		} else {
			System.out.println("Las tablas son distintas");
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