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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ej3Frame extends JFrame {

	private JPanel contentPane;
	JRadioButton radio1 = new JRadioButton("Windows");
	JRadioButton radio2 = new JRadioButton("Linux");
	JRadioButton radio3 = new JRadioButton("Mac");
	ButtonGroup seleccionSo = new ButtonGroup();
	JCheckBox box1 = new JCheckBox("Programación");
	JCheckBox box2 = new JCheckBox("Diseño Gráfico");
	JCheckBox box3 = new JCheckBox("Administración");
	JSlider slider = new JSlider();

	/**
	 * Create the frame.
	 */
	public Ej3Frame() {

		// Creamos el frame Encuesta
		JLabel lblNewLabel_3 = new JLabel("Por favor, rellene la encuesta");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(119, 11, 214, 23);
		contentPane = new JPanel();
		contentPane.add(lblNewLabel_3);

		setTitle("Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 370);

		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Creamos el JLabels de eleccion de Sistema Operativo y especialidad
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo:");
		lblNewLabel.setBounds(34, 47, 334, 14);
		contentPane.add(lblNewLabel);

		// Establecemos los valores de las opciones JRadioButton
		radio1.setBounds(34, 71, 111, 23);
		contentPane.add(radio1);
		seleccionSo.add(radio1);
		radio1.setActionCommand("Windows");

		radio2.setBounds(234, 71, 111, 23);
		contentPane.add(radio2);
		seleccionSo.add(radio2);
		radio2.setActionCommand("Linux");

		radio3.setBounds(389, 71, 111, 23);
		contentPane.add(radio3);
		seleccionSo.add(radio3);
		radio3.setActionCommand("Mac");

		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad:");
		lblNewLabel_1.setBounds(34, 106, 280, 14);
		contentPane.add(lblNewLabel_1);

		// Establecemos valores de los JCheckbox

		box1.setBounds(34, 135, 155, 23);
		contentPane.add(box1);

		box2.setBounds(234, 135, 153, 23);
		contentPane.add(box2);

		box3.setBounds(389, 135, 160, 23);
		contentPane.add(box3);

		// Creamos el Jlabel del slider horas dedicadas en el ordenador
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador");
		lblNewLabel_2.setBounds(34, 173, 268, 14);
		contentPane.add(lblNewLabel_2);

		slider.setPaintLabels(true);
		slider.setValue(0);
		slider.setMajorTickSpacing(10);
		slider.setToolTipText("");

		slider.setMaximum(10);
		slider.setBounds(191, 198, 200, 53);
		contentPane.add(slider);

		// Ponemos un boton de enviar con un action listener
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(aL);

		btnNewButton.setBounds(256, 265, 89, 23);
		contentPane.add(btnNewButton);

		setVisible(true);
	}

	ActionListener aL = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			// Recopilamos datos de la encuesta un string para sistemas operativos y una
			// lista con
			// todas las especialidades seleccionadas
			String sistemaOperativo = seleccionSo.getSelection().getActionCommand();

			List<String> especialidades = new ArrayList<String>();
			if (box1.isSelected()) {
				especialidades.add(box1.getActionCommand());
			}
			if (box2.isSelected()) {
				especialidades.add(box2.getActionCommand());
			}
			if (box3.isSelected()) {
				especialidades.add(box3.getActionCommand());
			}
			int horasDedicadas = slider.getValue();

			// Creamos objeto Encuesta
			Encuesta encuesta = new Encuesta(sistemaOperativo, especialidades, horasDedicadas);

			// Mostramos los datos de la encuesta en la nueva ventana
			Ej3Result result = new Ej3Result(encuesta);
			setVisible(false);

		}
	};
}
