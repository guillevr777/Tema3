package parte6;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//craamos un booleano para contener el resultado de la funcion
		boolean resultado;
		
		//preguntamos por un valor entre 1-10
		System.out.println("Dime un valor del 1-10:");
		int valor = reader.nextInt();
		
		//creamos una tabla
		int tabla[][] = {{1 ,2 ,3 ,4},{5 ,5 ,7 ,8},{9 ,10 ,11 ,12},{13 ,14 ,15 ,16}};
		
		//llamamos a la funcion se la asignamos al booleano resultado y lo decimos por consola
		resultado = buscar(tabla ,valor);
		System.out.println(resultado);
		
		//cerramos el escaner
		reader.close();
	}
	//creamos la funcion buscar
	static boolean buscar(int t[][] ,int valor) {
		//creamos un  booleano para mostrar el resultado
		boolean verificar = false;
		
		//creamos un for para buscar el valor
		for (int i = 0 ; i < t.length ; i++) {
			for (int j = 0 ; j < t.length ; j++) {
				if (t[i][j] == valor) {
					verificar = true;
				}
			}
		}
		//devolvemos la funcion
		return verificar;
	}

}
