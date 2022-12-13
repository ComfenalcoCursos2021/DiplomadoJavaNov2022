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
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TerceraForma extends JFrame implements ActionListener, MouseMotionListener, KeyListener {

	private JPanel contentPane;
	private JButton btnMarcarSi;
	private JButton btnMarcarNo;
	private JCheckBox cbMarca;
	private JTextField txtIngresador;
	private JLabel lblMensajeCargado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TerceraForma frame = new TerceraForma();
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
	public TerceraForma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnMarcarSi = new JButton("Marcar si");
		btnMarcarSi.setBounds(310, 27, 97, 23);
		btnMarcarSi.addActionListener(this);
		contentPane.add(btnMarcarSi);

		btnMarcarNo = new JButton("Marcar No");
		btnMarcarNo.setBounds(310, 61, 97, 23);
		btnMarcarNo.addActionListener(this);
		btnMarcarNo.addMouseMotionListener(this);		
		contentPane.add(btnMarcarNo);

		cbMarca = new JCheckBox("La marca");
		cbMarca.setBounds(310, 106, 97, 23);
		contentPane.add(cbMarca);
		
		txtIngresador = new JTextField();
		txtIngresador.setBounds(10, 11, 188, 20);
		txtIngresador.addKeyListener(this);
		contentPane.add(txtIngresador);
		txtIngresador.setColumns(10);
		
		lblMensajeCargado = new JLabel("");
		lblMensajeCargado.setFont(new Font("Meslo LG M", Font.PLAIN, 25));
		lblMensajeCargado.setBounds(10, 65, 279, 98);
		contentPane.add(lblMensajeCargado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Action");
		if (e.getSource().equals(btnMarcarSi)) {
			cbMarca.setSelected(true);
		} else if (e.getSource().equals(btnMarcarNo)) {
			cbMarca.setSelected(false);
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Dragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Moved + " + (new Date()).getTime());
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
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(txtIngresador)) {
			//if(e.getKeyCode() == 10) {
				lblMensajeCargado.setText(txtIngresador.getText());					
			//}
			
		}
		
		System.out.println(e.getKeyCode());
		
		
	}
}
