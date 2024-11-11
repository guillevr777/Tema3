package parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer7 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creo un contador
		int contador = 0;
		
		try {
		for (int a = 1 ; a < 11 ; a++) {
			
			//creo las tablas 
			int tablaUno [] = new int [a];
			contador++;
			
			//asignamos valores a la tabla
			for (int i = 0; i < contador ; i++) {
			
			tablaUno[i] = contador;
		
			}
		//decimos por pantalla la tabla ordenada
		System.out.println(Arrays.toString(tablaUno));
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
