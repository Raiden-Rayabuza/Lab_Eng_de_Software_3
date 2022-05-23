package controller;

import java.sql.SQLException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Funcionario;
import persistance.FuncionarioDao;
import persistance.GenericDao;

public class FuncionarioDaoController implements IFuncionarioDaoController{
	
	private TextField txtUsuario, txtTelefone, txtSenha, txtRG, txtNomeFunc, txtEmail, txtCPF, txtCelular, txtSalario;
	private RadioButton rbMasculino, rbFeminino, rbOutros;
	private ChoiceBox<String> chbTipoFunc;
	private DatePicker dtpData_Nasc;
	
	public FuncionarioDaoController(TextField txtUsuario, TextField txtTelefone, TextField txtSenha, TextField txtRG,
			TextField txtNomeFunc, TextField txtEmail, TextField txtCPF, TextField txtCelular, TextField txtSalario,
			RadioButton rbMasculino, RadioButton rbFeminino, RadioButton rbOutros, ChoiceBox<String> chbTipoFunc,
			DatePicker dtpData_Nasc) {
		super();
		this.txtUsuario = txtUsuario;
		this.txtTelefone = txtTelefone;
		this.txtSenha = txtSenha;
		this.txtRG = txtRG;
		this.txtNomeFunc = txtNomeFunc;
		this.txtEmail = txtEmail;
		this.txtCPF = txtCPF;
		this.txtCelular = txtCelular;
		this.txtSalario = txtSalario;
		this.rbMasculino = rbMasculino;
		this.rbFeminino = rbFeminino;
		this.rbOutros = rbOutros;
		this.chbTipoFunc = chbTipoFunc;
		this.dtpData_Nasc = dtpData_Nasc;
	}

	@Override
	public void inserirFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionario consultarFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		GenericDao gDao = new GenericDao();
		FuncionarioDao fDao = new FuncionarioDao(gDao);
		Funcionario func = fDao.consultaFuncionario(funcionario);
		return func;
	}

	@Override
	public List<Funcionario> listarFuncionario() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
