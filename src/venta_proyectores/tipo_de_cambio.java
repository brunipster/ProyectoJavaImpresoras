package venta_proyectores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tipo_de_cambio extends JDialog {
	private JTextField txtTipodeCambio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tipo_de_cambio dialog = new tipo_de_cambio();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public tipo_de_cambio() {
		setTitle("Configuraci\u00F3n del tipo de cambio");
		setBounds(100, 100, 283, 154);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblTipoDeCambio = new JLabel("Tipo de cambio  1$ = S/.");
		lblTipoDeCambio.setBounds(10, 25, 141, 14);
		getContentPane().add(lblTipoDeCambio);
		
		txtTipodeCambio = new JTextField();
		txtTipodeCambio.setBounds(160, 22, 86, 20);
		getContentPane().add(txtTipodeCambio);
		txtTipodeCambio.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(21, 63, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(149, 63, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
