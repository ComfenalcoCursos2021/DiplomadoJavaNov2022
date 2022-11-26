package com.parqueadero.service;

import java.util.Date;

import com.parqueadero.dto.AVehiculo;
import com.parqueadero.dto.Automovil;
import com.parqueadero.dto.Campero;
import com.parqueadero.dto.Moto;
import com.parqueadero.exceptions.PlacaNoExisteException;

public class ParqueaderoService {
	
	public static String[] TIPO_VEHICULOS = new String[] {
		"Moto","Automovil","Campero"	
	};
	
	public String[] getTipoVehiculos() {		
		return ParqueaderoService.TIPO_VEHICULOS;
	}
	public void envejecer() {
		DBUtil.envejecer();
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
			Automovil carro = new Automovil();
			carro.setHoraEntrada(fechaEntrada);			
			carro.setPagado(false);
			carro.setPlaca(placa);
			
			DBUtil.DB_VEHICULOS.add(carro);
		} else if("CAMPERO".equals(tipo.toUpperCase())) {
			Campero camp = new Campero();
			camp.setHoraEntrada(fechaEntrada);			
			camp.setPagado(false);
			camp.setPlaca(placa);
			
			DBUtil.DB_VEHICULOS.add(camp);
			
		}
		DBUtil.imprimirList();
		
	}
	
	
	
	
	
	
	public float getLiquidacion(String placa, float valorFactura) throws Exception {
		AVehiculo vehiculo = getVehiculoByPlaca(placa);
		
		if(vehiculo == null) {
			throw new PlacaNoExisteException();
		}
		
		vehiculo.setHoraSalida(new Date());
		return vehiculo.liquidar(valorFactura);		
	}
	
	public void setPagado(String placa) {
		AVehiculo vehiculo = getVehiculoByPlaca(placa);
		vehiculo.setPagado(true);
	}
	
	
	private AVehiculo getVehiculoByPlaca(String placa) {
		AVehiculo elBuscado = DBUtil.DB_VEHICULOS
				.stream().filter( x -> x.getPlaca().equals(placa) && !x.isPagado()
						).findFirst().get();
		return elBuscado;
	}

}
