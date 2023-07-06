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
import net.miginfocom.swing.MigLayout;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblResultado;
	private JLabel lblResultado1;
	private JButton btnBoton1;
	private JButton btnBoton2;
	private int cont1=0;
	private int cont2=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[41px,grow][82.00px][49.00px][][][grow]", "[33px][]"));
		
				lblResultado = DefaultComponentFactory.getInstance().createLabel("Boton 1:");
				contentPane.add(lblResultado, "cell 1 0 2 1,alignx left,aligny center");
		
		lblResultado1 = new JLabel("Boton 2:");
		contentPane.add(lblResultado1, "cell 3 0 2 1,alignx left,aligny center");
		
		btnBoton1 = new JButton("Boton 1");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulso(1);
			}
		});
		contentPane.add(btnBoton1, "cell 1 1,alignx left");
		
		btnBoton2 = new JButton("Boton 2");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulso(2);
			}
		});
		contentPane.add(btnBoton2, "cell 3 1,alignx left");
	}
	
	protected void pulso(int i) {
		if (i==1) {
			cont1++;
			this.lblResultado.setText("boton 1: "+cont1);
			
		} else {
			cont2++;
			this.lblResultado1.setText("boton 2: "+cont2);
		}
		
	}
}
