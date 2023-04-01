package ejercicio4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ejercicio4About extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public Ejercicio4About() {
		setTitle("About MiniCalculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("MiniCalculadora v1.0");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(142, 60, 202, 35);
		contentPane.add(lblTitulo);
		
		JLabel lblExplicacion = new JLabel("<html>La MiniCalculadora fue creada por Paula Sousa, haciendo uso de "
				+ "la biblioteca  java swing  siguiendo los requisitos: <br> <br>- Realizar básicas: suma, resta, "
				+ "multiplicacion y división; <br> - Usar 2 JTextField para los operandos y 1 para el resultado; "
				+ "<br> - Usar 6 JButtons ( 4 para las operaciones, 1 para el about y otro para salir; <br> - Usar "
				+ "4 JLabels para mostrar ciertos textos en la ventas. (He usado 1 más) </html>");
		lblExplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblExplicacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExplicacion.setBounds(26, 142, 455, 245);
		contentPane.add(lblExplicacion);
		setVisible(true);
	}

}
