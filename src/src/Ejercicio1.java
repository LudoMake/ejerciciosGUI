package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Label;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		lblResultado = DefaultComponentFactory.getInstance().createLabel("Has pulsado:");
		contentPane.add(lblResultado);

		JButton btnBoton1 = new JButton("Boton 1");
		btnBoton1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				pulsadoBoton1();
			}
		});
		contentPane.add(btnBoton1);

		JButton btnBoton2 = new JButton("Boton 2");
		btnBoton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				pulsadoBoton2();
			}
		});
		contentPane.add(btnBoton2);

	}

	protected void pulsadoBoton1() {
		lblResultado.setText("Boton pulsado: boton 1");
	}

	protected void pulsadoBoton2() {
		lblResultado.setText("Boton pulsado: boton 2");
	}
}
