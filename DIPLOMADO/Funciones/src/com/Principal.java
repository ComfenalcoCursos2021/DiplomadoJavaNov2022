package com;

import com.libreria.FuncionesAritmeticasDecoradas;
import com.libreria.TextosMejorados;

public class Principal {
	
	
	public static void main(String[] args) {
		FuncionesAritmeticasDecoradas funciones = new FuncionesAritmeticasDecoradas();
		
		TextosMejorados txt = new TextosMejorados();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//funciones.jacsonContadorCifras();
		
		funciones.jacsonContadorRestas();
		
		
		txt.print("Termino!!!");
	}

}
