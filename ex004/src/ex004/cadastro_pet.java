package ex004;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cadastro_pet {

	private JFrame frame;
	private JTextField nomeDono;
	private JTextField nomePet;
	private JTextField tipoPet;
	private JTextField pesoPet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastro_pet window = new cadastro_pet();
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
	public cadastro_pet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(46, 139, 87));
		frame.setBounds(100, 100, 350, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE PETS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(66, 11, 200, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 314, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do dono:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(66, 72, 146, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		nomeDono = new JTextField();
		nomeDono.setToolTipText("");
		nomeDono.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setLabelFor(nomeDono);
		nomeDono.setBounds(66, 97, 146, 20);
		frame.getContentPane().add(nomeDono);
		nomeDono.setColumns(10);
		
		nomePet = new JTextField();
		nomePet.setForeground(new Color(128, 128, 128));
		nomePet.setColumns(10);
		nomePet.setBounds(66, 153, 146, 20);
		frame.getContentPane().add(nomePet);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome do pet:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(66, 128, 146, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		tipoPet = new JTextField();
		tipoPet.setForeground(new Color(128, 128, 128));
		tipoPet.setColumns(10);
		tipoPet.setBounds(66, 209, 146, 20);
		frame.getContentPane().add(tipoPet);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tipo do pet:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(66, 184, 146, 25);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		pesoPet = new JTextField();
		pesoPet.setForeground(new Color(128, 128, 128));
		pesoPet.setColumns(10);
		pesoPet.setBounds(66, 265, 146, 20);
		frame.getContentPane().add(pesoPet);
		
		JLabel lblNewLabel_1_3 = new JLabel("Peso do pet (Kg):");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(66, 240, 146, 25);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("Registro:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(24, 337, 101, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel nomeDonoResultado = new JLabel("Nome do dono: ");
		nomeDonoResultado.setForeground(new Color(255, 255, 255));
		nomeDonoResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nomeDonoResultado.setBounds(34, 367, 232, 25);
		frame.getContentPane().add(nomeDonoResultado);
		
		JLabel nomePetResultado = new JLabel("Nome do pet: ");
		nomePetResultado.setForeground(Color.WHITE);
		nomePetResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nomePetResultado.setBounds(34, 392, 232, 25);
		frame.getContentPane().add(nomePetResultado);
		
		JLabel tipoPetResultado = new JLabel("Tipo do pet: ");
		tipoPetResultado.setForeground(Color.WHITE);
		tipoPetResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tipoPetResultado.setBounds(34, 417, 232, 25);
		frame.getContentPane().add(tipoPetResultado);
		
		JLabel pesoPetResultado = new JLabel("Peso do pet (Kg): ");
		pesoPetResultado.setForeground(Color.WHITE);
		pesoPetResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pesoPetResultado.setBounds(34, 442, 232, 25);
		frame.getContentPane().add(pesoPetResultado);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeDonoResultado.setText("Nome do dono: " + nomeDono.getText());
				nomePetResultado.setText("Nome do pet: " + nomePet.getText());
				tipoPetResultado.setText("Tipo do pet: " + tipoPet.getText());
				pesoPetResultado.setText("Peso do pet: " + pesoPet.getText() + "kg");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(66, 303, 146, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
