package examencorregido;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class examena {

	public static void main(String[]args) {
	
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Dime el numero de filas y columnas:");
		int filas = reader.nextInt();
		int columnas = reader.nextInt();
		System.out.println("Dime el numero de minas :");
		int numeroMinas = reader.nextInt();
		boolean jugador1;
		boolean jugador2;
		boolean tie;
		char letra = 'A';
		int minaFila;
		int minaColumna;
		
		char tabla[][] = new char[filas][columnas];
		
		//rellena la tabla y pone el indice
		for (int i = 0 ; i < tabla.length ; i++) {
			
			Arrays.fill(tabla[i], '-');
			//System.out.print("\t" +(char)(letra+i));
			
		}
		//pone las minas en posiciones aleatorias
		for (int i = 0 ; i < numeroMinas ; i++) {
			
			do {
				minaFila = random.nextInt(0,tabla.length);
				minaColumna = random.nextInt(0,tabla.length);
			} while (tabla[minaFila][minaColumna] == '*');
			
				tabla[minaFila][minaColumna] = '*';
		}
		
		System.out.println();
		
		//imprime el tablero con las minas
		
//		for (int i = 0 ; i < tabla.length ; i++) {
//			System.out.print((char)(letra+i) + "\t");
//			for ( int j = 0 ; j < tabla.length ; j++) {
//				System.out.print(tabla[i][j] + "\t");
//			}
//			System.out.println();
//		}
	    boolean juegoTerminado = false;
        boolean turnoJugador1 = true;

        // Mostrar el tablero inicial
        System.out.println("Tablero inicial:");
        imprimirTablero(tabla);

        while (!juegoTerminado) {
            System.out.println("Turno del " + (turnoJugador1 ? "Jugador 1" : "Jugador 2"));
            System.out.println("Introduce la fila y la columna separadas por un espacio:");
            int fila = reader.nextInt();
            int columna = reader.nextInt();

            // Validar entrada
            if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
                System.out.println("Posición no válida. Inténtalo de nuevo.");
                continue;
            }

            // Comprobar si pisa una mina
            if (tabla[fila][columna] == '*') {
                System.out.println("¡" + (turnoJugador1 ? "Jugador 1" : "Jugador 2") + " ha pisado una mina!");
                System.out.println("¡" + (turnoJugador1 ? "Jugador 2" : "Jugador 1") + " gana!");
                juegoTerminado = true;
            } else if (tabla[fila][columna] == '-') {
                System.out.println("¡Zona segura!");
                tabla[fila][columna] = 'O'; // Marca como zona visitada
            } else {
                System.out.println("Esta casilla ya fue seleccionada. Intenta otra.");
                continue;
            }

            // Cambiar de turno
            turnoJugador1 = !turnoJugador1;

            // Mostrar el tablero después de cada turno
            imprimirTablero(tabla);

            // Comprobar empate (si todas las casillas seguras fueron descubiertas)
            if (todasSegurasDescubiertas(tabla)) {
                System.out.println("¡Empate! Ningún jugador pisó una mina.");
                juegoTerminado = true;
            }
        }

        reader.close();
    }

    // Método para imprimir el tablero sin mostrar las minas
		static void imprimirTablero(char[][] tabla) {
			char letra = 'A';
       for (int i = 0 ; i < tabla.length ; i++) {
    	   System.out.print("\t" + (char)(letra+i));
       }
       System.out.println();
       for (int i = 0 ; i < tabla.length ; i++) {
    	   System.out.print((char)(letra+i) + "\t");
    	   for (int j = 0; j < tabla.length ; j++) {
    		   if (tabla[i][j] == '*') {
    			   System.out.print('-' + "\t");
    		   } else {
    		   System.out.print(tabla[i][j] + "\t");
    		   }
    	   }
    	   System.out.println();
       }
    }

    // Método para verificar si todas las zonas seguras fueron descubiertas
    private static boolean todasSegurasDescubiertas(char[][] tabla) {
    	boolean todasDescubiertas = true;

        for (int i = 0; i < tabla.length ; i++) {
            for (int j = 0; j < tabla[i].length ; j++) {
                if (tabla[i][j] == '-') {
                    todasDescubiertas = false;
                }
            }
        }

        return todasDescubiertas;
    }
}
