package com.alv.main;

import com.alv.libreria.Convertidor;
import com.alv.libreria.ElEscanerProyecto;
import com.alv.libreria.ModificadorTextos;

public class Principal2 {

	public static void main (String[] args) {
		
		Convertidor contabilidad = new Convertidor();
		Convertidor marketing = new Convertidor();
		
		System.out.println(String.valueOf(contabilidad.convertirPesos(50000)));
		System.out.println(String.valueOf(marketing.convertirPesos(50000)));
		
		contabilidad.setValorDolar(4900);
		
		System.out.println(String.valueOf(contabilidad.convertirPesos(50000)));
		System.out.println(String.valueOf(marketing.convertirPesos(50000)));
		
		marketing.getValorDolar();
		
		System.out.println(Convertidor.conversionStandar(54756));
		
		Principal2 prin = new Principal2();
		prin.welcome();
		
		contabilidad.convertidorDinamico();
		
		float valorPesos = ElEscanerProyecto.entradaTeclado.nextFloat();
		System.out.println("Valor convertido " + contabilidad.convertirPesos(valorPesos));
		
		
		System.out.println("Terminado!!!");
	}
	
	public void welcome() {
		System.out.println("El mensaje de bienvenida");
		
	}
}
