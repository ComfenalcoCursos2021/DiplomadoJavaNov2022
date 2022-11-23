package com.diplomado.main;

import java.util.Date;

import com.diplomado.utils.UtilDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date fecha = new Date();
		
		System.out.println(fecha);
		
		Date fechaFinal = UtilDate.addHours(fecha, 5);
		
		System.out.println(fechaFinal);
		
		System.out.println(UtilDate.diferenciaHoras(fechaFinal,fecha ));
		
		System.out.println("Terminado");
	}

}
