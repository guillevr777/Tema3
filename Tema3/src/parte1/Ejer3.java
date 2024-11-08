package parte1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[]args) {
	Scanner reader = new Scanner(System.in);
	
	//variable para almacenar los numeros recogidos por consola
	double numeroU = 0;
	
	//creamos la tabla
	double numero [] = new double [5];
	
	//creo un for para que asigne los numeros que dice el usuario a la tabla
	for (int i=0 ; i<numero.length ; i++) {
		System.out.println("Dime un numero :");
		
		numeroU = reader.nextDouble();
		
		numero[i] = numeroU;
		}
	//creo un for para que lea los valores del revez
	for (int a = 4 ; a >= 0 ; a--) {
		
		System.out.println(numero[a]);
		
		}
	//cierro el escaner
	reader.close();
	}
}
