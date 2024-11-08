package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[]args) {
	Scanner reader = new Scanner(System.in);
	
	//variable para almacenar los numeros recogidos por consola
	double numeroU = 0;
	
	//tabla de 5 numeros
	double numero [] = new double [5];
	
	//for que pasa por todos los numeros de la tabla por su longitud , asigna numero de usuario a variable numeroU y luego asi mismo se asigna a una parte de la tabla
	for (int i=0 ; i<numero.length ; i++) {
		System.out.println("Dime un numero :");
		
		numeroU = reader.nextDouble();
		
		numero[i] = numeroU;
		}
	//Dice todos los numeros en su orden original
	for (int i = 0 ; i<numero.length ; i++) {
		
		System.out.println(numero[i]);
		
		}
	//Cierro el escaner
	reader.close();
	}
}
