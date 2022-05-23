package controller;

import java.sql.SQLException;

import javafx.scene.control.TextField;
import model.Funcionario;
import persistance.LoginDao;
import persistance.GenericDao;

public class LoginDaoController implements ILoginDaoController {
	
	private TextField txtSenha;
	private TextField txtLogin;
	
	public LoginDaoController(TextField txtSenha, TextField txtLogin) {
		this.txtSenha = txtSenha;
		this.txtLogin = txtLogin;
	}
	@Override
	
	public boolean logarUsuario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		GenericDao gDao = new GenericDao();
		LoginDao fDao = new LoginDao(gDao);
		boolean login = fDao.logaUsuario(funcionario);
		return login;
	}

	@Override
	public Funcionario recuperarSenha(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
