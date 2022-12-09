package com.alv.main;

import com.alv.dtos.Menu;

public class OtroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu A = new Menu();
		A.setTexto("El T A");
		Menu B = new Menu();
		B.setTexto("El T B");
		
		System.out.println(B.getTexto());
		A = B;
		A.setTexto("MODIFICADO");
		System.out.println(B.getTexto());
		
		
		
		
		
		
	}

}
