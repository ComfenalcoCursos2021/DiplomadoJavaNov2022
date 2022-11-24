package com.parqueadero.service;

import java.util.Date;

import com.parqueadero.dto.Moto;

public class ParqueaderoService {
	
	
	public String[] getTipoVehiculos() {
		
		String[] tipoVehiculo = new String[3];
		tipoVehiculo[0] = "Moto";
		tipoVehiculo[1] = "Automovil";
		tipoVehiculo[2] = "Campero";
		
		return tipoVehiculo;
	}
	
	public void guardarVehiculo(String placa, String tipo, int nueroCascos) {
		
		Date  fechaEntrada = new Date();
		
			
		if("MOTO".equals(tipo.toUpperCase())) {
			Moto nuevaMoto = new Moto();
			nuevaMoto.setHoraEntrada(fechaEntrada);
			nuevaMoto.setCascosGuarda(nueroCascos);
			nuevaMoto.setPagado(false);
			nuevaMoto.setPlaca(placa);
			
			DBUtil.DB_VEHICULOS.add(nuevaMoto);
		}
		
	}
	

}
