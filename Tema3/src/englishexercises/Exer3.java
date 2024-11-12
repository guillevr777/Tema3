package englishexercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exer3 {
	public static void main(String[]args) {
		
		//we create the scanner to read the console
		Scanner reader = new Scanner (System.in);
		
		//creamos el random
		Random random = new Random();
		
		//created a boolean to know when can we continue the program or we need to restart it
		boolean continuar = true;
		
		//created vairables for values and spaces
		int value = 0;
		int incremento = 0;
		int length = 10;
		
		//created a variable to use the boolean
		int aleatorio;
		
		try {
		
		//we create the table with a size of 10 numbers
		int numbers[] = new int[length];
		
		while (continuar == false) {
			
			aleatorio = random.nextInt(0,10);
			numbers[aleatorio] = aleatorio;
		
		//pendiente de hacer
		if (numbers < 0) {
			
		}
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
