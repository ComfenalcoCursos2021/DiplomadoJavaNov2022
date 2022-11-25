package com.parqueadero.formularios;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BienvenidaFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BienvenidaFrame frame = new BienvenidaFrame();
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
	public BienvenidaFrame() {
		setResizable(false);
		setTitle("Bienvenida");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programas\\cmder\\vendor\\git-for-windows\\usr\\share\\git\\git-for-windows.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrada = new JButton("Entrada");
		btnEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntradaDialog entrada = new EntradaDialog();
				entrada.setVisible(true);
			}
		});
		btnEntrada.setBounds(32, 45, 123, 159);
		contentPane.add(btnEntrada);
		
		JButton btnSalida = new JButton("Salida");
		btnSalida.setBounds(165, 45, 123, 159);
		contentPane.add(btnSalida);
	}

}
