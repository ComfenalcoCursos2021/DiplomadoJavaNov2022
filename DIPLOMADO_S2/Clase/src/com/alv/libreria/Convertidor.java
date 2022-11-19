package com.alv.libreria;

public class Convertidor {

	private float VALOR_DOLAR = 5000;	
	
	public static String conversionStandar(float valor) {
		return "$ "+valor;
	}
	
	///GET
	public float getValorDolar() {
		return VALOR_DOLAR;
	}
	///SET
	public void setValorDolar(float valorDolar) {		
		if(Math.abs(valorDolar-VALOR_DOLAR) < 50) {
			VALOR_DOLAR = valorDolar;
		} else {
			System.out.println("NO PUEDE SER ASIGNADO ESE VALOR");
		}		
	}
	
	public float convertirPesos (float valorPesos) {
		return hacerDivision(valorPesos,VALOR_DOLAR);
	}
	
	public void convertidorDinamico() {
		System.out.println("Ingrese el valor a convertir");
		float valor = ElEscanerProyecto.entradaTeclado.nextFloat();
		float convertido = convertirPesos(valor);
		System.out.println("El valor convertido es "+convertido);
	}
	
	private float hacerDivision(float numero1, float numero2) {
		return numero1/numero2;
	}
}
