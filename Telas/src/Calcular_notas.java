import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calcular_notas {

	private JFrame frame;
	private JTextField Nota1;
	private JTextField Nota2;
	private JTextField Nota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcular_notas window = new Calcular_notas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calcular_notas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora m\u00E9dia");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(226, 11, 200, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(51, 97, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		Nota1 = new JTextField();
		Nota1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Nota1.setBounds(51, 122, 111, 30);
		frame.getContentPane().add(Nota1);
		Nota1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nota 2:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(51, 172, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		Nota2 = new JTextField();
		Nota2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Nota2.setColumns(10);
		Nota2.setBounds(51, 197, 111, 30);
		frame.getContentPane().add(Nota2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nota 3:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(51, 248, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		Nota3 = new JTextField();
		Nota3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Nota3.setColumns(10);
		Nota3.setBounds(51, 273, 111, 30);
		frame.getContentPane().add(Nota3);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(379, 99, 103, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado.setBounds(379, 130, 103, 22);
		frame.getContentPane().add(lblResultado);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nota1.setText(null);
				Nota2.setText(null);
				Nota3.setText(null);
				lblResultado.setText(null);
			}
		});
		btnLimpar.setBounds(51, 356, 111, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int int_nota1 = Integer.parseInt(Nota1.getText());
				int int_nota2 = Integer.parseInt(Nota2.getText());
				int int_nota3 = Integer.parseInt(Nota3.getText());
				int media = (int_nota1 + int_nota2 + int_nota3) / 3;
				
				String txt_media = Integer.toString(media);
				lblResultado.setText(txt_media);
			}
		});
		btnCalcular.setBounds(51, 322, 111, 23);
		frame.getContentPane().add(btnCalcular);
	}

}
