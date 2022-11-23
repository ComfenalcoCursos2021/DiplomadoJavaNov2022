package com.parqueadero.main;

import com.parqueadero.dto.Automovil;
import com.parqueadero.dto.Campero;
import com.parqueadero.dto.IVehiculo;
import com.parqueadero.dto.Moto;

public class EscalarLiquidacion  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Moto moto = new Moto();
		Automovil carro = new Automovil();
		Campero camp = new Campero();
		
		System.out.println(liquidar(moto,15000));
		System.out.println(liquidar(carro,25000));
		System.out.println(liquidar(camp,980000));
		
		System.out.println("Termino el escalado en liquidacion");
	}
	
	public static float liquidar(Object objeto, float valorFactura) {
		
		if(objeto instanceof Moto ) {			
			return 1700;
		}
		if(objeto instanceof Automovil ) {
			return 3500;
		}
		if(objeto instanceof Campero ) {
			return 4500;
		}
		
		return 0;
		
	}

}
