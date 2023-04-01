package ejercicio2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej2Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	JComboBox<String> comboBox_1 = new JComboBox<String>();

	/**
	 * Create the frame.
	 */
	public Ej2Frame() {
		setTitle("Películas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Escribe el título de una película");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(45, 73, 196, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Películas");
		lblNewLabel_1.setBounds(262, 83, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(45, 116, 174, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(aL);
			
		btnNewButton.setBounds(45, 154, 89, 23);
		contentPane.add(btnNewButton);
		comboBox_1.setBounds(262, 115, 129, 22);
		contentPane.add(comboBox_1);
		
		setVisible(true);
	}
	ActionListener aL = new ActionListener()
	{
public void actionPerformed(ActionEvent e) {
	
	
	comboBox_1.addItem(textField.getText());
	textField.setText(null);
	textField.requestFocus();
	
	
	
}
	};
}
