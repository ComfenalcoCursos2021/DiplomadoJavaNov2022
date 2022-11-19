package com.alv.articulos;

public class Aditivo {
	private Gasolina gas;
	
	public Aditivo(Gasolina gasolina) {
		this.gas = gasolina;
	}
	
	public float getPrecio() {
		return gas.getPrecio() + 19000;
	}
}
