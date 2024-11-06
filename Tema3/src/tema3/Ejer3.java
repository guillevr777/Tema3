package tema3;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[]args) {
	Scanner reader = new Scanner(System.in);
	
	double numeroU = 0;
	
	double numero [] = new double [5];
	
	for (int i=0 ; i<numero.length ; i++) {
		System.out.println("Dime un numero :");
		
		numeroU = reader.nextDouble();
		
		numero[i] = numeroU;
		}
	for (int a = 4 ; a >= 0 ; a--) {
		
		System.out.println(numero[a]);
		
		}
	reader.close();
	}
}
