package englishexercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[]args) {
		
		//we create the scanner to read the console
		Scanner reader = new Scanner (System.in);
		
		//we create the table with a size of 10 numbers
		int numbers[] = new int[10];
		
		//we create a random class
		Random random = new Random();
		
		//we create a String to recieve the answer
		String respuesta = "";
		
		//created vairables for values and spaces
		int value = 0;
		int space = 0;
		
		try {
		//we create a do to repeat until c is pressed
		do {
		//We ask him to choose a option of those ones
		System.out.println("a. Show values");
		System.out.println("b. Introduce a values");
		System.out.println("c. Exit");
		respuesta = reader.next();
		
		switch (respuesta) {
			case "a" :
				
				System.out.println(Arrays.toString(numbers));
				
			break;
			case "b" :
					
					System.out.println("Dime el valor : ");
					value = reader.nextInt();
					
					System.out.println("Dime el espacio : ");
					space = reader.nextInt();
					
					numbers[space] = value;
				
			break;
			case "c" : System.out.println("Cerro el programa.");
			break;
			}
		} while (respuesta.equals("a") || respuesta.equals("b"));
		
		System.out.println(Arrays.toString(numbers));
		
		} catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        } finally {
        	
	//we close the scanner
	reader.close();
	
        }
	}
}
