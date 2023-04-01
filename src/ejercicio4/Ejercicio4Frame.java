/*Haciendo uso de ésta biblioteca java swing vamos a crear una "MiniCalculadora" con las operaciones 
 * básicas como lo son: suma, resta, multiplicacion y división.
 * 
 * Para esta "MiniCalaculadora" haremos uso de 3 JTextField (campos de texto): Dos para los operandos 
 * y uno para mostrar el resultado; 5 JButtons (botones): 4 para las soperaciones, uno para mostrar el
 *  about y 1 para salir de la aplicación; a su vez, 4 JLabels para mostrar ciertos textos en la ventana.
 *  He añadido un botón más y un JTextField a más.*/

package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejercicio3.Ej3Frame;
import ejercicio3.Ej3Result;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio4Frame extends JFrame {

	private JPanel contentPane;
	private JTextField operando1;
	private JTextField operando2;
	private JTextField resultado;
	JButton btnSuma = new JButton("Sumar");
	JButton btnResta = new JButton("Restar");
	JButton btnMultiplica = new JButton("Multiplicar");
	JButton btnDividir = new JButton("Dividir");
	JButton btnSalir = new JButton("Salir");
	JButton btnAbout = new JButton("About");

	/**
	 * Create the frame.
	 */
	public Ejercicio4Frame() {
		setTitle("MiniCalculadora v1.0");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		operando1 = new JTextField();
		operando1.setBounds(63, 137, 125, 43);

		contentPane.add(operando1);
		operando1.setColumns(10);

		operando2 = new JTextField();
		operando2.setColumns(10);
		operando2.setBounds(241, 137, 125, 43);
		contentPane.add(operando2);

		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnSuma.setBounds(63, 251, 125, 43);
		contentPane.add(btnSuma);

		// agregar listeners a los botones
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular("+");
			}
		});

		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnResta.setBounds(241, 254, 125, 37);
		contentPane.add(btnResta);

		// agregar listeners a los botones
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular("-");
			}
		});

		btnMultiplica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiplica.setBounds(63, 319, 125, 43);
		contentPane.add(btnMultiplica);

		// agregar listeners a los botones
		btnMultiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular("*");
			}
		});

		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDividir.setBounds(241, 319, 125, 43);
		contentPane.add(btnDividir);

		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular("/");
			}
		});

		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(155, 503, 125, 43);
		contentPane.add(btnSalir);

		// agregar listeners a los botones
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAbout.setBounds(10, 557, 88, 26);
		contentPane.add(btnAbout);

		// agregar listeners a los botones
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio4About about = new Ejercicio4About();
			}
		});

		JLabel lblNewLabel = new JLabel("Operando 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(63, 97, 125, 43);
		contentPane.add(lblNewLabel);

		JLabel lblOperando = new JLabel("Operando 2");
		lblOperando.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperando.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOperando.setBounds(241, 97, 125, 43);
		contentPane.add(lblOperando);

		JLabel lblNewLabel_1 = new JLabel("Seleccione la operación a realizar");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(63, 204, 303, 36);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Introduzca los operandos de la operación");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(63, 40, 303, 36);
		contentPane.add(lblNewLabel_1_1);

		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resultado.setHorizontalAlignment(SwingConstants.TRAILING);
		resultado.setColumns(10);
		resultado.setBounds(63, 433, 303, 43);
		contentPane.add(resultado);

		JLabel lblNewLabel_1_2 = new JLabel("Resultado de la operación");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(63, 391, 303, 36);
		contentPane.add(lblNewLabel_1_2);
		setVisible(true);

	}

	private void calcular(String operacion) {

		try {
			double operand1 = Double.parseDouble(operando1.getText());
			double operand2 = Double.parseDouble(operando2.getText());
			double result = 0.0;

			switch (operacion) {
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "*":
				result = operand1 * operand2;
				break;
			case "/":

				result = operand1 / operand2;
				break;
			}

			resultado.setText(String.format("%.2f", result));

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Esta operación no puede ser realizada: " + e.getMessage());
		}
//			        

	}

}
