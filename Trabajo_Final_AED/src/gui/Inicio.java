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
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

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
					frame.setExtendedState(MAXIMIZED_BOTH);
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/Imagenes/FondoCarrito1.jpg")));
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
		
		JMenuItem mntmMClientes = new JMenuItem("M. Clientes");
		mnMantenimiento.add(mntmMClientes);
		
		JSeparator separator_1 = new JSeparator();
		mnMantenimiento.add(separator_1);
		
		JMenuItem mntmMProductos = new JMenuItem("M. Productos");
		mntmMProductos.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoProducto1.png")));
		mnMantenimiento.add(mntmMProductos);
		
		JLabel lblNewLabel_1 = new JLabel("|");
		menuBar.add(lblNewLabel_1);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem mntmVender = new JMenuItem("Vender");
		mntmVender.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoVenta1.png")));
		mnVentas.add(mntmVender);
		
		JLabel lblNewLabel_2 = new JLabel("|");
		menuBar.add(lblNewLabel_2);
		
		JMenu mnAlmacen = new JMenu("Almacén");
		menuBar.add(mnAlmacen);
		
		JMenuItem mntmVerAlmacen = new JMenuItem("Ver A.");
		mntmVerAlmacen.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoAlmacen1.png")));
		mnAlmacen.add(mntmVerAlmacen);
		
		JLabel lblNewLabel_3 = new JLabel("|");
		menuBar.add(lblNewLabel_3);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenuItem mntmVerReporte = new JMenuItem("Ver R.");
		mntmVerReporte.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoReporte1.png")));
		mnReportes.add(mntmVerReporte);
		
		JSeparator separator_2 = new JSeparator();
		mnReportes.add(separator_2);
		
		JMenuItem mntmCrearReporte = new JMenuItem("Crear R.");
		mntmCrearReporte.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoReporte2.png")));
		mnReportes.add(mntmCrearReporte);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/FondoSuperMercado1.jpeg")));
		
		contentPane.add(lblFondo);
		this.setLocationRelativeTo(null);
		
	}
}
