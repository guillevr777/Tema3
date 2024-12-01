package ejerciciosbidimensionales;

import java.util.Scanner;

public class tresenralla {
		public static void main(String[]args) {
			Scanner reader = new Scanner (System.in);
			
			String seguir;
			
			int fila;
			int columna;
			String tabla[][] = new String[3][3];
			
			System.out.println("Bienvenido al tres en raya");
			
			while (seguir) {
			
				System.out.println("Es el turno del jugador 1: En que fila y columna desea colocar su ficha?");
				fila = reader.nextInt();
				columna = reader.nextInt();
				if (fila == 4) {
				seguir = false;
				}
			}
		}
		static void imprimir(String[][] t) {
		
			for (int i = 0 ; i < t.length ; i++) {
				for (int j = 0 ; j < t.length ; j++) {
					System.out.print(t[i][j]);
				}
				System.out.println();
			}
		}
		static String[][] tab(int fila ,int columna) {
			String t[][] = new String[3][3];
			
			return t;
		}
}
