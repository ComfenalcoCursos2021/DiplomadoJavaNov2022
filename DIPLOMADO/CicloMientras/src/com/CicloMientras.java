package com;

import java.util.Scanner;

public class CicloMientras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		int edad;
		
		
		System.out.println("Ingrese la dedad");		
		
		edad= entradaTeclado.nextInt();
		
		while(edad > 5) {
			edad = edad - 1;
			System.out.println(edad);
		}
		
		System.out.println("Termino!!!");
	}

}
