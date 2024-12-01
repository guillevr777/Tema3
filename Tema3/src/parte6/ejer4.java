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
		
		String tabla[][] = new String[8][8];
				
		System.out.println("Que pieza quieres mover? Torre : T , A : Alfil , D : Dama y C : Caballo .");
		pieza = reader.next().toUpperCase();
		System.out.println("A que fila?");
		posFila = reader.nextInt();
		System.out.println("Y a que columna?");
		posColumna = reader.nextInt();
	
		//Creamos un sistema para imrprimir la tabla
		tabla = pieza(pieza ,posFila ,posColumna);
		
		imprimirTablero(tabla);
		
		//cerramos el escaner
		reader.close();
		
	}
	 static void imprimirTablero(String[][] tablero) {
	        for (int i = 0; i < tablero.length; i++) {
	            for (int j = 0; j < tablero[i].length; j++) {
	                System.out.print(tablero[i][j] + "    ");
	        }
	            System.out.println();
	            System.out.println();
	    }
	}
	//creamos la funcion pieza
	static String[][] pieza(String pieza ,int posFila ,int posColumna) {
		
		String t[][] = new String[8][8];
		
		switch (pieza) {
		case "T" -> t = torre(posFila ,posColumna);
		case "A" -> t = alfil(posFila ,posColumna);
		case "D" -> t = dama(posFila ,posColumna);
		case "C" -> t = caballo(posFila ,posColumna);
		}
		
		return t;
	}
	static String[][] torre(int posFila ,int posColumna) {
		String tab[][] = new String[8][8];
		
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab.length ; j++) {
				tab[i][j] = "*";
				if (posFila == i && posColumna == j) {
					tab[i][j] = "T";
				} else if (posFila == i) {
					tab[i][j] = "X";
				} else if (posColumna == j) {
					tab[i][j] = "X";
				}
			}
		}
			
		return tab;
	}
	static String[][] alfil(int posFila ,int posColumna) {
		String tab[][] = new String[8][8];
		
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab.length ; j++) {
				tab[i][j] = "*";
				
				if (posFila == i && posColumna == j) {
					tab[i][j] = "A";
				} else if ((i - posFila) == (j - posColumna)) {
	                tab[i][j] = "X";
	            } else if ((i - posFila) == (posColumna - j)) {
	                tab[i][j] = "X";
	            }

			}
		}
		
		return tab;
	}
	static String[][] dama(int posFila ,int posColumna) {
		String tab[][] = new String[8][8];
		
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab.length ; j++) {
				tab[i][j] = "*";
				if (posFila == i && posColumna == j) {
					tab[i][j] = "D";
				} else if (posFila == i) {
					tab[i][j] = "X";
				} else if (posColumna == j) {
					tab[i][j] = "X";
				} else if (posFila-i == posColumna-j) {
					tab[i][j] = "X";
				} else if ((i - posFila) == (posColumna - j)) {
	                tab[i][j] = "X";
	            }
			}
		}
		
		return tab;
	}
	static String[][] caballo(int posFila ,int posColumna) {
		String tab[][] = new String[8][8];
		
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab.length ; j++) {
				tab[i][j] = "*";
				if (posFila == i && posColumna == j) {
					tab[i][j] = "C";
				} else if (posFila-2 == i && posColumna == j-1 || posFila-2 == i && posColumna == j+1) {
					tab[i][j] = "X";
				} else if (posFila+2 == i && posColumna == j-1 || posFila+2 == i && posColumna == j+1) {
					tab[i][j] = "X";
				} else if (posFila-1 == i && posColumna == j-2 || posFila-1 == i && posColumna == j+2) {
					tab[i][j] = "X";
				} else if (posFila+1 == i && posColumna == j-2 || posFila+1 == i && posColumna == j+2) {
					tab[i][j] = "X";
				}
			}
		}
		
		return tab;
	}
}
