package com.alv.main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.alv.events.ManejadorCuartaForma;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CuartaForma extends JFrame {

	private JPanel lienzo;
	private JButton btnMarcarSi;
	private JButton btnMarcarNo;
	private JCheckBox cbMarca;
	private JTextField txtIngresador;
	private JLabel lblMensajeCargado;
	private ManejadorCuartaForma manejador = new ManejadorCuartaForma(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuartaForma frame = new CuartaForma();
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
	public CuartaForma() {
		setTitle("CUARTA FORMA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		lienzo = new JPanel();
		lienzo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(lienzo);
		lienzo.setLayout(null);

		btnMarcarSi = new JButton("Marcar si");
		btnMarcarSi.setBounds(310, 27, 97, 23);
		btnMarcarSi.addActionListener(manejador);
		lienzo.add(btnMarcarSi);

		btnMarcarNo = new JButton("Marcar No");
		btnMarcarNo.setBounds(310, 61, 97, 23);
		btnMarcarNo.addActionListener(manejador);
		btnMarcarNo.addMouseMotionListener(manejador);
		lienzo.add(btnMarcarNo);

		cbMarca = new JCheckBox("La marca");
		cbMarca.setBounds(310, 106, 97, 23);
		lienzo.add(cbMarca);

		txtIngresador = new JTextField();
		txtIngresador.setBounds(10, 11, 188, 20);
		txtIngresador.addKeyListener(manejador);
		lienzo.add(txtIngresador);
		txtIngresador.setColumns(10);

		lblMensajeCargado = new JLabel("");
		lblMensajeCargado.setFont(new Font("Meslo LG M", Font.PLAIN, 25));
		lblMensajeCargado.setBounds(10, 65, 279, 98);
		lienzo.add(lblMensajeCargado);
	}

	public JButton getBtnMarcarSi() {
		return btnMarcarSi;
	}
	public JButton getBtnMarcarNo() {
		return btnMarcarNo;
	}
	public JCheckBox getCbMarca() {
		return cbMarca;
	}

	public JTextField getTxtIngresador() {
		return txtIngresador;
	}

	public JLabel getLblMensajeCargado() {
		return lblMensajeCargado;
	}

	

}
