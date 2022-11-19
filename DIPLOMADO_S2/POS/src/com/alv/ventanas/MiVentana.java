package com.alv.ventanas;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MiVentana extends JFrame {
	
	
	
	public void setVisible(boolean visible) {
		this.setPreferredSize(new Dimension(500,500));		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();		
		super.setVisible(visible);		
	}
}
