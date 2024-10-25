package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vender extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigoC;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblDni;
	private JLabel lblTelfono;
	private JLabel lblDireccion;
	private JLabel lblCdigoC;
	private JScrollPane scrollPane;
	private JButton btnVender;
	private JButton btnLimpiar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vender.class.getResource("/Imagenes/FondoCarrito1-3840x2160.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigoC = new JTextField();
		txtCodigoC.setColumns(10);
		txtCodigoC.setBounds(130, 195, 140, 20);
		contentPane.add(txtCodigoC);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 237, 140, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 277, 140, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 318, 140, 20);
		contentPane.add(textField_5);
		
		lblDni = new JLabel("Cantidad");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDni.setBounds(10, 320, 110, 14);
		contentPane.add(lblDni);
		
		lblTelfono = new JLabel("Precio");
		lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelfono.setBounds(10, 279, 110, 14);
		contentPane.add(lblTelfono);
		
		lblDireccion = new JLabel("Código Producto");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDireccion.setBounds(10, 239, 110, 14);
		contentPane.add(lblDireccion);
		
		lblCdigoC = new JLabel("Código Cliente");
		lblCdigoC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCdigoC.setBounds(10, 197, 110, 14);
		contentPane.add(lblCdigoC);
		
		scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(280, 11, 794, 539);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setIcon(new ImageIcon(Vender.class.getResource("/Imagenes/IconoVenta2.png")));
		btnVender.setBounds(10, 349, 260, 50);
		contentPane.add(btnVender);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(10, 420, 260, 50);
		contentPane.add(btnLimpiar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
		if (e.getSource() == btnVender) {
			do_btnVender_actionPerformed(e);
		}
	}
	protected void do_btnVender_actionPerformed(ActionEvent e) {
		
	}
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		txtS.setText("");
		
	}
}
