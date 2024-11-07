package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creo la tabla que tendra 8 numeros enteros
		int numeros[] = new int [8];
		
		//creo una variable que recoja los 8 numeros naturales y se los asigne a la tabla mediante el for
		int ordenNumeros;
		
		//creo un for que reuna 8 numeros
		for (int i = 0 ; i < numeros.length ; i++) {
			
			//pido por un Syso 8 numeros
			System.out.print("Dime 8 numeros enteros :");
			ordenNumeros = reader.nextInt();
			
			//asigno los numeros que dijo el usuario a su posicion en la tabla
			numeros[i] = ordenNumeros;
		}
		//creo un for para que vaya diciendo los numeros y si son pares o impares
		for (int a = 0 ; a < numeros.length ; a++) {
			
			//si el resto del numero / 2 es 0 significa que es par , sino es impar y se redirecciona al else
			if (numeros[a] % 2 == 0) {
				System.out.println("El numero " + numeros[a] + " es par.");
			} else {
				System.out.println("El numero " + numeros[a] + " es impar.");
			}
		}
	//cerramos el escaner
	reader.close();
	}
}
