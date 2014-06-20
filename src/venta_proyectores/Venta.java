package venta_proyectores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Venta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venta frame = new Venta();//cambiar login por Venta y JFrame por Venta
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
	public Venta() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Cibertec\\IAlgoritmia\\Proyecto_01\\image\\venta.jpg"));
		setTitle("Venta de Proyectores Multimedia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 439);
		setLocationRelativeTo(null);//para mantener el jframe al centro de la pantalla
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar mnuBar = new JMenuBar();
		mnuBar.setBounds(0, 0, 350, 21);
		contentPane.add(mnuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();//salir
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnuBar.add(mnMantenimiento);
		
		JMenuItem mntmConsultarProyector = new JMenuItem("Consultar Proyector");
		mntmConsultarProyector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultar_proyector cpro = new consultar_proyector();
				cpro.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmConsultarProyector);
		
		JMenuItem mntmConfigurarPrecios = new JMenuItem("Configurar Precios");
		mntmConfigurarPrecios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configurar_precios cpre = new configurar_precios();
				cpre.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmConfigurarPrecios);
		
		JMenuItem mntmListarProyectores = new JMenuItem("Listar Proyectores");
		mntmListarProyectores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listado_proyectores lip = new listado_proyectores();
				lip.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmListarProyectores);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnuBar.add(mnVentas);
		
		JMenuItem mntmVenderProyectores = new JMenuItem("Vender Proyectores");
		mntmVenderProyectores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vender_proyector vep = new vender_proyector();
				vep.setVisible(true);
			}
		});
		mnVentas.add(mntmVenderProyectores);
		
		JMenuItem mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generar_reporte ger = new generar_reporte();
				ger.setVisible(true);
			}
		});
		mnVentas.add(mntmGenerarReportes);
		
		JMenu mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnuBar.add(mnConfiguracion);
		
		JMenuItem mntmCDescuentos = new JMenuItem("Descuentos");
		mntmCDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descuentos des = new descuentos();
				des.setVisible(true);
			}
		});
		mnConfiguracion.add(mntmCDescuentos);
		
		JMenuItem mntmCTipoDeCambio = new JMenuItem("Tipo de Cambio");
		mntmCTipoDeCambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipo_de_cambio tic = new tipo_de_cambio();
				tic.setVisible(true);
			}
		});
		mnConfiguracion.add(mntmCTipoDeCambio);
		
		JMenuItem mntmCCantOptVentas = new JMenuItem("Cantidad \u00D3ptima de Ventas");
		mntmCCantOptVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidad_optima_venta cov = new cantidad_optima_venta();
				cov.setVisible(true);
			}
		});
		mnConfiguracion.add(mntmCCantOptVentas);
	}
}
