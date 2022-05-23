package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Funcionario;
import model.SessaoUsuario;
import view.Funcionarios;
import view.Main;

public class MainViewController implements Initializable {
	@FXML
	private Text txtBoasVindas;
	@FXML
	private Pane pnConteudo;
	@FXML
	private Button btnInicio;
	@FXML
	private Button btnConfiguracoes;
	@FXML
	private Button btnRelatorio;
	@FXML
	private Text linkInserirFunc;
	@FXML
	private Text linkAlterarFunc;
	@FXML
	private Text linkExcluirFunc;
	@FXML
	private Text linkConsultarFunc;
	@FXML
	private Text linkInserirClientes;
	@FXML
	private Text linkAlterarClientes;
	@FXML
	private Text linkExcluirClientes;
	@FXML
	private Text linkConsultarClientes;
	@FXML
	private Text linkInserirAulas;
	@FXML
	private Text linkAlterarAulas;
	@FXML
	private Text linkExcluirAulas;
	@FXML
	private Text linkConsultarAulas;
	
	
	public void onLoad() {
		SessaoUsuario us = new SessaoUsuario();
		txtBoasVindas.setText("Bem-vindo " + us.getLogin());
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		onLoad();
		//Funcionario
		linkInserirFunc.setOnMouseClicked((MouseEvent e)->{
			Funcionario funcionario = new Funcionario();
			funcionario.setOperacao("Inserir");
			Funcionarios funcionarios = new Funcionarios();
			Main.getStage().close();
			try {
				funcionarios.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		linkAlterarFunc.setOnMouseClicked((MouseEvent e)->{
			Funcionario funcionario = new Funcionario();
			funcionario.setOperacao("Alterar");
			Funcionarios funcionarios = new Funcionarios();
			Main.getStage().close();
			try {
				funcionarios.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		linkExcluirFunc.setOnMouseClicked((MouseEvent e)->{
			Funcionario funcionario = new Funcionario();
			funcionario.setOperacao("Excluir");
			Funcionarios funcionarios = new Funcionarios();
			Main.getStage().close();
			try {
				funcionarios.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		linkConsultarFunc.setOnMouseClicked((MouseEvent e)->{
			Funcionario funcionario = new Funcionario();
			funcionario.setOperacao("Consultar");
			Funcionarios funcionarios = new Funcionarios();
			Main.getStage().close();
			try {
				funcionarios.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		//Alunos
		linkInserirAulas.setOnMouseClicked((MouseEvent e)->{
			Funcionario funcionario = new Funcionario();
			funcionario.setOperacao("Inserir");
			Funcionarios funcionarios = new Funcionarios();
			Main.getStage().close();
			try {
				funcionarios.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		linkAlterarFunc.setOnMouseClicked((MouseEvent e)->{
			Funcionario funcionario = new Funcionario();
			funcionario.setOperacao("Alterar");
			Funcionarios funcionarios = new Funcionarios();
			Main.getStage().close();
			try {
				funcionarios.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		linkExcluirFunc.setOnMouseClicked((MouseEvent e)->{
			Funcionario funcionario = new Funcionario();
			funcionario.setOperacao("Excluir");
			Funcionarios funcionarios = new Funcionarios();
			Main.getStage().close();
			try {
				funcionarios.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		linkConsultarFunc.setOnMouseClicked((MouseEvent e)->{
			Funcionario funcionario = new Funcionario();
			funcionario.setOperacao("Consultar");
			Funcionarios funcionarios = new Funcionarios();
			Main.getStage().close();
			try {
				funcionarios.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}

}
