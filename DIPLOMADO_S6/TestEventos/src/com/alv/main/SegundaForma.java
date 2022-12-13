package com.alv.main;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.alv.events.ManejadorEventos;
import javax.swing.JCheckBox;

public class SegundaForma extends JFrame {

	private JPanel contentPane;
	private ManejadorEventos manejador = new ManejadorEventos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaForma frame = new SegundaForma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SegundaForma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSegundaForma = new JButton("SegundaForma");		
		btnSegundaForma.setBounds(75, 50, 131, 51);
		btnSegundaForma.addActionListener(manejador);
		contentPane.add(btnSegundaForma);
		
		JButton btnSecundario = new JButton("Secundario");
		btnSecundario.setBounds(285, 172, 89, 23);
		btnSecundario.addActionListener(manejador);
		contentPane.add(btnSecundario);
		
		JCheckBox cbCualquiera = new JCheckBox("El cualquieras");
		cbCualquiera.setBounds(49, 172, 97, 23);
		cbCualquiera.addActionListener(manejador);
		contentPane.add(cbCualquiera);
	}
}
