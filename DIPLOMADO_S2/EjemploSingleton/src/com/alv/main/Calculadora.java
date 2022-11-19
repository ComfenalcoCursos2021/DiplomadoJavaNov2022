package com.alv.main;

public class Calculadora {

	private static Calculadora calc;	
	
	private Calculadora() {
		
	};	
	public static Calculadora getInstancia() {
		if(calc == null) {
			calc = new Calculadora();
		}
		return calc;
	}
	
	
	
	
	public float suma(float a , float b) {
		return a+b;
	}
	public float resta(float a , float b) {
		return a-b;
	}
}
