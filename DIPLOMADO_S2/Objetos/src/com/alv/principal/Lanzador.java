package com.alv.principal;

import com.alv.dto.Balde;

public class Lanzador {

	public static void main(String[] args) {

		/*
		 * 
		 * DOS VALDES 
		 * 1 DE 5 LITROS
		 * 1 DE 3 LITROS
		 * 
		 * QUE DEBEMOS HACER PARA QUE EN UN VALDE QUEDEN EXACTAMENTE 4 LITROS
		 * 
		 * */
		
		Balde cincoLitros = new Balde((short) 5);
		Balde tresLitros = new Balde((short) 3);
		
		
		System.out.println(cincoLitros.getContenido() + " -- " + tresLitros.getContenido());		
		cincoLitros.llenar();
		System.out.println(cincoLitros.getContenido() + " -- " + tresLitros.getContenido());
		
		cincoLitros.vaciarEn(tresLitros);
		
		System.out.println(cincoLitros.getContenido() + " -- " + tresLitros.getContenido());
		tresLitros.vaciar();
		System.out.println(cincoLitros.getContenido() + " -- " + tresLitros.getContenido());
		cincoLitros.vaciarEn(tresLitros);
		System.out.println(cincoLitros.getContenido() + " -- " + tresLitros.getContenido());
		cincoLitros.llenar();
		System.out.println(cincoLitros.getContenido() + " -- " + tresLitros.getContenido());
		cincoLitros.vaciarEn(tresLitros);
		
		System.out.println(cincoLitros.getContenido() + " -- " + tresLitros.getContenido());
		
		tresLitros.vaciarEn(cincoLitros);
		System.out.println(cincoLitros.getContenido() + " -- " + tresLitros.getContenido());
		//VACIAR LO QUE SE PUEDA DEL DE 5 LITROS EN EL 3 LITROS
		
		
		
		
		
		
		System.out.println("Termino!!");

	}
	
	

}
