package com.parqueadero.dto;

import com.diplomado.utils.UtilDate;

public class Moto extends AVehiculo{

	private int cascosGuarda;
	
	public Moto() {
		this.tarifaPorHora = 1700;
	}
	
	@Override
	public float liquidar(float valorFactura) {
		
		float valorPreliquidado = super.liquidar(valorFactura);
		
		float pagoPorCascos  = (this.cascosGuarda*300*this.numeroHoras);
				
		pagoPorCascos = pagoPorCascos - (pagoPorCascos * ((float)this.descuento/(float)100));
				
		valorPreliquidado = valorPreliquidado + pagoPorCascos;
				
		return aplicarDescuentoEspecial(valorFactura, valorPreliquidado);	
	}
	
	private float aplicarDescuentoEspecial(float valorFactura, float valorPagar) {
		if(valorFactura >= 500000) {
			valorPagar = 0;
		}		
		return valorPagar;
	}
	
	
	public int getCascosGuarda() {
		return cascosGuarda;
	}
	public void setCascosGuarda(int cascosGuarda) {
		if(cascosGuarda < 0) {
			this.cascosGuarda = 0;
		} else {
			this.cascosGuarda = cascosGuarda;
		}
		
	}
	
	

}
