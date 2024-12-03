package examencorregido;

import java.util.Arrays;
import java.util.Random;

public class Buscaminas {

	public static void main(String[] args) {
		Random rand = new Random();
		char minas[] = new char[20];

		final int NUM_MINAS = 6;

		int posMina;

		for (int i = 1; i <= 6; i++) {
			do {
				posMina = rand.nextInt(0, minas.length);
			} while (minas[posMina] == '*');

			minas[posMina] = '*';
		}

		System.out.println(Arrays.toString(minas));		
	}

}