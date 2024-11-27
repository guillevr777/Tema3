package parte6;

import java.util.Random;
import java.util.Scanner;

public class ejer4 {
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		String pieza;
		int posFila;
		int posColumna;
				
		System.out.println("Que pieza quieres mover? Torre : T , A : Alfil , D : Dama y C : Caballo .");
		pieza = reader.next().toUpperCase();
		System.out.println("A que fila?");
		posFila = reader.nextInt();
		System.out.println("Y a que columna?");
		posColumna = reader.nextInt();
		
		//cerramos el escaner
		reader.close();
	}
	//creamos la funcion pieza
	static String pieza(String pieza) {
		
		int t[][] = new int[8][8];
		
		switch (pieza) {
		case "T" -> torre(t);
		case "A" -> alfil(t);
		case "D" -> dama(t);
		case "C" -> caballo(t);
		}
		
		return t;
	}
	static String[][] torre(int posFila ,int posColumna) {
		String tab[][] = new String[8][8];
		
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab.length ; j++) {
				
			}
		}
			
		return tab;
	}
	static String[][] alfil(int posFila ,int posColumna) {
		String tab[][] = new String[8][8];
		
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab.length ; j++) {
				tab[i][j] = "*";
			}
		}
		
		return tab;
	}
	static String[][] dama(int posFila ,int posColumna) {
		String tab[][] = new String[8][8];
		
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab.length ; j++) {
				tab[i][j] = "*";
			}
		}
		
		return tab;
	}
	static String[][] caballo(int posFila ,int posColumna) {
		String tab[][] = new String[8][8];
		
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab.length ; j++) {
				tab[i][j] = "*";
			}
		}
		
		return tab;
	}
}
