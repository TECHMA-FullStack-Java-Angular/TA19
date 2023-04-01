package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Ejercicio1Info extends JFrame {

	private JPanel contentPane;

	
	public Ejercicio1Info(String newValue) {
		
		//Creamos el panel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Establecemos el texto con parte dinamica 
		JLabel lblNewLabel = new JLabel("¡Hola "+ newValue+"!");
		lblNewLabel.setBounds(148, 51, 128, 42);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		//Activamos la visibilidad
		setVisible(true);
	}

}
