package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arraylist.Array_Producto;
import clases.Producto;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class MProducto extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtActual;
	private JTextField txtMinimo;
	private JTextField txtMaximo;
	private JLabel lblStkMx;
	private JLabel lblStkMn;
	private JLabel lblStkActual;
	private JLabel lblPrecio;
	private JLabel lblNombre;
	private JLabel lblCodigo;
	private JButton btnIngresar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JButton btnLimpiar;
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
					MProducto frame = new MProducto();
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
	public MProducto() {
		setTitle("Mantenimiento Producto");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MProducto.class.getResource("/Imagenes/FondoCarrito1-3840x2160.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(80, 11, 130, 20);
		contentPane.add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(80, 50, 130, 20);
		contentPane.add(txtNombre);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(80, 89, 130, 20);
		contentPane.add(txtPrecio);
		
		txtActual = new JTextField();
		txtActual.setColumns(10);
		txtActual.setBounds(80, 129, 130, 20);
		contentPane.add(txtActual);
		
		txtMinimo = new JTextField();
		txtMinimo.setColumns(10);
		txtMinimo.setBounds(80, 169, 130, 20);
		contentPane.add(txtMinimo);
		
		txtMaximo = new JTextField();
		txtMaximo.setColumns(10);
		txtMaximo.setBounds(80, 209, 130, 20);
		contentPane.add(txtMaximo);
		
		lblStkMx = new JLabel("Stk. Máx");
		lblStkMx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStkMx.setBounds(10, 211, 60, 14);
		contentPane.add(lblStkMx);
		
		lblStkMn = new JLabel("Stk. Mín");
		lblStkMn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStkMn.setBounds(10, 171, 60, 14);
		contentPane.add(lblStkMn);
		
		lblStkActual = new JLabel("Stk. Actual");
		lblStkActual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStkActual.setBounds(10, 131, 60, 14);
		contentPane.add(lblStkActual);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecio.setBounds(10, 91, 60, 14);
		contentPane.add(lblPrecio);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(10, 52, 60, 14);
		contentPane.add(lblNombre);
		
		lblCodigo = new JLabel("Código");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodigo.setBounds(10, 13, 60, 14);
		contentPane.add(lblCodigo);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setIcon(new ImageIcon(MProducto.class.getResource("/Imagenes/IconoAgregarProducto1.png")));
		btnIngresar.setBounds(10, 255, 200, 40);
		contentPane.add(btnIngresar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setIcon(new ImageIcon(MProducto.class.getResource("/Imagenes/IconoModificarProducto1.png")));
		btnModificar.setBounds(10, 306, 200, 40);
		contentPane.add(btnModificar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setIcon(new ImageIcon(MProducto.class.getResource("/Imagenes/IconoConsultarProducto1.png")));
		btnConsultar.setBounds(10, 357, 200, 40);
		contentPane.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setIcon(new ImageIcon(MProducto.class.getResource("/Imagenes/IconoEliminarProducto1.png")));
		btnEliminar.setBounds(10, 408, 200, 40);
		contentPane.add(btnEliminar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setIcon(new ImageIcon(MProducto.class.getResource("/Imagenes/IconoListarProducto1.png")));
		btnListar.setBounds(10, 459, 200, 40);
		contentPane.add(btnListar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(10, 510, 200, 40);
		contentPane.add(btnLimpiar);
		
		scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(220, 11, 654, 539);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nombre");
		modelo.addColumn("Precio");
		modelo.addColumn("Stk Actual");
		modelo.addColumn("Stk Mínimo");
		modelo.addColumn("Stk Máximo");
		table.setModel(modelo);
		
		listar();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
		if (e.getSource() == btnListar) {
			do_btnListar_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnConsultar) {
			do_btnConsultar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}
	
	//Creación de Objeto
	Array_Producto aProducto = new Array_Producto();
	
	protected void do_btnIngresar_actionPerformed(ActionEvent e) {
		try {
	        // Obtener datos del formulario
	        String nombre = txtNombre.getText().trim();
	        String precio = txtPrecio.getText().trim();
	        String stkActual = txtActual.getText().trim();
	        String stkMin = txtMinimo.getText().trim();
	        String stkMax = txtMaximo.getText().trim();
	        // Validar que no estén vacíos
	        if (nombre.isEmpty() || precio.isEmpty() || stkActual.isEmpty() || stkMin.isEmpty() || stkMax.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.");
	            return;
	        }
	        //Conversion de Datos
	        double pre = Double.parseDouble(precio);
	        int act = Integer.parseInt(stkActual);
	        int min = Integer.parseInt(stkMin);
	        int max = Integer.parseInt(stkMax);
	        // Crear nuevo cliente y agregarlo al array
	        Producto nuevoProducto = new Producto(nombre, pre, act, min, max);
	        aProducto.adicionar(nuevoProducto);
	        
	        listar();
	        limpiar();
	        JOptionPane.showMessageDialog(null, "Producto añadido con éxito.");
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Error al añadir el producto.");
	    }
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		try {
	        // Obtener el código
	        int codigo = Integer.parseInt(txtCodigo.getText().trim());
	        Producto producto = aProducto.buscar(codigo);
	        // Validar si el cliente existe
	        if (producto != null) {
	            // Obtener los nuevos valores del formulario
	            producto.setNom(txtNombre.getText().trim());
	            producto.setPre(Double.parseDouble(txtPrecio.getText().trim()));
	            producto.setStkActual(Integer.parseInt(txtActual.getText().trim()));
	            producto.setStkMin(Integer.parseInt(txtMinimo.getText().trim()));
	            producto.setStkMax(Integer.parseInt(txtMaximo.getText().trim()));

	            listar();
	            limpiar();
	            JOptionPane.showMessageDialog(null, "Cliente modificado con éxito.");
	        } else {
	            JOptionPane.showMessageDialog(null, "Cliente con código " + codigo + " no encontrado.");
	        }
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Por favor ingrese un código válido.");
	    }
	}
	protected void do_btnConsultar_actionPerformed(ActionEvent e) {
		try {
	        int codigo = Integer.parseInt(txtCodigo.getText().trim());
	        Producto producto = aProducto.buscar(codigo);
	        limpiar();

	        if (producto != null) {
	            consultar(producto);
	            txtCodigo.requestFocus();
	        } else {
	            JOptionPane.showMessageDialog(null, "Cliente con código " + codigo + " no encontrado.");
	            txtCodigo.requestFocus();
	            listar();
	        }
	    } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(null, "Por favor ingrese un número de código válido.");
	        txtCodigo.requestFocus();
	        listar();
	    }
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		 try {
		        int codigo = Integer.parseInt(txtCodigo.getText().trim());
		        Producto producto = aProducto.buscar(codigo);
		        limpiar();
		        if (producto != null) {
		            int confirm = JOptionPane.showConfirmDialog(null, 
		                    "¿Está seguro de que desea eliminar el producto con código " + codigo + "?", 
		                    "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
		            
		            if (confirm == JOptionPane.YES_OPTION) {
		                aProducto.eliminar(producto);
		                JOptionPane.showMessageDialog(null, "Producto eliminado con éxito.");
		                listar();
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Producto con código " + codigo + " no encontrado.");
		        }
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(null, "Por favor ingrese un número de código válido.");
		    }
	}
	protected void do_btnListar_actionPerformed(ActionEvent e) {
		txtCodigo.requestFocus();
		listar();
	}
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		limpiar();
		txtCodigo.requestFocus();
	}
	
	//Métodos
	public void consultar(Producto producto) {
	    modelo.setRowCount(0);
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
	public void limpiar() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtPrecio.setText("");
		txtActual.setText("");
		txtMinimo.setText("");
		txtMaximo.setText("");
	}
}
