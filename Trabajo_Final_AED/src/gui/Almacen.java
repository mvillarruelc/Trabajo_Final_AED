package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

import clases.Producto;
import arraylist.Array_Producto;

public class Almacen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Almacen frame = new Almacen();
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
	public Almacen() {
		setTitle("Ver Almacén");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Almacen.class.getResource("/Imagenes/FondoCarrito1-3840x2160.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 664, 389);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código Producto");
		modelo.addColumn("Nombre Producto");
		modelo.addColumn("Precio Producto");
		modelo.addColumn("Stock Actual");
		modelo.addColumn("Stock Mínimo");
		modelo.addColumn("Stock Máximo");
		table.setModel(modelo);
		
		listar();
	}
	//Creación de Objeto
	Array_Producto aProducto = new Array_Producto();
	//Métodos
	public void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < aProducto.tamano(); i++) {
	        Producto producto = aProducto.obtener(i);
	        Object[] fila = {
	        	producto.getCodProd(),
	        	producto.getNom(),
	        	producto.getPre(),
	        	producto.getStkActual(),
	        	producto.getStkMin(),
	        	producto.getStkMax()
	        };
	        modelo.addRow(fila);
	    }
	}
}
