package com.alv.launch;

import com.alv.dto.Coordenada;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenada coord1 = new Coordenada(5,7);
		Coordenada coord2 = new Coordenada(8,9);
		
		Coordenada coord3 = Coordenada.sumar(coord1, coord2);		
		
		System.out.println(coord1 + " + " + coord2 + " = " + coord3);
		
		coord1.adicionar(coord2);
		
		System.out.println("Termino!");
		
		
	}
	
	
	public static void cambiarCoordenada(Coordenada X) {
		X.setX(99);
		X.setY(99);
	}

}
