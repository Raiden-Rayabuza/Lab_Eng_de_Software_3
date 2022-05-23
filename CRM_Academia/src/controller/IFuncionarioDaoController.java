package controller;

import java.sql.SQLException;
import java.util.List;

import model.Funcionario;

public interface IFuncionarioDaoController {
	public void inserirFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public void alterarFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public void excluirFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public Funcionario consultarFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public List<Funcionario> listarFuncionario() throws SQLException, ClassNotFoundException;
}
