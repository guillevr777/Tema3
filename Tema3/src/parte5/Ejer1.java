package parte5;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {

	//creamos la funcion principal
	public static void main(String[] args) {
		
		//creamos el random
		Random random = new Random();

		//creamos tabla de 6 filas y 10 columnas
		int tabla[][] = new int[6][10];
		
		//creamos for para rellenar tabla de numeros entre 0 y 1000
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla.length ; j++) {
			
				tabla[i][j] = random.nextInt(0,1001);
				
			}
		}
		
		//creamos tabla para almacenar el valor minimo y maximo de la tabla
		int tablaMayorMenor[] = valores(tabla);
		
		//decimos el resultado
		System.out.println(Arrays.toString(tablaMayorMenor));
	}
	//creamos funcion valores
	static int[] valores(int t[][]) {
		
		//creamos la tabla con 2 posiciones (0=minimo , 1=maximo)
		int[] tabla = new int[2];
		
		//declaramos las variables minimo y maximo
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		
		//creamos el for para recorrer la tabla en busca del minimo y maximo
		for (int i = 0 ; i < t.length ; i++) {
			for (int j = 0 ; j < t.length ; j++) {
				
				//if para saber si es el menor hasta ahora
				if (t[i][j] < minimo) {
					minimo = t[i][j];
					
					//if para saber si es el mayor hasta ahora
				} else if (t[i][j] > maximo) {
					maximo = t[i][j];
				} 
			}
		}
		//asignamos los valores maximo y minimo a las posiciones de la tabla que hemos creado
		tabla[0] = minimo;
		tabla[1] = maximo;
		
		//devolvemos la tabla de 2 posiciones con el minimo y el maximo
		return tabla;
	}
}
