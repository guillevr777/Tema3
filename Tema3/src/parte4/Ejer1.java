package parte4;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
	public static void main(String[]args) {
		Random random = new Random();
		
		int tabla[] = new int[10];
		
		for (int i = 0 ; i < tabla.length ; i++) {
			tabla[i] = random.nextInt(1,11);
		}
		System.out.println("Tabla de enteros");
		System.out.println(Arrays.toString(tabla));
		System.out.println("La sura sera : " + sumaTabla(tabla));
	}
	static int sumaTabla(int tabla[]) {
		int suma = 0;
		for (int i = 0 ; i < tabla.length ; i++) {
			suma += tabla[i];
		}
		return suma;
	}
}
