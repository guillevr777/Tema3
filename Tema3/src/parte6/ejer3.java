package parte6;

import java.util.Random;
import java.util.Scanner;

public class ejer3 {
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos una tabla
		int tabla[][] = {{1 ,2 ,3 ,4},{5 ,5 ,7 ,8},{9 ,10 ,11 ,12},{13 ,14 ,15 ,16}};
		
		desordenar(tabla);
		
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla.length ; j++) {
				System.out.print(tabla[i][j] + "   ");
			}
			System.out.println();
		}
		//cerramos el escaner
		reader.close();
	}
	//creamos la funcion buscar
	static void desordenar(int t[][]) {
		    Random random = new Random();
			int posI;
			int posJ;
			int aux;
			
			for (int i = 0 ; i < t.length ; i++) {
				for (int j = 0 ; j < t.length ; j++) {
					posI = random.nextInt(0, 4);
					posJ = random.nextInt(0, 4);
					aux = t[i][j];
					t[i][j] = t[posI][posJ];
					t[posI][posJ] = aux;
				}
			}
		}
	}