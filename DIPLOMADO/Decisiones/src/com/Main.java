package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Este programa te dice si eres mayor de edad");
		
		System.out.println("Ingrese su edad");
		
		int edad = entradaTeclado.nextInt();
		
		if(edad < 18) {
			System.out.println("si es menor de edad");
		} else {
			System.out.println("Es mayor de edad");
		}
		
		System.out.println("Termino!!!");
		

	}

}
