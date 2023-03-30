package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



/*Crea un saludador personalizable. Consiste en un simple JFrame con un campo de texto (JTextField) y
 *  un botón (JButton). Cuando pulsemos el botón, aparecerá un mensaje emergente (JOptionPane) con el texto
 *   "Hola <texto escrito en el campo de texto>!".*/


public class ejercicio1Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	
	public ejercicio1Frame() {
		
		
		//Creamos un JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Añadimos un campo de texto
		textField = new JTextField();
		textField.setBounds(105, 122, 230, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//añadimos un texto con indicaciones
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(115, 67, 201, 30);
		contentPane.add(lblNewLabel);
		
		//Añadimos un botón de saludación conectado con el listener
		JButton btnSaludar = new JButton("¡Saludar!");
		btnSaludar.addActionListener(aL);
		
		btnSaludar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaludar.setBounds(181, 153, 89, 23);
		contentPane.add(btnSaludar);
		
		//Activamos la visibilidad
		setVisible(true);
	}
	//creamos el listener
	ActionListener aL = new ActionListener()
			{
		public void actionPerformed(ActionEvent e) {
			//llamamos al otro panel y recuperamos el texto 
			ejercicio1Info info = new ejercicio1Info(textField.getText());
			
			//quitamos la visibilidad
			setVisible(false);
			
		}
			};
}
