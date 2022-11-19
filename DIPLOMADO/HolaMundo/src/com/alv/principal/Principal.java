package com.alv.principal;

import java.util.Scanner;

public class Principal {
	
	/*
	/// byte	Representa un tipo de dato de 8 bits con signo. 
	///			De tal manera que puede almacenar los valores 
	///			numéricos de -128 a 127 (ambos inclusive).
	/// int		Representa un tipo de dato de 16 bits con signo. 
	///			De esta manera almacena valores numéricos de -32.768 a 32.767.
	/// short	Es un tipo de dato de 32 bits con signo para almacenar 
	///			valores numéricos. Cuyo valor mínimo es -231 y 
	///			el valor máximo 231-1.
	/// long	Es un tipo de dato de 64 bits con signo que 
	///			almacena valores numéricos entre -263 a 263-1
	/// float	Es un tipo dato para almacenar números en coma 
	///			flotante con precisión simple de 32 bits.
	/// double	Es un tipo de dato para almacenar números en 
	///			coma flotante con doble precisión de 64 bits.
	/// boolean	Sirve para definir tipos de datos booleanos. 
	///			Es decir, aquellos que tienen un valor de 
	///			true o false. Ocupa 1 bit de información.
	/// char	Es un tipo de datos que representa a un 
	///			carácter Unicode sencillo de 16 bits.
	/// String	Es un tipo de dato que representa a una cadena
	///			de n caracteres
	*/
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		String mensajeInicial = "Este programa suma dos numeros";
		
		System.out.println(mensajeInicial);
		
		float primerNumero;
		float segundoNumero;
		
		System.out.println("Ingrese el primer numero");
		primerNumero = entradaTeclado.nextFloat();
		System.out.println("Ingrese el segundo numero");
		segundoNumero = entradaTeclado.nextFloat();
		
		float respuesta;
		
		respuesta = primerNumero + segundoNumero;
		
		entradaTeclado.close();	
		
		System.out.println("La respuesta es = " + respuesta );
		
		System.out.println("Termino!!!");
	}
}
