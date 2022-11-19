package com.alv.articulos;

public class CafeEnLeche extends Cafe {

	private float precioLeche;
	
	public float getPrecio() {
		this.precioLeche = 500;
		return super.getPrecio()+precioLeche;
	}
}
