package persistance;

import java.sql.SQLException;

import model.Funcionario;

public interface ILoginDao {
	public boolean logaUsuario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public Funcionario recuperaSenha(Funcionario funcionario) throws SQLException, ClassNotFoundException;
}
