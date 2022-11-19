package com.alv.dto;

public class Coordenada {

	private float x;
	private float y;
	
	public Coordenada () {
		this.x = 0;
		this.y = 0;
	}
	
	public Coordenada(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void adicionar(Coordenada x) {
		this.x = this.x + x.x;
		this.y = this.y + x.y;
	}
	public void adicionar(float valorSumar) {
		this.x = this.x + valorSumar;
		this.y = this.y + valorSumar;
	}
	
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	
	public static  Coordenada sumar(Coordenada a, Coordenada b) {
		Coordenada respuesta = new Coordenada();
		
		respuesta.x = a.x + b.x;
		respuesta.y = a.y + b.y;
		
		return respuesta;
		
	}
	
}
