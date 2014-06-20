package venta_proyectores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class consultar_proyector extends JDialog {
	private JTextField txtResolucion;
	private JTextField txtBrillo;
	private JTextField txtPrecioUSD;
	private JTextField txtPrecioSol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultar_proyector dialog = new consultar_proyector();
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
	public consultar_proyector() {
		setTitle("Consulta de Proyectores");
		setBounds(100, 100, 294, 239);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 26, 46, 14);
		getContentPane().add(lblModelo);
		
		JComboBox cboModelo = new JComboBox();		
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Acer H7530D", "Epson PowerLite S9", "Epson PowerLite 1220", "Acer H5360", "Canon LV-5220"}));
		cboModelo.setBounds(107, 23, 152, 20);
		getContentPane().add(cboModelo);
		
		JLabel lblResolucin = new JLabel("Resoluci\u00F3n");
		lblResolucin.setBounds(10, 51, 73, 14);
		getContentPane().add(lblResolucin);
		
		txtResolucion = new JTextField();
		txtResolucion.setEditable(false);
		txtResolucion.setBounds(107, 48, 152, 20);
		getContentPane().add(txtResolucion);
		txtResolucion.setColumns(10);
		
		JLabel lblBrillo = new JLabel("Brillo");
		lblBrillo.setBounds(10, 76, 46, 14);
		getContentPane().add(lblBrillo);
		
		txtBrillo = new JTextField();
		txtBrillo.setEditable(false);
		txtBrillo.setBounds(107, 73, 152, 20);
		getContentPane().add(txtBrillo);
		txtBrillo.setColumns(10);
		
		JLabel lblPrecioUSD = new JLabel("Precio (USD $)");
		lblPrecioUSD.setBounds(10, 101, 84, 14);
		getContentPane().add(lblPrecioUSD);
		
		txtPrecioUSD = new JTextField();
		txtPrecioUSD.setEditable(false);
		txtPrecioUSD.setBounds(107, 98, 152, 20);
		getContentPane().add(txtPrecioUSD);
		txtPrecioUSD.setColumns(10);
		
		JLabel lblPrecioS = new JLabel("Precio S/.");
		lblPrecioS.setBounds(10, 126, 73, 14);
		getContentPane().add(lblPrecioS);
		
		txtPrecioSol = new JTextField();
		txtPrecioSol.setEditable(false);
		txtPrecioSol.setBounds(107, 123, 152, 20);
		getContentPane().add(txtPrecioSol);
		txtPrecioSol.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCerrar.setBounds(95, 159, 89, 23);
		getContentPane().add(btnCerrar);

	}
}
