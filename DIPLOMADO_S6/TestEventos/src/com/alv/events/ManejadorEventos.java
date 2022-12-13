package com.alv.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class ManejadorEventos implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Se pulso algo "+ e.getSource().getClass() + " - " +(new Date()).toString());
		if(e.getSource() instanceof JButton) {
			JButton boton = (JButton) e.getSource();
			System.out.println("Esto es un boton - " + boton.getText());
		}
		if(e.getSource() instanceof JCheckBox) {
			JCheckBox check = (JCheckBox) e.getSource();
			System.out.println("Esto es un checkBox - " + check.getText());
		}
		
		
	}

}
