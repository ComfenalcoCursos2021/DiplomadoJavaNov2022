package com.alv.articulos;

import com.alv.predefinidos.Tamanio;
import com.alv.predefinidos.TipoPresentacion;

public class Cafe {

	private float precio;
	private Tamanio tamanio;
	private String marca;
	private TipoPresentacion tipoPresentacion;
	
	public Cafe() {
		this.precio  = 5000; 
		this.tamanio = Tamanio.Pequenio;
		this.tipoPresentacion = TipoPresentacion.Americano;
	}

	public float getPrecio() {
		return precio;
	}	

	

	public Tamanio getTamanio() {
		return tamanio;
	}

	public void setTamanio(Tamanio tamanio) {
		this.tamanio = tamanio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoPresentacion getTipoPresentacion() {
		return tipoPresentacion;
	}

	public void setTipoPresentacion(TipoPresentacion tipoPresentacion) {
		this.tipoPresentacion = tipoPresentacion;
	}

}
