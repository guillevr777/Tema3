package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[]args) {
	Scanner reader = new Scanner(System.in);
	
	double numeroU = 0;
	
	double numero [] = new double [5];
	
	for (int i=0 ; i<numero.length ; i++) {
		System.out.println("Dime un numero :");
		
		numeroU = reader.nextDouble();
		
		numero[i] = numeroU;
		}
	for (int i = 0 ; i<numero.length ; i++) {
		
		System.out.println(numero[i]);
		
		}
	}
}
