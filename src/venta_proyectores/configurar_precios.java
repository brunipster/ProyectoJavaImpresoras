package venta_proyectores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configurar_precios extends JDialog {
	private JTextField txtAcerh7;
	private JTextField txtEpsonS9;
	private JTextField txtEpson1220;
	private JTextField txtAcerH5;
	private JTextField txtCanonLv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurar_precios dialog = new configurar_precios();
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
	public configurar_precios() {
		setTitle("Configurar Precios");
		setBounds(100, 100, 317, 266);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblAcerh7 = new JLabel("Acer H7530D                     US $");
		lblAcerh7.setBounds(10, 22, 178, 14);
		getContentPane().add(lblAcerh7);
		
		JLabel lblEpsonS9 = new JLabel("Epson PowerLite S9       US $");
		lblEpsonS9.setBounds(10, 47, 178, 14);
		getContentPane().add(lblEpsonS9);
		
		JLabel lblEpson1220 = new JLabel("Epson PowerLite 1220   US $");
		lblEpson1220.setBounds(10, 72, 178, 14);
		getContentPane().add(lblEpson1220);
		
		JLabel lblAcerH5 = new JLabel("Acer H5360                       US $");
		lblAcerH5.setBounds(10, 97, 178, 14);
		getContentPane().add(lblAcerH5);
		
		JLabel lblCanonLv = new JLabel("Canon LV-5220                US $");
		lblCanonLv.setBounds(10, 122, 178, 14);
		getContentPane().add(lblCanonLv);
		
		txtAcerh7 = new JTextField();
		txtAcerh7.setBounds(198, 19, 86, 20);
		getContentPane().add(txtAcerh7);
		txtAcerh7.setColumns(10);
		
		txtEpsonS9 = new JTextField();
		txtEpsonS9.setBounds(198, 44, 86, 20);
		getContentPane().add(txtEpsonS9);
		txtEpsonS9.setColumns(10);
		
		txtEpson1220 = new JTextField();
		txtEpson1220.setBounds(198, 69, 86, 20);
		getContentPane().add(txtEpson1220);
		txtEpson1220.setColumns(10);
		
		txtAcerH5 = new JTextField();
		txtAcerH5.setBounds(198, 94, 86, 20);
		getContentPane().add(txtAcerH5);
		txtAcerH5.setColumns(10);
		
		txtCanonLv = new JTextField();
		txtCanonLv.setBounds(198, 119, 86, 20);
		getContentPane().add(txtCanonLv);
		txtCanonLv.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(48, 168, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(159, 168, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
