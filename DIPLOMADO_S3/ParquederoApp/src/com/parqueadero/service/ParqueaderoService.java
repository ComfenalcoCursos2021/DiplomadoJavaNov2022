package com.parqueadero.service;

import java.util.Date;

import com.parqueadero.dto.AVehiculo;
import com.parqueadero.dto.Automovil;
import com.parqueadero.dto.Campero;
import com.parqueadero.dto.Moto;

public class ParqueaderoService {
	
	public static String[] TIPO_VEHICULOS = new String[] {
		"Moto","Automovil","Campero"	
	};
	
	public String[] getTipoVehiculos() {		
		return ParqueaderoService.TIPO_VEHICULOS;
	}
	
	public void guardarVehiculo(String tipo, String placa, int nueroCascos) {
		
		Date  fechaEntrada = new Date();
		
			
		if("MOTO".equals(tipo.toUpperCase())) {
			Moto nuevaMoto = new Moto();
			nuevaMoto.setHoraEntrada(fechaEntrada);
			nuevaMoto.setCascosGuarda(nueroCascos);
			nuevaMoto.setPagado(false);
			nuevaMoto.setPlaca(placa);
			
			DBUtil.DB_VEHICULOS.add(nuevaMoto);
		} else if("AUTOMOVIL".equals(tipo.toUpperCase())) {
			Automovil nuevaMoto = new Automovil();
			nuevaMoto.setHoraEntrada(fechaEntrada);			
			nuevaMoto.setPagado(false);
			nuevaMoto.setPlaca(placa);
			
			DBUtil.DB_VEHICULOS.add(nuevaMoto);
		} else if("Campero".equals(tipo.toUpperCase())) {
			Campero nuevaMoto = new Campero();
			nuevaMoto.setHoraEntrada(fechaEntrada);			
			nuevaMoto.setPagado(false);
			nuevaMoto.setPlaca(placa);
			
			DBUtil.DB_VEHICULOS.add(nuevaMoto);
		}
		
	}
	
	
	
	public float getLiquidacion(String placa, float valorFactura) throws Exception {
		AVehiculo vehiculo = getVehiculoByPlaca(placa);
		if(vehiculo == null) {
			///excepciones
		}
		vehiculo.setHoraSalida(new Date());
		return vehiculo.liquidar(valorFactura);		
	}
	
	public void setPagado(String placa) {
		AVehiculo vehiculo = getVehiculoByPlaca(placa);
		vehiculo.setPagado(true);
	}
	
	
	private AVehiculo getVehiculoByPlaca(String placa) {
		return DBUtil.DB_VEHICULOS.stream().filter(x-> x.getPlaca().equals(placa) && !x.isPagado()).findFirst().get();
	}

}
