package com;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("vamos a dividir");
		int dividendo;
		int divisor;
		

		System.out.println("Ingrese el dividendo");
		dividendo = entradaTeclado.nextInt();
		
		System.out.println("Ingrese el divisor");
		divisor = entradaTeclado.nextInt();
		
		
		if(divisor > 0) {
			int contador = 0;
			
			while(dividendo > divisor) {
				dividendo = dividendo - divisor;
				contador = contador+1;
			}
			System.out.println("El resultado de la division es " + 
			contador + " con residuo " + dividendo );
		} else {
			System.out.println("SOLO DIVIDIMOS POR NUMERO POSITIVOS");
		}
		
		
		
		
		
		System.out.println("Termino!!!");
	}

}
