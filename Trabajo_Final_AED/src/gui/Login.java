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
import clases.Registrar;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContra;

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
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConectar.setBounds(35, 142, 94, 23);
		contentPane.add(btnConectar);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrar.setBounds(139, 142, 94, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBorrar.setBounds(243, 142, 94, 23);
		contentPane.add(btnBorrar);
		
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText() == "" && txtContra.getText() == null) {
					try {
						msgConectar1();
						txtUsuario.requestFocus();
					}
					catch (Exception a) {
						msgError();
						txtUsuario.requestFocus();
					}
				}
			}
		});
		
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	}
	//Mensajes de texto JOptionPane
	public void msgConectar1() {
		JOptionPane.showMessageDialog(null, "Los datos ingresados son correctos");
	}
	public String msgConectar() {
		return "Los datos ingresados son correctos.";
	}
	public String msgError() {
		return "Los datos ingresados son incorrectos, vuelva a digitarlos.";
	}
	public String msgVacio() {
		return "No has ingresado algunos datos, vuelva a digitarlos";
	}
	public String msgRegistrar() {
		return "El registro se llevó acabo de forma exitosa.";
	}
	public String msgReiniciar() {
		return "Se los campos de texto exitosamente.";
	}
	//Cualquier resultado que no deje conectarse
	public void accionesError() {
		
	}
}
