package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Ej3Result extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Ej3Frame seleccion = new Ej3Frame();
	
	
	
	//Creamos frame que recibe objeto encuesta
	public Ej3Result(Encuesta encuesta) {
		
				
		setTitle("Datos introducidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("¡Gracias por realizar la encuesta!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(218, 252, 331, 35);
		contentPane.add(lblNewLabel);
		
		//Insertamos un JLabel dinamico que recibe datos del objeto encuesta
		JLabel lblSistemaOperativo = new JLabel("Has seleccionado como sistema operativo " + encuesta.getSistemaOperativo());
		lblSistemaOperativo.setBounds(67, 45, 482, 14);
		contentPane.add(lblSistemaOperativo);
		
		//Insertamos un JLabel dinamico que recibe datos del objeto encuesta unidos por una ', '
		JLabel lblEspecialidades = new JLabel("La(s) especialidad(es) elegida(s) es/son: " + String.join(", ", encuesta.getEspecialidades()));
		lblEspecialidades.setBounds(67, 101, 508, 35);
		contentPane.add(lblEspecialidades);
		
		//Insertamos un JLabel dinamico que recibe datos del objeto encuesta
		JLabel lblHorasDedicadas = new JLabel("Horas dedicadas en el ordenador: "+ encuesta.getHorasDedicadas());
		lblHorasDedicadas.setBounds(67, 188, 256, 14);
		contentPane.add(lblHorasDedicadas);
		
		setVisible(true);
	}

}
