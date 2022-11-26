package com.parqueadero.formularios;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.parqueadero.service.ParqueaderoService;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_F12) {
					
				}
			}
		});
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
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalidaDialog salida = new SalidaDialog();
				salida.setVisible(true);
			}
		});
		btnSalida.setBounds(165, 45, 123, 159);
		contentPane.add(btnSalida);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParqueaderoService servicio = new ParqueaderoService();
				servicio.envejecer();
			}
		});
		btnNewButton.setBounds(296, 11, 23, 23);
		contentPane.add(btnNewButton);
	}

}
