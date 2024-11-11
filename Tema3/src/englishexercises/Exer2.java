package englishexercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[]args) {
		
		//we create the scanner to read the console
		Scanner reader = new Scanner (System.in);
		
		//we create the table with a size of 10 numbers
		int numbers[] = new int[10];
		
		//created vairables for values and spaces
		int value = 0;
		int incremento = 0;
		
		//dime el valor que quieres que tenga la tabla y cuanto se suma secuencialmente
		System.out.println("Dime un valor :");
		value = reader.nextInt();
		
		System.out.println("Dime cuanto se sumara por casilla : ");
		incremento = reader.nextInt();
		
		for (int i = 0 ; i < numbers.length ; i++) {
			
			numbers[i] = value;
			
			value += incremento;
			
		}

		System.out.println(Arrays.toString(numbers));
		
	//we close the scanner
	reader.close();
	}
}