package com.alv.launch;

import com.alv.articulos.Cafe;
import com.alv.articulos.CafeEnLeche;
import com.alv.articulos.CafeEnLeche2;
import com.alv.predefinidos.Tamanio;
import com.alv.predefinidos.TipoPresentacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe cafe = new Cafe();
		cafe.setTamanio(Tamanio.Grande);
		cafe.setTipoPresentacion(TipoPresentacion.Americano);
		
		CafeEnLeche cafeEnleche = new CafeEnLeche();
		cafeEnleche.setTamanio(Tamanio.Mediano);
		cafeEnleche.setTipoPresentacion(TipoPresentacion.Granizado);
		
		
		CafeEnLeche2 cafeEnLeche2 = new CafeEnLeche2(cafe);
		
		
		
	}

}
