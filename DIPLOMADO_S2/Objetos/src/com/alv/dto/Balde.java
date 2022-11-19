package com.alv.dto;


/*
 * 
 * DOS VALDES 
 * 1 DE 5 LITROS
 * 1 DE 3 LITROS
 * 
 * QUE DEBEMOS HACER PARA QUE EN UN VALDE QUEDEN EXACTAMENTE 4 LITROS
 * 
 * */

public class Balde {

	private short capacidad;	
	private short contenido;
	
	
	public Balde(short capacidadDefinida) {
		this.capacidad = capacidadDefinida;
		this.contenido = 0;
	}
	
	
	public void vaciar() {
		contenido = 0;
	}
	public void llenar() {
		contenido = capacidad;
	}	
	
	public void vaciarEn(Balde otroBalde) {
		
		short cuantoPuedeRecibirOtroBalde = (short) (otroBalde.capacidad - otroBalde.contenido);
		
		if(this.contenido > cuantoPuedeRecibirOtroBalde) {			
			
			this.contenido = (short) (this.contenido - cuantoPuedeRecibirOtroBalde);
			otroBalde.contenido = (short) (otroBalde.contenido + cuantoPuedeRecibirOtroBalde);
		} else {
			otroBalde.contenido =(short) (otroBalde.contenido + this.contenido);
			this.contenido = 0;			 
		}
		
	}
	
	public short getContenido() {
		return contenido;
	}
	public short getCapacidad() {
		return capacidad;
	}
	
}
