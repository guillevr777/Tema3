package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		int tabla [] = new int [10];
		
		Random random = new Random();
		
		for (int i = 0 ; i <=9 ; i++) {
			
		tabla [i] = random.nextInt(1,101);
		
		}
		System.out.println(Arrays.toString(tabla));
	}
}
