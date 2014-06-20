package venta_proyectores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class descuentos extends JDialog {
	private JTextField txt1a5Unid;
	private JTextField txt6a10Unid;
	private JTextField txt11a15Unid;
	private JTextField txtMasde15Unid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					descuentos dialog = new descuentos();
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
	public descuentos() {
		setTitle("Configuraci\u00F3n de los porcentajes de Descuento");
		setBounds(100, 100, 407, 170);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblDeA = new JLabel("1 a 5 Unidades");
		lblDeA.setBounds(29, 14, 96, 14);
		getContentPane().add(lblDeA);
		
		JLabel lblA = new JLabel("6 a 10 Unidades");
		lblA.setBounds(29, 39, 109, 14);
		getContentPane().add(lblA);
		
		JLabel lblA_1 = new JLabel("11 a 15 Unidades");
		lblA_1.setBounds(29, 64, 109, 14);
		getContentPane().add(lblA_1);
		
		JLabel lblMsDe = new JLabel("M\u00E1s de 15 Unidades");
		lblMsDe.setBounds(29, 89, 114, 14);
		getContentPane().add(lblMsDe);
		
		txt1a5Unid = new JTextField();
		txt1a5Unid.setBounds(145, 11, 86, 20);
		getContentPane().add(txt1a5Unid);
		txt1a5Unid.setColumns(10);
		
		txt6a10Unid = new JTextField();
		txt6a10Unid.setBounds(145, 36, 86, 20);
		getContentPane().add(txt6a10Unid);
		txt6a10Unid.setColumns(10);
		
		txt11a15Unid = new JTextField();
		txt11a15Unid.setBounds(145, 61, 86, 20);
		getContentPane().add(txt11a15Unid);
		txt11a15Unid.setColumns(10);
		
		txtMasde15Unid = new JTextField();
		txtMasde15Unid.setBounds(145, 86, 86, 20);
		getContentPane().add(txtMasde15Unid);
		txtMasde15Unid.setColumns(10);
		
		JLabel label = new JLabel("%");
		label.setBounds(241, 14, 46, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("%");
		label_1.setBounds(241, 39, 46, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("%");
		label_2.setBounds(241, 64, 46, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("%");
		label_3.setBounds(241, 89, 46, 14);
		getContentPane().add(label_3);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(292, 30, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(292, 60, 89, 23);
		getContentPane().add(btnCancelar);

	}
}
