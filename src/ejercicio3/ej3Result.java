package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class ej3Result extends JFrame {

	private JPanel contentPane;
	private JTextField txtSo;
	private JTextField txtEsp;
	private JTextField textField_2;

	ej3Frame seleccion = new ej3Frame();
	
	
	
	/**
	 * Create the frame.
	 */
	public ej3Result() {
		setTitle("Datos introducidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Gracias por realizar la encuesta!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(105, 202, 331, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Has seleccionado como sistema operativo");
		lblNewLabel_1.setBounds(53, 29, 296, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("La(s) especialidad(es) elegida(s) es/son: ");
		lblNewLabel_2.setBounds(53, 83, 308, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Horas dedicadas en el ordenador: ");
		lblNewLabel_3.setBounds(53, 160, 256, 14);
		contentPane.add(lblNewLabel_3);
		
		txtSo = new JTextField();
		txtSo.setText("so");
		txtSo.setBounds(63, 54, 286, 20);
		contentPane.add(txtSo);
		txtSo.setColumns(10);
		
		txtEsp = new JTextField();
		txtEsp.setText("esp");
		txtEsp.setBounds(63, 116, 286, 20);
		contentPane.add(txtEsp);
		txtEsp.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("10");
		textField_2.setBounds(240, 157, 109, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		setVisible(true);
	}

}
