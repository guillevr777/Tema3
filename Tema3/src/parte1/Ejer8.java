package parte1;

import java.util.Random;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[]args) {
		
			//creamos el escaner
			Scanner reader = new Scanner(System.in);
			
			//creo la clase random
			Random random = new Random();
			
			//creo una variable para el numero de busquedas
			int indiceBusqueda = 0;
			
			//numero que busco
			int numeroBuscado = 0;
			
			//cantidad de numero elegido repetidos
			int cantidad = 0;
			
			//creamos la tabla
			int numero [] = new int [100];
			
			//preguntamos por el numero que quiere que busque las posiciones
			System.out.println("Que numero quieres que te encuentre? *Del 1 al 10*");
			numeroBuscado = reader.nextInt();
			
			//Le comunicamos al usuario donde se encuentra el numero dicho en las posiciones
			System.out.print("El numero que busca se encuentra en las siguientes posiciones :");
						
			//asignamos un numero del 1 al 10 a cada posicion de la tabla
			for (int i=0 ; i<numero.length ; i++) {	
				
				numero[i] = random.nextInt(1,11);
				
				//creo un if para saber si el numero buscado es igual al actual de la tabla
				if (numero[i] == numeroBuscado) {
					System.out.print(i + " , ");
					cantidad++;
				}
			}
				System.out.println("Habian " + cantidad + " numeros de " + numeroBuscado);	
			
		//cerramos el escaner
			reader.close();
		}
	}
