package com.parqueadero.dto;

import java.util.Date;

import com.diplomado.utils.UtilDate;
import com.parqueadero.exceptions.FechaMasViejaException;

public abstract class AVehiculo implements IVehiculo {
	
	protected Date horaEntrada;
	protected Date horaSalida;
	
	protected float tarifaPorHora;
	protected int numeroHoras;
	protected int descuento;
	
	protected String placa;
	protected boolean isPagado = false;
	
	
	public float liquidar(float valorFactura) {
		
		this.numeroHoras = (int) UtilDate.diferenciaHoras(this.horaSalida, this.horaEntrada);
		if(this.numeroHoras < 0) {
			this.numeroHoras = 0;
		}
		float liquidacion = numeroHoras * this.tarifaPorHora;
				
		this.descuento = obtenerDescuento(valorFactura);		
		
		return liquidacion - (liquidacion*this.descuento/100);
	}
	
	

	private int obtenerDescuento(float valorFactura) {
		int descuento = 0;
		if(valorFactura >= 60000 && valorFactura <= 100000) {
			descuento = 50;
		} else if (valorFactura >= 100000 && valorFactura <= 160000) {
			descuento = 60;
		} else if (valorFactura >= 160000) {
			descuento = 70;
		}
		return descuento;
	}
	
	public Date getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) throws Exception {
		
		long diferencia = UtilDate.diferenciaHoras(horaSalida, this.horaEntrada);
		if(diferencia < 0) {
			throw new FechaMasViejaException();
		}
		this.horaSalida = horaSalida;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isPagado() {
		return isPagado;
	}
	public void setPagado(boolean isPagado) {
		this.isPagado = isPagado;
	}
	
	

}
