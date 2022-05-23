package controller;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Funcionario;
import model.SessaoUsuario;
import persistance.FuncionarioDao;
import persistance.GenericDao;
import view.Login;
import view.Main;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginViewController implements Initializable {
	@FXML
	private TextField txtSenha;
	@FXML
	private TextField txtLogin;
	@FXML
	private Text linkRecuperarSenha;
	@FXML
	private Button btnEntrar;
	
	public boolean Login() {
		LoginDaoController lCtrl = new LoginDaoController(txtLogin, txtSenha);
		boolean login = false;
		if(txtSenha.getText().isEmpty() || txtLogin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não Deixa os Campos em branco", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		else {
			try {
				Funcionario f = new Funcionario();
				f.setUsuario(txtLogin.getText());
				f.setSenha(txtSenha.getText());
				login = lCtrl.logarUsuario(f);
				if(login == false) {
					JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorretos ou usuario não existente","ERRO", JOptionPane.ERROR_MESSAGE);
				}
			} catch (ClassNotFoundException | SQLException erro) {
				JOptionPane.showMessageDialog(null, erro.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
			} 
		}
		return login;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnEntrar.setOnAction((ActionEvent e)->{
			boolean login = Login();
			if(login == true) {
				GenericDao gDao = new GenericDao();
				FuncionarioDao fDao = new FuncionarioDao(gDao);
				Funcionario func = new Funcionario();
				func.setUsuario(txtLogin.getText());
				try {
					func = fDao.consultaFuncionario(func);
				} catch (ClassNotFoundException | SQLException e2) {
					e2.printStackTrace();
				}
				SessaoUsuario us = new SessaoUsuario();
				us.setLogin(func.getUsuario());
				us.setNivel(func.getTipo_funcionario());
				Main m = new Main();
				Login.getStage().close();
				try {
					m.start(new Stage());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

}
