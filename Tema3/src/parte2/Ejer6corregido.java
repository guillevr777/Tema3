package parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer6corregido {
	public static void main(String[] args) {
		//10, 9, 7, 5, 2  || 2, 5, 7, 9, 10
		//-5,-4,-3,-2,-1
		int[] ganadora = {2,5,7,9,10,13};
		int[] apuesta = new int[6];
		
		Random rand = new Random();
		int cont = 0;
		int numAleatorio;
		int busqueda;
		int numAciertos = 0;
		
		try {
		
		while(cont<6) {
			numAleatorio = rand.nextInt(1, 50);
			Arrays.sort(apuesta);
			busqueda = Arrays.binarySearch(apuesta, numAleatorio);
			if(busqueda < 0) {
				apuesta[0] = numAleatorio;
				cont++;
			}
		}
		
		System.out.println(Arrays.toString(apuesta));
		
		for(int valor: apuesta) {
			busqueda = Arrays.binarySearch(ganadora, valor);
			if(busqueda>=0) {
				numAciertos++;
			}
		}
		
		System.out.println("Número de aciertos: " + numAciertos);
		//System.out.println(Arrays.binarySearch(ganadora, 11));
	
	} catch (InputMismatchException e) {
        System.out.println("Error: Por favor ingrese un número válido.");
    } catch (Exception e) {
        System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
    } finally {
		
    	}
	}
}