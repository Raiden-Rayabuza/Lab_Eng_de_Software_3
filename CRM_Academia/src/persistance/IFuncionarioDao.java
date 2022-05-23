package persistance;

import java.sql.SQLException;
import java.util.List;

import model.Funcionario;

public interface IFuncionarioDao {
	public void insereFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public void alteraFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public void excluiFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public Funcionario consultaFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException;
	public List<Funcionario> listaFuncionario() throws SQLException, ClassNotFoundException;
}
