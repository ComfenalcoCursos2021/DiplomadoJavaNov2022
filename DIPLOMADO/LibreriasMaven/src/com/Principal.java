package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");		
		
		int numero = entradaTeclado.nextInt();
		
		int contador = 1;
		int acumulador = 10;
				
		while(numero > acumulador) {
			contador = contador + 1;
			acumulador = acumulador * 10;
		}
				
		System.out.println("El numero tiene " + contador + " cifras");
		
		entradaTeclado.close();		
		System.out.println("Termino !!!");
		
		
	}

}
