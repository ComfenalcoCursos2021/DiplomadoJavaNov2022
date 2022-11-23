package com.parqueadero.exceptions;

public class FechaMasViejaException extends Exception{

	public FechaMasViejaException() {
		super("La hora de salida no puede ser menor a la hora de entrada");
	}

	
}
