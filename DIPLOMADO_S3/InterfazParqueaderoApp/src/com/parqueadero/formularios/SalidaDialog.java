package com.parqueadero.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.parqueadero.exceptions.PlacaNoExisteException;
import com.parqueadero.service.ParqueaderoService;

public class SalidaDialog extends JDialog {

	private ParqueaderoService servicio = new ParqueaderoService();
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPlaca;
	private JTextField txtFactura;
	private JLabel lblValorLiquidado = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SalidaDialog dialog = new SalidaDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SalidaDialog() {
		setTitle("Salida");
		setModal(true);
		setBounds(100, 100, 277, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblBuscaPlaca = new JLabel("Placa");
		lblBuscaPlaca.setBounds(27, 27, 46, 14);
		contentPanel.add(lblBuscaPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(125, 24, 86, 20);
		contentPanel.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					float valor = servicio.getLiquidacion(txtPlaca.getText(), Float.valueOf(txtFactura.getText()));
					lblValorLiquidado.setText(String.valueOf(valor));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (PlacaNoExisteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBuscar.setBounds(135, 83, 65, 23);
		contentPanel.add(btnBuscar);
		
		
		lblValorLiquidado.setForeground(new Color(255, 0, 0));
		lblValorLiquidado.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorLiquidado.setFont(new Font("Meslo LG M", Font.PLAIN, 24));
		lblValorLiquidado.setBounds(27, 137, 217, 59);
		contentPanel.add(lblValorLiquidado);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				servicio.setPagado(txtPlaca.getText());
				SalidaDialog.this.dispose();
			}
		});
		btnPagar.setBounds(83, 227, 104, 23);
		contentPanel.add(btnPagar);
		
		JLabel lblFactura = new JLabel("Valor factura");
		lblFactura.setToolTipText("Valor factura para aplicar descuento");
		lblFactura.setBounds(27, 55, 94, 14);
		contentPanel.add(lblFactura);
		
		txtFactura = new JTextField();
		txtFactura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFactura.setColumns(10);
		txtFactura.setBounds(125, 52, 86, 20);
		contentPanel.add(txtFactura);
	}
}
