package com.alv.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;

import com.alv.main.CuartaForma;

public class ManejadorCuartaForma implements ActionListener, KeyListener, MouseMotionListener {

	private CuartaForma cuarta;
	
	public ManejadorCuartaForma(CuartaForma cuarta) {
		this.cuarta = cuarta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Action");
		if (e.getSource().equals(cuarta.getBtnMarcarSi())) {
			cuarta.getCbMarca().setSelected(true);
			
			cuarta.getBtnMarcarNo().setText("No lo clickee");
			System.out.println("SE HIZO LA MALDAD");
			
		} else if (e.getSource().equals(cuarta.getBtnMarcarNo())) {
			cuarta.getCbMarca().setSelected(false);
		}
		
	}
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getSource().equals(cuarta.getTxtIngresador())) {
			//if(e.getKeyCode() == 10) {
				cuarta.getLblMensajeCargado().setText(cuarta.getTxtIngresador().getText());					
			//}			
		}		
		System.out.println(e.getKeyCode());
		
	}

	


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
