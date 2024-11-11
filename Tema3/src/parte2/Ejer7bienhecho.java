package parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer7bienhecho {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creo un contador
		int contador = 0;
		
		//creamos la tabla
		int tablaUno[] = new int [55];
		
		try {
		//creamos el for
		for (int i = 1 ; i <= 10 ;i++) {
			
			Arrays.fill(tablaUno, contador, contador+i, i);
			contador += i;
		}
		//decimos por pantalla la tabla ordenada
		System.out.println(Arrays.toString(tablaUno));
		
								
		} catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        } finally {
        	
		//cerramos el escaner
			reader.close();
			
        }
	}
}