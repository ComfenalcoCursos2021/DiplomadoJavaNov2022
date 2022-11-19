package com.alv.articulos;

public class CafeEnLeche2  {
	
	private Cafe cafe;
	public CafeEnLeche2(Cafe cafe) {
		this.cafe = cafe;
	
	}
	public float getPrecio() {		
		return this.cafe.getPrecio() + 1000;
	}	
}
