package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContra;
	private JButton btnConectar;
	private JButton btnBorrar;
	
	//Atributos
	public String usuario = "VentasPeru";
	public String contra = "VentasPeru";
	
	Inicio i = new Inicio();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBackground(SystemColor.window);
		setTitle("Conéctate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		lblUsuario.setBounds(54, 62, 75, 15);
		contentPane.add(lblUsuario);
		
		JLabel lblContra = new JLabel("Contraseña");
		lblContra.setFont(new Font("Arial", Font.BOLD, 12));
		lblContra.setBounds(54, 103, 75, 15);
		contentPane.add(lblContra);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsuario.setBounds(152, 59, 170, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContra = new JPasswordField();
		txtContra.setFont(new Font("Arial", Font.PLAIN, 12));
		txtContra.setBounds(152, 100, 170, 20);
		contentPane.add(txtContra);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.desktop);
		separator.setBounds(35, 45, 302, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Conéctate al sistema");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(95, 11, 200, 23);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.desktop);
		separator_1.setBounds(35, 129, 302, 2);
		contentPane.add(separator_1);
		
		btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(this);
		btnConectar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConectar.setBounds(35, 142, 94, 23);
		contentPane.add(btnConectar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBorrar.setBounds(243, 142, 94, 23);
		contentPane.add(btnBorrar);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			do_btnBorrar_actionPerformed(e);
		}
		if (e.getSource() == btnConectar) {
			do_btnConectar_actionPerformed(e);
		}
	}
	
	//Botones
	protected void do_btnConectar_actionPerformed(ActionEvent e) {
		//Objeto obtener String de un JPasswordField
		String valorPass = String.valueOf(txtContra.getPassword());
		String user = String.valueOf(txtUsuario.getText());
		
		if(user.length() == 0) {
					msgVacio1();
					limpiarCampos();
					txtUsuario.requestFocus();
			}
		else if(valorPass.length() == 0){
					msgVacio2();
					limpiarCampos();
					txtUsuario.requestFocus();
			}
		else {
				if(user.equals("VentasPeru") && valorPass.equals("12345")) {
						msgConectar();
						i.setExtendedState(MAXIMIZED_BOTH);
						i.setVisible(true);
						this.dispose();
						txtUsuario.requestFocus();
				}
				else{
						msgError();
						limpiarCampos();
						txtUsuario.requestFocus();
				}
			}
	}
	protected void do_btnBorrar_actionPerformed(ActionEvent e) {
		limpiarCampos();
		txtUsuario.requestFocus();
	}
	//Metodos sin Parámetros
	public void limpiarCampos() {
		txtUsuario.setText("");
		txtContra.setText("");
	}
	//Métodos con Parámetros
	//Mensajes de texto JOptionPane
	public void msgConectar() {
		JOptionPane.showMessageDialog(null, "Los datos ingresados son correctos");
	}
	public void msgVacio1() {
		JOptionPane.showMessageDialog(null, "No has ingresado datos en el campo 'Usuario'");
	}
	public void msgVacio2() {
		JOptionPane.showMessageDialog(null, "No has ingresado datos en el campo 'Contraseña'");
	}
	public void msgReiniciar() {
		JOptionPane.showMessageDialog(null, "Se han vaciado los campos de texto.");
	}
	public void msgError() {
		JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos, vuelva a digitarlos.");
	}
}
