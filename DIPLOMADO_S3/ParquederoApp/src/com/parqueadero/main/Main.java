package com.parqueadero.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.diplomado.utils.UtilDate;
import com.parqueadero.dto.Automovil;
import com.parqueadero.dto.Campero;
import com.parqueadero.dto.IVehiculo;
import com.parqueadero.dto.Moto;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(UtilDate.goToFormat(new Date(), "YYYY-MM-dd"));
		
		int valorFacturaCompra = 0;
		
		Moto moto = new Moto();
		moto.setHoraEntrada(new Date());
		Date fechaSalida = UtilDate.addHours(moto.getHoraEntrada(), 2);
		moto.setHoraSalida(fechaSalida);	
		moto.setCascosGuarda(1);
		System.out.println(liquidar(moto,valorFacturaCompra));
		
		
		Automovil auto = new Automovil();
		auto.setHoraEntrada(new Date());
		fechaSalida = UtilDate.addHours(auto.getHoraEntrada(), 2);
		auto.setHoraSalida(fechaSalida);		
		System.out.println(liquidar(auto,valorFacturaCompra));
		
		
		Campero camp = new Campero();
		camp.setHoraEntrada(new Date());
		fechaSalida = UtilDate.addHours(camp.getHoraEntrada(), 2);
		camp.setHoraSalida(fechaSalida);		
		System.out.println(liquidar(camp,valorFacturaCompra));
		
		System.out.println("Terminado");
	}
	
	public static float liquidar(IVehiculo vehiculo, float valorFactura) {
		return vehiculo.liquidar(valorFactura);
	}
	
	

}
