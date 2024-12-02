package parte4;

import java.util.Arrays;

public class Ejer6 {

	public static void main(String[]args) {
		
		//creamos tabla de enteros
		 int tablaEnteros[] = {5, 6, 7, 3, 4, 2, 1, 2, 9, 8};
		 
		 	//creamos variable que definira el conjunto de numeros a sumar por iteracion
	        int NUMEROELEMENTOS = 3;
	        
	        //creamos tabla para almacenar las sumas
	        int[] sumaEnteros = suma(tablaEnteros, NUMEROELEMENTOS);
	        
	        //mostramos la tabla
	        System.out.println(Arrays.toString(sumaEnteros));
	        
	 }
	//creamos funcion encargada de la suma
	static int[] suma(int t[], int numElementos) {
		
		//creamos variable para controlar la longitud
        int numSumas = t.length - numElementos + 1;
        
        //creamos tabla resultado para contener las sumas , se le asigna numSumas como longitud
        int[] resultado = new int[numSumas];
        
        //creamos for para sumar los valores de los indices
        for (int i = 0; i < numSumas; i++) {
        	
            int suma = 0;
            
            //bucle for para repetirse las veces que se indique
            for (int j = 0; j < numElementos; j++) {
                suma += t[i + j];
            }
            resultado[i] = suma;
        }
        //se devuelve la tabla resultado
        return resultado;
    }
}
