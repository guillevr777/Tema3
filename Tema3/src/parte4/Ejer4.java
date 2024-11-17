package parte4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        
        // Creamos el scanner para leer la entrada del usuario
        Scanner reader = new Scanner(System.in);
        
        // Pedimos el valor a buscar
        System.out.println("Dime el valor a buscar del 0 al 10:");
        int clave = reader.nextInt();
        
        // creamos la tabla
        int[] tabla = {3, 7, 2, 8, 5, 9};
        
        int resultado = buscar(tabla, clave);
        
        if (resultado != -1) {
            System.out.println("Clave " + clave + " encontrada en la posición: " + resultado);
        } else {
            System.out.println("Clave " + clave + " no encontrada.");
        }
        
        // Cerramos el scanner
        reader.close();
    }

    //buscamos el numero por la tabla
    public static int buscar(int[] t, int clave) {
        // Recorrer toda la tabla y si encontramos el numero lo dice
        for (int i = 0; i < t.length; i++) {
        	
            if (t[i] == clave) {
                return i;
            }
        }
        //si no se encuentra la clave, devuelve -1
        return -1;
    }
}