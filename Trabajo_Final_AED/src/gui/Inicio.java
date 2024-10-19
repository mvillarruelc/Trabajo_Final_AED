package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.JLabel;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setTitle("Sistema de Ventas - Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivos = new JMenu("Archivos");
		menuBar.add(mnArchivos);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar Sesión");
		mnArchivos.add(mntmCerrarSesion);
		
		JSeparator separator = new JSeparator();
		mnArchivos.add(separator);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivos.add(mntmSalir);
		
		JLabel lblNewLabel_4 = new JLabel("|");
		menuBar.add(lblNewLabel_4);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mnMantenimiento.add(mntmClientes);
		
		JSeparator separator_1 = new JSeparator();
		mnMantenimiento.add(separator_1);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mnMantenimiento.add(mntmProductos);
		
		JLabel lblNewLabel_1 = new JLabel("|");
		menuBar.add(lblNewLabel_1);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem mntmVentas = new JMenuItem("Ventas");
		mnVentas.add(mntmVentas);
		
		JLabel lblNewLabel_2 = new JLabel("|");
		menuBar.add(lblNewLabel_2);
		
		JMenu mnAlmacen = new JMenu("Almacén");
		menuBar.add(mnAlmacen);
		
		JMenuItem mntmAlmacen = new JMenuItem("Almacén");
		mnAlmacen.add(mntmAlmacen);
		
		JLabel lblNewLabel_3 = new JLabel("|");
		menuBar.add(lblNewLabel_3);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		this.setLocationRelativeTo(null);
		
	}
}
