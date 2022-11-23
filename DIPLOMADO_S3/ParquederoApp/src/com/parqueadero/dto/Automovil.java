package com.parqueadero.dto;

import com.diplomado.utils.UtilDate;

public class Automovil extends AVehiculo {

	public Automovil() {
		this.tarifaPorHora = 3500;
	}
	
	@Override
	public float liquidar(float valorFactura) {		
		float valorPreliquidado = super.liquidar(valorFactura);
		return valorPreliquidado;		
	}

}
