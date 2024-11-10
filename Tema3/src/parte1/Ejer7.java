package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		
		int numeroU = 0;
		
		int numero [] = new int [12];
		
		System.out.println("Dime las temperaturas de todos los meses del año de 1 en 1 :");
		
		for (int i=0 ; i<numero.length ; i++) {			
			//preguntamos por la temperaturas de este año
			System.out.println("Dime una :");
			numeroU = reader.nextInt();
			
			numero[i] = numeroU;
			
			System.out.print("Mes " + i + " haran : ");
			//Dice todos los numeros en su orden original
			for (int a = 0 ; a<numero[i] ; a++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		//cerramos el escaner
		reader.close();
	}
}