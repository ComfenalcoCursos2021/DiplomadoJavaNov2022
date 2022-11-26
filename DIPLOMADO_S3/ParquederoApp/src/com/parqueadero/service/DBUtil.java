package com.parqueadero.service;

import java.util.ArrayList;
import java.util.List;

import com.diplomado.utils.UtilDate;
import com.parqueadero.dto.AVehiculo;

public class DBUtil {
	
	public static List<AVehiculo> DB_VEHICULOS = new ArrayList<AVehiculo>();
	
	public static void imprimirList() {
		
		for (AVehiculo aVehiculo : DB_VEHICULOS) {			
			System.out.println(aVehiculo);
		}
		
		
	}
	public static void envejecer() {
		for (AVehiculo aVehiculo : DB_VEHICULOS) {			
			aVehiculo.setHoraEntrada(UtilDate.addHours(aVehiculo.getHoraEntrada(), -2));
		}
		imprimirList();
	}

}
