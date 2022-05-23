package controller;

import java.sql.SQLException;

import model.Funcionario;

public interface ILoginDaoController {
	public boolean logarUsuario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public Funcionario recuperarSenha(Funcionario funcionario) throws SQLException, ClassNotFoundException;
}
