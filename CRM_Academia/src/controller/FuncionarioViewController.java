package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Funcionario;

public class FuncionarioViewController implements Initializable {
	@FXML
	private Button btnOperacoes, btnLimpar;
	@FXML
	private TextField txtUsuario, txtTelefone, txtSenha, txtRG, txtNomeFunc, txtEmail, txtCPF, txtCelular, txtSalario;
	@FXML
	private TableView<Object> tbvFuncionario;
	@FXML
	private RadioButton rbMasculino, rbFeminino, rbOutros;
	@FXML
	private ChoiceBox<String> chbTipoFunc;
	@FXML
	private DatePicker dtpData_Nasc;
	
	private String tiposFunc[] = {"Administrator","Instrutor","Atendente"};

	public void onLoad() {
		Funcionario func = new Funcionario();
		btnOperacoes.setText(func.getOperacao());
	}
	public boolean FuncionarioCamposVazios() {
		boolean valido = false;
		if((txtUsuario.getText().isEmpty() || txtTelefone.getText().isEmpty()
			|| txtRG.getText().isEmpty() || txtNomeFunc.getText().isEmpty() 
			|| txtEmail.getText().isEmpty() || txtCPF.getText().isEmpty()
			|| txtCelular.getText().isEmpty() ||
			(!(rbMasculino.isSelected()) && !(rbFeminino.isSelected()) && !(rbOutros.isSelected()) 
			|| dtpData_Nasc.getValue() == null || chbTipoFunc.getValue().isEmpty()))) {
			JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco", "ERRO", JOptionPane.ERROR_MESSAGE);
			
		}
		else {
			valido = true;
		}
		return valido;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		onLoad();
		chbTipoFunc.getItems().addAll(tiposFunc);
		btnOperacoes.setOnAction((ActionEvent e)->{
			String cmd = e.getSource().toString();
			FuncionarioDaoController funcCtrl =  new FuncionarioDaoController();
			if(cmd.contains("Inserir")) {
				boolean valido = FuncionarioCamposVazios();
				if(valido == true) {
					
				}
			}
		});
		chbTipoFunc.setOnAction((ActionEvent e) ->{
			String opt = e.getSource().toString();
			if(opt.equals("Gerente")) {
				
			}
			else if(opt.equals("Atendente")) {
				
			}
			else if(opt.equals("Usuario Comum")) {
				
			}
		});
	}
}