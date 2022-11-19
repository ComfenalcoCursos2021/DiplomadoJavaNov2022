package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		///  edad    menor 18 años NO TIENE MALES
		/// edad mayor a 18 pero menor a 50   y la presion arterial es mayor 120
		/// edad mayor a 50 y la presion arterial es mayor 100
		
		
		/*
		 * 1.) Pedir la edad y la presion
		 */
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Este programa te dira si tienes probabilidad de insuficiencia cardiaca");
		
		byte edad;
		short presion;
		
		System.out.println("Ingrese su edad:");
		edad = entradaTeclado.nextByte();
		
		System.out.println("Ingrese la presion");
		presion =  entradaTeclado.nextShort();
		
		///  edad    menor 18 años NO TIENE MALES
		/// edad mayor a 18 pero menor a 50   y la presion arterial es mayor 120
		/// edad mayor a 50 y la presion arterial es mayor 100
		
		if(edad < 18) {
			////SI   QUE LA CONDICION SEA VERDADERA
			System.out.println("NO TIENE MALES");
		} else {
			///NO    QUE NO SEA VERDADERA
			if(edad < 50) {
				if(presion > 120 ) {
					System.out.println("TIENE RIESGO");
				} else {
					System.out.println("VAMOS BIEN");
				}
			} else {
				if(presion > 100) {
					System.out.println("TIENE RIESGO");
				} else {
					System.out.println("VAMOS BIEN");
				}
			}
		}
		
		///si la persona esta entre los 30 y 40 años
		
		if(edad > 30) {
			if(edad < 40) {
				System.out.println("SON LAS PERSONAS QUE ESTAMOS BUSCANDO");
			} 
		} 
		
		if(edad > 30 && edad <40) {
			
		} else {
			
		}
		
		
		
		
		System.out.println("Termino!!!");
	}

}
