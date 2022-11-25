package com.parqueadero.service.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.diplomado.utils.UtilDate;
import com.parqueadero.dto.AVehiculo;
import com.parqueadero.service.DBUtil;
import com.parqueadero.service.ParqueaderoService;

class ParqueaderoServiceTest {

	@Test
	void testGetTipoVehiculos() {
		ParqueaderoService service = new ParqueaderoService();
		
		String[] tiposVehiculo = service.getTipoVehiculos();
		
		assertEquals(tiposVehiculo.length, 3);
		assertEquals("Moto", tiposVehiculo[0]);
		assertEquals("Automovil", tiposVehiculo[1]);
		assertEquals("Campero", tiposVehiculo[2]);
		
	}

	@Test
	void testGuardarVehiculo() {
		ParqueaderoService service = new ParqueaderoService();
		DBUtil.DB_VEHICULOS.clear();
		service.guardarVehiculo("Moto", "A1", 1);
		assertEquals(DBUtil.DB_VEHICULOS.size(), 1);		
		service.guardarVehiculo("Automovil", "A2", 0);
		assertEquals(DBUtil.DB_VEHICULOS.size(), 2);
		
		service.guardarVehiculo("Campero", "A3", 0);
		assertEquals(DBUtil.DB_VEHICULOS.size(), 3);
		DBUtil.imprimirList();
		
	}
	
	@Test
	void testLiquidar() throws Exception {
		ParqueaderoService service = new ParqueaderoService();
		DBUtil.DB_VEHICULOS.clear();
		service.guardarVehiculo("Moto", "A1", 1);
		
		AVehiculo vehiculo = DBUtil.DB_VEHICULOS.get(0);
		vehiculo.setHoraEntrada(UtilDate.addHours(new Date(), -1));
		
		float valor = service.getLiquidacion("A1", 0);
		assertEquals(valor, 2000);
	}
	
	@Test
	void testMarcarPago() throws Exception {
		ParqueaderoService service = new ParqueaderoService();
		DBUtil.DB_VEHICULOS.clear();
		service.guardarVehiculo("Moto", "A1", 1);
		service.getLiquidacion("A1", 0);
		service.setPagado("A1");
		
		AVehiculo vehiculo = DBUtil.DB_VEHICULOS.get(0);
		
		assertTrue(vehiculo.isPagado());		
	}
	@Test
	void testMarcarPagoExcepcion() {
		ParqueaderoService service = new ParqueaderoService();
		DBUtil.DB_VEHICULOS.clear();
		service.guardarVehiculo("Moto", "A1", 1);
		
		try {
			service.getLiquidacion("A1", 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			service.setPagado("A3");
			assertTrue(false);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(true);
		}
		
		
	}
	
	@Test
	void testLiquidacionExcepcion() {
		ParqueaderoService service = new ParqueaderoService();
		DBUtil.DB_VEHICULOS.clear();
		service.guardarVehiculo("Moto", "A1", 1);
		
		try {
			service.getLiquidacion("A3", 0);
			assertTrue(false);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(true);
		}	
		
	}

}
