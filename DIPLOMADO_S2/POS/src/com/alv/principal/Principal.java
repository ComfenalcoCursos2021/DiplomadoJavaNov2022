package com.alv.principal;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.alv.dto.Comprador;
import com.alv.dto.Sistema;
import com.alv.ventanas.MiVentana;

public class Principal {

	public static void main(String[] args) {
		
		Comprador comprador = new Comprador();
		Comprador comprador2 = new Comprador();
		Sistema cajero = new Sistema();
		
		////ESTA ES UNA VENTA
		int valorVenta = 90000;
		
		comprador.acumularPuntos(valorVenta);
		cajero.acumularPuntos(valorVenta);
		
		cajero.getNick();
		
		//System.out.println(comprador.hashCode());
		//System.out.println(comprador2.hashCode());
		/*
		JFrame ventana = new JFrame();
		
		ventana.setPreferredSize(new Dimension(500,500));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.pack();
		ventana.setVisible(true);*/
		
		MiVentana ventana = new MiVentana();
		ventana.setVisible(true);
		
		
		System.out.println("Puntos del comprador " + comprador.getPuntos());
		System.out.println("Puntos del cajero " + cajero.getPuntos());
		
		System.out.println("Termino!");

	}

}
