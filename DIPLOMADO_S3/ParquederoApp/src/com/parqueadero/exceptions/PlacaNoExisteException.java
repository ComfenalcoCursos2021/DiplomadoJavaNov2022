package com.parqueadero.exceptions;

public class PlacaNoExisteException extends Exception{

	public PlacaNoExisteException() {
		super("La placa ingresada no existe!");
	}
}
