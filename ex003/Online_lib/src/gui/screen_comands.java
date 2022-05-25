package gui;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class screen_comands {
	double html= 199;
	double java= 150;
	double logica=100;
	@FXML
	private TextField  txtNome;

	@FXML
	private TextField  txtProfissao;
	
	@FXML
	private TextField  txtTelefone;
	
	@FXML
	private TextField  txtCurso;
	
	
	@FXML
	private TextField  txtqtdlivros;
	
	@FXML
	private Label  labelCliente;
	
	@FXML
	private Label  labelTotal;
	@FXML
	private Label  labelSalvar;
	
	@FXML
	private Button btnCadastrar;
	
	@FXML
	private Button btnCalcular;
	
	@FXML
	private Button btnSalvar;

	
	
	@FXML
	public void onbtnCadastrarAction() {
	String Nome = txtNome.getText();
	String profissao = txtProfissao.getText();
	String telefone = txtTelefone.getText();
	labelCliente.setText("Nome :"+Nome+"Profissão"+profissao+"Contato :"+telefone);
}
	@FXML
	public void onbtnCalcularAction() {
		double curso = Double.parseDouble(txtCurso.getText());
		double qtdlivros =Double.parseDouble(txtqtdlivros.getText());
		if (curso ==1) {
			labelTotal.setText("R$"+qtdlivros*html);
		}else {
			if (curso==2) {
				labelTotal.setText ("R$"+qtdlivros*java);
			}else {
			}	
		}
	}
	
	@FXML
	public void onbtnSalvarAction() {
		Path Salvar = Paths.get("C:\\Users\\isaia\\OneDrive\\Área de Trabalho\\clientes\\cliente.txt");

		String cliente =labelCliente.getText();
		byte [] clienteByte = cliente.getBytes();
		try {
			Files.writer(Salvar.clienteByte);
			labelSalvar.setText("Dados Salvos com sucesso");
		}	catch (Exception erro){
		}
	}
}