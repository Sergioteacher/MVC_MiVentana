package mvc_MiVentana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class mvc_MiVista extends JFrame {

	private JPanel contentPane;
	JButton MiBoton;
	JButton OtroBoton;

	/**
	 * Create the frame.
	 */
	public mvc_MiVista() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		MiBoton = new JButton("Evento ...");
		MiBoton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(MiBoton, BorderLayout.CENTER);
		
		OtroBoton = new JButton("Otro evento ...");
		OtroBoton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(OtroBoton, BorderLayout.EAST);
	}

}
