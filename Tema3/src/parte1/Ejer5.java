package parte1;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[]args) {
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
	
	//creo una variable para almacenar los numeros que iran en la tabla 
	double numeroU = 0;
	
	//variable para la suma de los numeros
	double sumaNumeros = 0;
	
	//variable para el numero mayor
	double numeroMayor = 0;
	
	//variable para el numero menor
	double numeroMenor = 0;
	
	//variable para la tabla de 10 numeros
	double numero [] = new double [10];
	
	//for para repetir el Syso 10 veces hasta conseguir 10 numeros
	for (int i=0 ; i<numero.length ; i++) {
		System.out.println("Dime un numero :");
		
		numeroU = reader.nextDouble();
		
		numeroMenor = numeroU;
		numeroMayor = numeroU;
		
		numero[i] = numeroU;
		}
	
	//for para repetir 10 veces los numeros y que vaya sumandolos e identificando los numeros mayores y menores
	for (int i = 0 ; i<numero.length ; i++) {
		
		sumaNumeros += numero[i];

		//if para diferenciar al numero mayor
		if (numero[i] > numeroMayor) {
			numeroMayor = numero[i];
			}
		//if para diferenciar al numero menor
		if (numero[i] < numeroMenor){
			numeroMenor = numero[i];
			}
		}
	
		//muestro la solucion por consola con los Syso
		System.out.println("La suma de los numeros da : " + sumaNumeros);
		System.out.println("El numero mayor es " + numeroMayor);
		System.out.println("El numero menor es " + numeroMenor);

	//cerramos el escaner
	reader.close();
	}
}
