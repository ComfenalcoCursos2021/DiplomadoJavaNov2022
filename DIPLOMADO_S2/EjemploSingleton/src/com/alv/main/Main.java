package com.alv.main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calculadora calc = Calculadora.getInstancia();
		Calculadora calc1 = Calculadora.getInstancia();
		Calculadora calc2 = Calculadora.getInstancia();
		Calculadora calc3 = Calculadora.getInstancia();
		Calculadora calc4 = Calculadora.getInstancia();
		
		
		System.out.println(calc.suma(10, 25));
		
		System.out.println("Termino!!");
	}

}
