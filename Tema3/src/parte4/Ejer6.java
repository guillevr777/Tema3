package parte4;

import java.util.Arrays;

public class Ejer6 {

	public static void main(String[]args) {
		
		 int tablaEnteros[] = {5, 6, 7, 3, 4, 2, 1, 2, 9, 8};
		 
	        int numElementos = 3;
	        
	        int[] sumaEnteros = suma(tablaEnteros, numElementos);
	        
	        System.out.println(Arrays.toString(sumaEnteros));
	        
	 }
	static int[] suma(int t[], int numElementos) {
		
        int numSumas = t.length - numElementos + 1;
        
        int[] resultado = new int[numSumas];
        
        for (int i = 0; i < numSumas; i++) {
        	
            int suma = 0;
            
            for (int j = 0; j < numElementos; j++) {
                suma += t[i + j];
            }
            resultado[i] = suma;
        }
        
        return resultado;
    }
}
