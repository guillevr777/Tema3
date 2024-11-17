package englishexercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer3 {

	public static void main(String[]args) {
		
		//we create the scanner to read the console
		Scanner reader = new Scanner (System.in);
		
		//created vairables for values and spaces
		int value = 0;
		int incremento = 0;
		int length = 0;
		
		try {
		//Tell me the number of number u want the table , the value and the increment we need to add to the value per number of the table
		System.out.println("Dime un valor :");
		value = reader.nextInt();
		
		System.out.println("Dime cuanto se sumara por casilla : ");
		incremento = reader.nextInt();
		
		System.out.println("Dime cuantos numeros tendra la tabla : ");
		length = reader.nextInt();
		
		//we create the table with a size of 10 numbers
		int numbers[] = new int[length];
		
		//we create a for to increise the number value and to insert it to the table 1 by 1 at least to the length that the user have said
		for (int i = 0 ; i < numbers.length ; i++) {
			
			numbers[i] = value;
			
			value += incremento;
			
		}
		
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
