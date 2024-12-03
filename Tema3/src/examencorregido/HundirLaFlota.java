package examencorregido;

import java.util.Arrays;
import java.util.Scanner;

public class HundirLaFlota {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Solicitamos el tamaño del tablero
        System.out.println("Dime cuántas filas y columnas tendrá la tabla:");
        int fila = reader.nextInt();
        int columna = reader.nextInt();

        // Inicializamos los tableros de los jugadores
        char tabla1[][] = new char[fila][columna];
        char tabla2[][] = new char[fila][columna];

        // Llenamos los tableros con '-'
        completarTabla(tabla1, tabla2);

        // Variables para las coordenadas de disparo
        int fila1, columna1;
        int fila2, columna2;

        // Bandera para verificar si algún jugador ganó
        boolean ganador = false;

        // Colocación de barcos (simulamos los barcos colocando un barco en una casilla específica)
        System.out.println("Jugador 1, coloca tu barco (Fila y Columna):");
        fila1 = reader.nextInt();
        columna1 = reader.nextInt();
        tabla1[fila1][columna1] = 'B'; // Coloca un barco en la tabla del jugador 1

        System.out.println("Jugador 2, coloca tu barco (Fila y Columna):");
        fila2 = reader.nextInt();
        columna2 = reader.nextInt();
        tabla2[fila2][columna2] = 'B'; // Coloca un barco en la tabla del jugador 2

        // Empezamos el ciclo del juego
        while (!ganador) {
            // Turno del Jugador 1
            System.out.println("Turno del Jugador 1:");
            imprimir(tabla2); // Mostramos el tablero del Jugador 2
            System.out.println("¿Dónde deseas disparar? (Fila y Columna):");
            fila1 = reader.nextInt();
            columna1 = reader.nextInt();

            // Comprobamos si el disparo fue exitoso
            if (tabla2[fila1][columna1] == 'B') {
                System.out.println("¡Has hundido el barco del Jugador 2!");
                tabla2[fila1][columna1] = 'X'; // Marcamos como hundido
            } else {
                System.out.println("Agua... No has tocado el barco del Jugador 2.");
            }

            // Verificamos si el jugador 1 ha ganado
            ganador = comprobarGanador(tabla2);
            if (ganador) {
                System.out.println("¡El Jugador 1 ha ganado!");
            }

            if (!ganador) {
                // Turno del Jugador 2
                System.out.println("Turno del Jugador 2:");
                imprimir(tabla1); // Mostramos el tablero del Jugador 1
                System.out.println("¿Dónde deseas disparar? (Fila y Columna):");
                fila2 = reader.nextInt();
                columna2 = reader.nextInt();

                // Comprobamos si el disparo fue exitoso
                if (tabla1[fila2][columna2] == 'B') {
                    System.out.println("¡Has hundido el barco del Jugador 1!");
                    tabla1[fila2][columna2] = 'X'; // Marcamos como hundido
                } else {
                    System.out.println("Agua... No has tocado el barco del Jugador 1.");
                }

                // Verificamos si el jugador 2 ha ganado
                ganador = comprobarGanador(tabla1);
                if (ganador) {
                    System.out.println("¡El Jugador 2 ha ganado!");
                }
            }
        }

        reader.close();
    }

    // Función para verificar si todos los barcos del oponente han sido hundidos
    static boolean comprobarGanador(char[][] tabla) {
    	boolean gana = true;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] == 'B') {
                    gana = false;
                }
            }
        }
        return gana;
    }

    // Función para llenar los tableros con '-'
    static void completarTabla(char t1[][], char t2[][]) {
        for (int i = 0; i < t1.length; i++) {
            Arrays.fill(t1[i], '-');
            Arrays.fill(t2[i], '-');
        }
    }

    // Función para imprimir el tablero
    static void imprimir(char t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
            	if (t[i][j] == 'B') {
            		System.out.print("-\t");
            	} else {
                System.out.print(t[i][j] + "\t");
            	}
            }
            System.out.println();
        }
    }
}