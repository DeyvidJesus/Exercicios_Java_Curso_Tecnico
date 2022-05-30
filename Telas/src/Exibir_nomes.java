import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exibir_nomes {

	private JFrame frame;
	private JTextField Nome;
	private JTextField Sobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exibir_nomes window = new Exibir_nomes();
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
	public Exibir_nomes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 635, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nomes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(263, 11, 78, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(31, 56, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		Nome = new JTextField();
		Nome.setBounds(31, 81, 86, 20);
		frame.getContentPane().add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sobrenome:");
		lblNewLabel_1_1.setBounds(31, 124, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		Sobrenome = new JTextField();
		Sobrenome.setColumns(10);
		Sobrenome.setBounds(31, 149, 86, 20);
		frame.getContentPane().add(Sobrenome);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(355, 81, 78, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(355, 112, 254, 20);
		frame.getContentPane().add(lblResultado);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeCompleto = Nome.getText() + " " + Sobrenome.getText();
				lblResultado.setText(nomeCompleto);
			}
		});
		btnEnviar.setBounds(31, 195, 86, 23);
		frame.getContentPane().add(btnEnviar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nome.setText(null);
				Sobrenome.setText(null);
				lblResultado.setText(null);
			}	
		});
		btnLimpar.setBounds(31, 229, 86, 23);
		frame.getContentPane().add(btnLimpar);
	}
}
