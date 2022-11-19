package com.alv.main;

import com.alv.libreria.Contenedor;
import com.alv.libreria.ModificadorTextos;

public class Principal {
	
	public static void main (String[] args) {
		
		ModificadorTextos txt = new ModificadorTextos();
		ModificadorTextos otroTexto = new ModificadorTextos();
		Contenedor cont = new Contenedor();
		
		
		
		txt.printWelcome();
		System.out.println(txt.mensaje);
		txt.mensaje = "Estamos en clase";
		System.out.println(txt.mensaje);
		txt.mensaje = "Ya no estamos en clase";
		System.out.println(txt.mensaje);
		
		System.out.println("-----------------");
		otroTexto.mensaje = "Este es otro texto";
		System.out.println(otroTexto.mensaje);
		System.out.println(txt.mensaje);
		
		System.out.println("-----------------");
		
		txt = otroTexto;
		
		System.out.println(txt.mensaje);
		txt.mensaje = "EL MENSAJE FINAL";		
		System.out.println(otroTexto.mensaje);
		
		
		
		
		System.out.println("Terminando!");
	}
	
}
