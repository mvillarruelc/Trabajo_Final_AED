package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.MCliente;
import gui.MProducto;
import gui.Vender;
import gui.Almacen;
import gui.VerReporte;
import gui.CrearReporte;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneFondo;
	private JMenuItem mntmCerrarSesion;
	private JMenuItem mntmSalir;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Jframe
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/Imagenes/FondoCarrito1.jpg")));
		setTitle("Sistema de Ventas - Inicio");
		setBounds(100, 100, 750, 500);
		
		//Menú
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivos = new JMenu("Archivos");
		menuBar.add(mnArchivos);
		
		mntmCerrarSesion = new JMenuItem("Cerrar Sesión");
		mntmCerrarSesion.addActionListener(this);
		mntmCerrarSesion.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoCerrarSesion1.png")));
		mnArchivos.add(mntmCerrarSesion);
		
		JSeparator separator = new JSeparator();
		mnArchivos.add(separator);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoSalir1.png")));
		mnArchivos.add(mntmSalir);
		
		JLabel lblNewLabel_4 = new JLabel("|");
		menuBar.add(lblNewLabel_4);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmMCliente = new JMenuItem("M. Cliente");
		mntmMCliente.addActionListener(this);
		mntmMCliente.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoCliente1.png")));
		mnMantenimiento.add(mntmMCliente);
		
		JSeparator separator_1 = new JSeparator();
		mnMantenimiento.add(separator_1);
		
		mntmMProducto = new JMenuItem("M. Producto");
		mntmMProducto.addActionListener(this);
		mntmMProducto.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoProducto1.png")));
		mnMantenimiento.add(mntmMProducto);
		
		JLabel lblNewLabel_1 = new JLabel("|");
		menuBar.add(lblNewLabel_1);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mntmVender.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoVenta1.png")));
		mnVentas.add(mntmVender);
		
		JLabel lblNewLabel_2 = new JLabel("|");
		menuBar.add(lblNewLabel_2);
		
		JMenu mnAlmacen = new JMenu("Almacén");
		menuBar.add(mnAlmacen);
		
		mntmVerAlmacen = new JMenuItem("Ver A.");
		mntmVerAlmacen.addActionListener(this);
		mntmVerAlmacen.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoAlmacen1.png")));
		mnAlmacen.add(mntmVerAlmacen);
		
		JLabel lblNewLabel_3 = new JLabel("|");
		menuBar.add(lblNewLabel_3);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		mntmVerReporte = new JMenuItem("Ver R.");
		mntmVerReporte.addActionListener(this);
		mntmVerReporte.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoReporte1.png")));
		mnReportes.add(mntmVerReporte);
		
		JSeparator separator_2 = new JSeparator();
		mnReportes.add(separator_2);
		
		mntmCrearReporte = new JMenuItem("Crear R.");
		mntmCrearReporte.addActionListener(this);
		mntmCrearReporte.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/IconoReporte2.png")));
		mnReportes.add(mntmCrearReporte);
		
		//ContentPaneFondo
		contentPaneFondo = new JPanel();
		contentPaneFondo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneFondo);
		contentPaneFondo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/FondoSuperMercado1.jpeg")));
		
		contentPaneFondo.add(lblFondo);
		this.setLocationRelativeTo(null);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmCrearReporte) {
			do_mntmCrearReporte_actionPerformed(e);
		}
		if (e.getSource() == mntmVerReporte) {
			do_mntmVerReporte_actionPerformed(e);
		}
		if (e.getSource() == mntmVerAlmacen) {
			do_mntmVerAlmacen_actionPerformed(e);
		}
		if (e.getSource() == mntmVender) {
			do_mntmVender_actionPerformed(e);
		}
		if (e.getSource() == mntmMProducto) {
			do_mntmMProducto_actionPerformed(e);
		}
		if (e.getSource() == mntmMCliente) {
			do_mntmMCliente_actionPerformed(e);
		}
		if (e.getSource() == mntmSalir) {
			do_mntmSalir_actionPerformed(e);
		}
		if (e.getSource() == mntmCerrarSesion) {
			do_mntmCerrarSesion_actionPerformed(e);
		}
	}
	
	//Creación de Objetos
	//Objeto Mantenimiento Cliente
	MCliente mc = new MCliente();
	//Objeto Mantenimiento Producto
	MProducto mp = new MProducto();
	//Objeto Venta
	Vender v = new Vender();
	//Objeto Almacen
	Almacen a = new Almacen();
	//Objetos Reporte
	VerReporte vr = new VerReporte();
	CrearReporte cr = new CrearReporte();
	
	//JMenuItem
	private JMenuItem mntmMCliente;
	private JMenuItem mntmMProducto;
	private JMenuItem mntmVender;
	private JMenuItem mntmVerAlmacen;
	private JMenuItem mntmVerReporte;
	private JMenuItem mntmCrearReporte;
	
	//Menú Archivos Salir/Cerrar Sesión
	protected void do_mntmCerrarSesion_actionPerformed(ActionEvent e) {
		//Confirmar Cerrar Sesión
		if (JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
			//Objeto Login
			Login l = new Login();
			//Cerrar Sesion
			l.setVisible(true);
			this.dispose();
		}
	}
	protected void do_mntmSalir_actionPerformed(ActionEvent e) {
		//Confirmar Salir
		if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
			//Objeto Login
			Login l = new Login();
			//Salir
			l.setVisible(true);
			this.dispose();
		}
	}
	//Menú Abrir Ventana Mantenimiento Cliente
	protected void do_mntmMCliente_actionPerformed(ActionEvent e) {
		mc.setVisible(true);
		mc.setLocationRelativeTo(null);
	}
	
	//Menú Abrir Ventana Mantenimiento Producto
	protected void do_mntmMProducto_actionPerformed(ActionEvent e) {
		mp.setVisible(true);
		mp.setLocationRelativeTo(null);
	}
	
	//Menú Abrir Ventana Ventas
	protected void do_mntmVender_actionPerformed(ActionEvent e) {
		v.setVisible(true);
		v.requestFocus();
		v.setLocationRelativeTo(null);
	}
	
	//Menú Abrir Ventana Almacén
	protected void do_mntmVerAlmacen_actionPerformed(ActionEvent e) {
		a.setVisible(true);
		a.setLocationRelativeTo(null);
	}
	
	//Menú Abrir Ventanas Reportes
	protected void do_mntmVerReporte_actionPerformed(ActionEvent e) {
		vr.setVisible(true);
		vr.requestFocus();
		vr.setLocationRelativeTo(null);
	}
	
	protected void do_mntmCrearReporte_actionPerformed(ActionEvent e) {
		cr.setVisible(true);
		cr.requestFocus();
		cr.setLocationRelativeTo(null);
	}
}
