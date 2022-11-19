package com.libreria;

import java.util.Scanner;

public class FuncionesAritmeticasDecoradas {

	private Scanner entradaTeclado = new Scanner(System.in);

	public void SumarDosNumeros() {

		String mensajeInicial = "Este programa suma dos numeros";

		System.out.println(mensajeInicial);

		float primerNumero;
		float segundoNumero;

		System.out.println("Ingrese el primer numero");
		primerNumero = entradaTeclado.nextFloat();
		System.out.println("Ingrese el segundo numero");
		segundoNumero = entradaTeclado.nextFloat();

		float respuesta;

		respuesta = this.sumar(primerNumero, segundoNumero);

		System.out.println("La respuesta es = " + respuesta);
	}

	/*
	 * Este programa sirve para sumar dos numeros
	 */
	public float sumar(float n1, float n2) {
		float respuesta = n1 + n2;
		return respuesta;
	}
	
	
	public void jacsonContadorCifras() {
		
		System.out.println("Este programa te dira cuantas cifras tiene un numero");			
		
		int numero;
		int contador=0;
		
		System.out.println("Ingrese un numero");
		numero = entradaTeclado.nextInt();
		
		while (numero != 0) { 
			numero=numero/10;
			System.out.println("vamos por " + numero);
			contador=contador+1;
		}
		
		System.out.println("el numero tiene " + contador + " cifras");
	}
	
	public void jacsonContadorRestas() {
		System.out.println("este programa te dira cuantas cifras tiene un numero");			
		
		long numero;
		long divisor=10;
		long contador=0;
		long resultado;
		
		System.out.println("ingrese un numero");
		numero = entradaTeclado.nextLong();
		resultado=numero;
		TextosMejorados txt = new TextosMejorados();
		while (resultado >= 0) {
			resultado=numero-divisor;
			divisor=divisor*10;
			contador=contador+1;
			
			txt.print("" + resultado);
			txt.print(String.valueOf(divisor));
			txt.print("" + contador);
			txt.print("#############################");			
		}
		
		System.out.println("el numero tiene "+contador+" cifras");
	}
}
