package tema3;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[]args) {
	Scanner reader = new Scanner(System.in);
	
	double numeroU = 0;
	
	double numero [] = new double [10];
	
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
