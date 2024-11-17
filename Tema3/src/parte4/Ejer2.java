package parte4;

import java.util.Arrays;
import java.util.Random;

public class Ejer2 {

	public static void main(String[] args) {
		
			Random random = new Random();
			
			int t[] = new int[10];
			
			for (int i = 0 ; i < t.length ; i++) {
				t[i] = random.nextInt(1,11);
			}
			System.out.println("Numero Mayor : " + maximo(t));
			
		}
		static int maximo(int t[]) {
			int numeroMayor = 0;
			for (int i = 0 ; i < t.length ; i++) {
				
				if (numeroMayor < t[i]) {
					numeroMayor = t[i];
				}
			}
			return numeroMayor;
		}
	}