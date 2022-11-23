package com.parqueadero.dto;

public class Campero extends AVehiculo {

	public Campero() {
		this.tarifaPorHora=4500;
	}
	
	@Override
	public float liquidar(float valorFactura) {
		float valorPreliquidado = super.liquidar(valorFactura);
		return valorPreliquidado;
	}

}
