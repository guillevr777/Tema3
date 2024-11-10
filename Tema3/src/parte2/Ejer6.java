package parte2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer6 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos un random para dar valores aleatorios
		Random random = new Random();
		
		//creo un contador
		int contador = 0;
		
		//creo las tablas 
		int tablaUno [] = new int [6];
		int tablaDos [] = new int [6];
		
		//asignamos valores a la tabla entre 0 y 9
		for (int i = 0; i < tablaUno.length ; i++) {
			
			tablaUno[i] = random.nextInt(1,50);
			tablaDos[i] = random.nextInt(1,50);
		if (tablaUno[i] == tablaDos[i]) {
			contador++;
		}
		
		}
				
		//Ordenamos la tabla
		Arrays.sort(tablaDos);
		
		//decimos por pantalla la tabla ordenada
		System.out.println(Arrays.toString(tablaUno));
		System.out.println(Arrays.toString(tablaDos));
		System.out.println("Numero de aciertos :" + contador);

		
		//cerramos el escaner
			reader.close();
	}
}