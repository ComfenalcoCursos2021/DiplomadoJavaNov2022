package com.parqueadero.formularios;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.parqueadero.service.ParqueaderoService;

public class EntradaDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPlaca;

	JSpinner spnCascosGuardar;
	JLabel lblCascosGuardar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EntradaDialog dialog = new EntradaDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EntradaDialog() {
		setModal(true);
		setTitle("Entrada");
		setBounds(100, 100, 252, 249);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPlaca = new JLabel("Placa");
			lblPlaca.setBounds(10, 31, 46, 14);
			contentPanel.add(lblPlaca);
		}
		spnCascosGuardar = new JSpinner();
		lblCascosGuardar = new JLabel("Cascos a guardar");
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(119, 28, 86, 20);
		contentPanel.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JLabel lblTipoVehiculo = new JLabel("Tipo de vehiculo");
		lblTipoVehiculo.setBounds(10, 69, 97, 14);
		contentPanel.add(lblTipoVehiculo);
		
		JComboBox cbTiposVehiculo = new JComboBox();
		cbTiposVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String opcion = (String)cb.getSelectedItem();
				if(!"MOTO".equals(opcion.toUpperCase())) {
					lblCascosGuardar.setVisible(false);
					spnCascosGuardar.setVisible(false);
					spnCascosGuardar.setValue(0);
				} else {
					lblCascosGuardar.setVisible(true);
					spnCascosGuardar.setVisible(true);
					spnCascosGuardar.setValue(0);
				}
			}
		});
		cbTiposVehiculo.setModel(new DefaultComboBoxModel(new String[] {"Moto", "Automovil", "Campero"}));
		cbTiposVehiculo.setBounds(119, 59, 86, 22);
		contentPanel.add(cbTiposVehiculo);
		
		
		lblCascosGuardar.setBounds(10, 106, 97, 14);
		contentPanel.add(lblCascosGuardar);
		
		
		spnCascosGuardar.setBounds(119, 103, 86, 20);
		contentPanel.add(spnCascosGuardar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///TODO conectar al servicio y obtener los valores
				ParqueaderoService servicio = new ParqueaderoService();
				String opcion = (String)cbTiposVehiculo.getSelectedItem();
				servicio.guardarVehiculo(opcion, txtPlaca.getText() , (int) spnCascosGuardar.getValue());
				EntradaDialog.this.dispose();
			}
		});
		btnGuardar.setBounds(68, 147, 89, 23);
		contentPanel.add(btnGuardar);
	}
}
