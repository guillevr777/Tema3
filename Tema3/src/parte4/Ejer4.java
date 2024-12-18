package parte4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        
        //creamos el scanner para leer la entrada del usuario
        Scanner reader = new Scanner(System.in);
        
        //pedimos el valor a buscar
        System.out.println("Dime el valor a buscar del 0 al 10:");
        int clave = reader.nextInt();
        
        //creamos la tabla
        int[] tabla = {3, 7, 2, 8, 5, 9};
        
        int resultado = buscar(tabla, clave);
        
        //si el resultado es diferente de -1 se muestra al usuario la posicion
        if (resultado != -1) {
            System.out.println("Clave " + clave + " encontrada en la posicion: " + resultado);
            //si el resultado es -1 se indica que no se encontro el valor
        } else {
            System.out.println("Clave " + clave + " no encontrada.");
        }
        
        // Cerramos el scanner
        reader.close();
    }

    //buscamos el numero por la tabla
    public static int buscar(int[] t, int clave) {
    	int indice = 0;
    	boolean enc = false;
    	
        // Recorrer toda la tabla y si encontramos el numero lo dice
        while (indice < t.length && !enc) {
        	
        	//si el numero de dicha posicion de la tabla es igual al valor clave devolvemos la posicion 
            if (t[indice] == clave) {
                enc = true;
            } else {
            	indice++;
            }
        }
        //si no se encuentra la clave, devuelve -1
        return indice;
    }
}