package venta_proyectores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cantidad_optima_venta extends JDialog {
	private JTextField txtCantOp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cantidad_optima_venta dialog = new cantidad_optima_venta();
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
	public cantidad_optima_venta() {
		setTitle("Configuraci\u00F3n de la cantidad \u00F3ptima de ventas");
		setBounds(100, 100, 334, 149);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de ventas");
		lblCantidadptimaDe.setBounds(31, 24, 154, 14);
		getContentPane().add(lblCantidadptimaDe);
		
		txtCantOp = new JTextField();
		txtCantOp.setBounds(195, 21, 86, 20);
		getContentPane().add(txtCantOp);
		txtCantOp.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(70, 66, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(169, 66, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
