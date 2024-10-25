package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import javax.swing.table.DefaultTableModel;

import arraylist.Array_Cliente;
import clases.Cliente;

public class MCliente extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtDni;
	private JLabel lblDni;
	private JLabel lblTelfono;
	private JLabel lblDireccion;
	private JLabel lblApellido;
	private JLabel lblNombre;
	private JScrollPane scrollPane;
	private JButton btnIngresar;
	private JButton btnLimpiar;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JTable table;
	
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MCliente frame = new MCliente();
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
	public MCliente() {
		setTitle("Mantenimiento Cliente");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MCliente.class.getResource("/Imagenes/FondoCarrito1-3840x2160.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(80, 50, 130, 20);
		contentPane.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(80, 89, 130, 20);
		contentPane.add(txtApellido);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(80, 129, 130, 20);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(80, 169, 130, 20);
		contentPane.add(txtTelefono);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(80, 209, 130, 20);
		contentPane.add(txtDni);
		
		lblDni = new JLabel("Dni");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDni.setBounds(10, 211, 60, 14);
		contentPane.add(lblDni);
		
		lblTelfono = new JLabel("Teléfono");
		lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelfono.setBounds(10, 171, 60, 14);
		contentPane.add(lblTelfono);
		
		lblDireccion = new JLabel("Dirección");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDireccion.setBounds(10, 131, 60, 14);
		contentPane.add(lblDireccion);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellido.setBounds(10, 91, 60, 14);
		contentPane.add(lblApellido);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(10, 52, 60, 14);
		contentPane.add(lblNombre);
		
		scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(220, 11, 654, 539);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setIcon(new ImageIcon(MCliente.class.getResource("/Imagenes/IconoIngresarCliente1.png")));
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(10, 255, 200, 40);
		contentPane.add(btnIngresar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(10, 510, 200, 40);
		contentPane.add(btnLimpiar);
		
		lblCodigo = new JLabel("Código");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodigo.setBounds(10, 13, 60, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(80, 11, 130, 20);
		contentPane.add(txtCodigo);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(MCliente.class.getResource("/Imagenes/IconoModificarCliente1.png")));
		btnModificar.addActionListener(this);
		btnModificar.setBounds(10, 306, 200, 40);
		contentPane.add(btnModificar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(MCliente.class.getResource("/Imagenes/IconoConsultarCliente1.png")));
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(10, 357, 200, 40);
		contentPane.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(MCliente.class.getResource("/Imagenes/IconoEliminarCliente1.png")));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(10, 408, 200, 40);
		contentPane.add(btnEliminar);
		
		btnListar = new JButton("Listar");
		btnListar.setIcon(new ImageIcon(MCliente.class.getResource("/Imagenes/IconoListarCliente1.png")));
		btnListar.addActionListener(this);
		btnListar.setBounds(10, 459, 200, 40);
		contentPane.add(btnListar);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Dirección");
		modelo.addColumn("Teléfono");
		modelo.addColumn("DNI");
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
	Array_Cliente aCliente = new Array_Cliente();
	
	protected void do_btnIngresar_actionPerformed(ActionEvent e) {
		try {
	        // Obtener datos del formulario
	        String nombre = txtNombre.getText().trim();
	        String apellido = txtApellido.getText().trim();
	        String direccion = txtDireccion.getText().trim();
	        String telefono = txtTelefono.getText().trim();
	        String dni = txtDni.getText().trim();
	        // Validar que no estén vacíos
	        if (nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || dni.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.");
	            return;
	        }
	        // Crear nuevo cliente y agregarlo al array
	        Cliente nuevoCliente = new Cliente(nombre, apellido, direccion, telefono, dni);
	        aCliente.adicionar(nuevoCliente);
	        
	        listar();
	        limpiar();
	        JOptionPane.showMessageDialog(null, "Cliente añadido con éxito.");
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Error al añadir el cliente.");
	    }
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		try {
	        // Obtener el código
	        int codigo = Integer.parseInt(txtCodigo.getText().trim());
	        Cliente cliente = aCliente.buscar(codigo);
	        // Validar si el cliente existe
	        if (cliente != null) {
	            // Obtener los nuevos valores del formulario
	            cliente.setNom(txtNombre.getText().trim());
	            cliente.setApe(txtApellido.getText().trim());
	            cliente.setDirec(txtDireccion.getText().trim());
	            cliente.setTlf(txtTelefono.getText().trim());
	            cliente.setDni(txtDni.getText().trim());

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
	        Cliente cliente = aCliente.buscar(codigo);
	        limpiar();

	        if (cliente != null) {
	            consultar(cliente);
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
		        Cliente cliente = aCliente.buscar(codigo);
		        limpiar();
		        if (cliente != null) {
		            int confirm = JOptionPane.showConfirmDialog(null, 
		                    "¿Está seguro de que desea eliminar al cliente con código " + codigo + "?", 
		                    "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
		            
		            if (confirm == JOptionPane.YES_OPTION) {
		                aCliente.eliminar(cliente);
		                JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito.");
		                listar();
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Cliente con código " + codigo + " no encontrado.");
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
	public void consultar(Cliente cliente) {
	    modelo.setRowCount(0);
	    Object[] fila = {
	        cliente.getCodClt(),
	        cliente.getNom(),
	        cliente.getApe(),
	        cliente.getDirec(),
	        cliente.getTlf(),
	        cliente.getDni()
	    };
	    modelo.addRow(fila);
	}
	public void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < aCliente.tamano(); i++) {
	        Cliente cliente = aCliente.obtener(i);
	        Object[] fila = {
	            cliente.getCodClt(),
	            cliente.getNom(),
	            cliente.getApe(),
	            cliente.getDirec(),
	            cliente.getTlf(),
	            cliente.getDni()
	        };
	        modelo.addRow(fila);
	    }
	}
	public void limpiar() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtDni.setText("");
	}
	
}
