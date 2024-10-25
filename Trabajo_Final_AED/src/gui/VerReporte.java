package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerReporte extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnVerReportes;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerReporte frame = new VerReporte();
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
	public VerReporte() {
		setTitle("Ver Reportes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VerReporte.class.getResource("/Imagenes/FondoCarrito1-3840x2160.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnVerReportes = new JButton("Ver Reportes");
		btnVerReportes.addActionListener(this);
		btnVerReportes.setIcon(new ImageIcon(VerReporte.class.getResource("/Imagenes/IconoReporte1.png")));
		btnVerReportes.setBounds(279, 11, 200, 40);
		contentPane.add(btnVerReportes);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 63, 762, 386);
		contentPane.add(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVerReportes) {
			do_btnVerReportes_actionPerformed(e);
		}
	}
	protected void do_btnVerReportes_actionPerformed(ActionEvent e) {
		txtS.setText("");
	}
}
