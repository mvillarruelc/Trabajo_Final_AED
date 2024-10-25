package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearReporte extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCrearReporte;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearReporte frame = new CrearReporte();
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
	public CrearReporte() {
		setTitle("Crear Reporte");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CrearReporte.class.getResource("/Imagenes/FondoCarrito1-3840x2160.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCrearReporte = new JButton("Crear Reporte");
		btnCrearReporte.addActionListener(this);
		btnCrearReporte.setIcon(new ImageIcon(CrearReporte.class.getResource("/Imagenes/IconoReporte2.png")));
		btnCrearReporte.setBounds(280, 11, 200, 40);
		contentPane.add(btnCrearReporte);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 64, 762, 386);
		contentPane.add(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrearReporte) {
			do_btnCrearReporte_actionPerformed(e);
		}
	}
	protected void do_btnCrearReporte_actionPerformed(ActionEvent e) {
		txtS.setText("");
	}
}
