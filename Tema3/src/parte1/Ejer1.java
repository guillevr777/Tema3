package parte1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creo la tabla
		int tabla [] = new int [10];
		
		//creo el random 
		Random random = new Random();
		
		//creo el for para que me diga numeros random del 1 al 100 
		for (int i = 0 ; i <=9 ; i++) {
			
		tabla [i] = random.nextInt(1,101);
		
		}
		//muestra la tabla entre corchetes
		System.out.println(Arrays.toString(tabla));
	}
}
