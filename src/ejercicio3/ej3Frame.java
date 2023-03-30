package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej3Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ej3Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton radio1 = new JRadioButton("Windows");
		radio1.setBounds(34, 71, 111, 23);
		contentPane.add(radio1);

		JRadioButton radio2 = new JRadioButton("Linux");
		radio2.setBounds(151, 71, 111, 23);
		contentPane.add(radio2);

		JRadioButton radio3 = new JRadioButton("Mac");
		radio3.setBounds(257, 71, 111, 23);
		contentPane.add(radio3);

		JLabel lblNewLabel = new JLabel("Elije un sistema operativo:");
		lblNewLabel.setBounds(34, 47, 334, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad:");
		lblNewLabel_1.setBounds(34, 106, 280, 14);
		contentPane.add(lblNewLabel_1);

		JCheckBox box1 = new JCheckBox("Programación");
		box1.setBounds(34, 135, 99, 23);
		contentPane.add(box1);

		JCheckBox box2 = new JCheckBox("Diseño Gráfico");
		box2.setBounds(151, 135, 99, 23);
		contentPane.add(box2);

		JCheckBox box3 = new JCheckBox("Administración");
		box3.setBounds(257, 135, 99, 23);
		contentPane.add(box3);

		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setBounds(102, 198, 200, 19);
		contentPane.add(slider);

		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador");
		lblNewLabel_2.setBounds(34, 173, 268, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Por favor, rellene la encuesta");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(119, 11, 214, 23);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(aL);
			
		btnNewButton.setBounds(175, 228, 89, 23);
		contentPane.add(btnNewButton);

		setVisible(true);
	}

	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
        ej3Result result = new ej3Result();
        setVisible(false);	

		}
	};
}
