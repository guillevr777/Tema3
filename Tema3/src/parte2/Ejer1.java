package parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[]args) {
		
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
	
	//creo dos variables que recojan tanto el valor como el tamaño
	int tamaño;
	int valor = 0;
	
	try {
	//pregunto al usuario por el valor y el tamaño y se lo asigno a las variables correspondientes
	
	System.out.print("Dime el valor que quieres que tenga la tabla :");
	valor = reader.nextInt();
	
	System.out.print("Dime el tamaño que quieres que tenga la tabla :");
	tamaño = reader.nextInt();
	
	//creo la tabla 
	int numeros [] = new int [tamaño];
	
	Arrays.fill(numeros, valor);
	
	//Hago un syso para mostrar la tabla por consola
	System.out.println(Arrays.toString(numeros));
	
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
