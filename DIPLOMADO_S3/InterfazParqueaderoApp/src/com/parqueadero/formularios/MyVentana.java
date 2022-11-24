package com.parqueadero.formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyVentana extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyVentana frame = new MyVentana();
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
	public MyVentana() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(34, 32, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAbrirOtraVentana = new JButton("Abrir otra ventana");
		btnAbrirOtraVentana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*OtraVentana otra = new OtraVentana();
				otra.setVisible(true);*/
				VetanaModal otra = new VetanaModal();
				otra.setVisible(true);
			}
		});
		btnAbrirOtraVentana.setBounds(265, 32, 132, 58);
		contentPane.add(btnAbrirOtraVentana);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(148, 115, 30, 20);
		contentPane.add(spinner);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 171, 142, 20);
		contentPane.add(passwordField);
		
		JSlider slider = new JSlider();
		slider.setBounds(10, 294, 429, 26);
		contentPane.add(slider);
		
		JTree tree = new JTree();
		tree.setBounds(34, 151, 120, 106);
		contentPane.add(tree);
	}
}
