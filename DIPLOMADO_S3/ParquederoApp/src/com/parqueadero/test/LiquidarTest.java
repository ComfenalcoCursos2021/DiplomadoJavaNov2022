package com.parqueadero.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.diplomado.utils.UtilDate;
import com.parqueadero.dto.Moto;
import com.parqueadero.exceptions.FechaMasViejaException;

class LiquidarTest {

	@Test
	void liquidacionMotoSinCascos() throws Exception {
		
		Moto moto = new Moto();
		moto.setHoraEntrada(new Date());
		moto.setHoraSalida(UtilDate.addHours(moto.getHoraEntrada(), 2));
		
		float liquidacion = moto.liquidar(0);		
		
		assertEquals(liquidacion, 3400);
	}
	@Test
	void liquidacionMotoConCascos() throws Exception {
		
		Moto moto = new Moto();
		moto.setHoraEntrada(new Date());
		moto.setHoraSalida(UtilDate.addHours(moto.getHoraEntrada(), 2));
		moto.setCascosGuarda(1);
		float liquidacion = moto.liquidar(0);		
		
		assertEquals(liquidacion, 4000);
	}
	
	@Test
	void liquidacionMotoSinCascosDecuento50() throws Exception {
		
		Moto moto = new Moto();
		moto.setHoraEntrada(new Date());
		moto.setHoraSalida(UtilDate.addHours(moto.getHoraEntrada(), 2));
		
		float liquidacion = moto.liquidar(80000);		
		
		assertEquals(liquidacion, 1700);
	}
	@Test
	void liquidacionMotoConCascosDecuento50() throws Exception {
		
		Moto moto = new Moto();
		moto.setHoraEntrada(new Date());
		moto.setHoraSalida(UtilDate.addHours(moto.getHoraEntrada(), 2));
		moto.setCascosGuarda(1);
		float liquidacion = moto.liquidar(80000);		
		
		assertEquals(liquidacion, 2000);
	}
	
	@Test
	void liquidacionMotoConCascosDecuento100() throws Exception {
		
		Moto moto = new Moto();
		moto.setHoraEntrada(new Date());
		moto.setHoraSalida(UtilDate.addHours(moto.getHoraEntrada(), 2));
		moto.setCascosGuarda(1);
		float liquidacion = moto.liquidar(550000);		
		
		assertEquals(liquidacion, 0);
	}
	
	@Test
	void liquidacionMotoConHorasNegativas() {
		
		Moto moto = new Moto();
		moto.setHoraEntrada(new Date());
		Date fechaSalida = UtilDate.addHours(moto.getHoraEntrada(), -2);
		
		try {
			moto.setHoraSalida(fechaSalida);
		} catch (Exception e) {
			assertEquals(e.getClass(), (new FechaMasViejaException()).getClass());
		}
		
				
		
		
	}
	@Test
	void liquidacionMotoConCascosNegativos() throws Exception {
		
		Moto moto = new Moto();
		moto.setHoraEntrada(new Date());
		moto.setHoraSalida(UtilDate.addHours(moto.getHoraEntrada(), 2));
		moto.setCascosGuarda(-5);
		float liquidacion = moto.liquidar(0);		
		
		assertEquals(liquidacion, 3400);
	}
	

}
