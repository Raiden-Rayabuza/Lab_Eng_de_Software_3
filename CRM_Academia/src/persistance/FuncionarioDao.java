package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Funcionario;

public class FuncionarioDao implements IFuncionarioDao {

	private GenericDao gDao;

	public FuncionarioDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	}

	@Override
	public void alteraFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	}

	@Override
	public void excluiFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	}

	@Override
	public Funcionario consultaFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		Funcionario func = new Funcionario();
		String sql_query = ("SELECT usuario, tipo_funcionario FROM funcionario WHERE usuario = ?");
		PreparedStatement ps = c.prepareStatement(sql_query);
		ps.setString(1, funcionario.getUsuario());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			func.setTipo_funcionario(rs.getInt("tipo_funcionario"));
			func.setUsuario(rs.getString("usuario"));
		}
		rs.close();
		ps.close();
		c.close();
		return func;
	}

	@Override
	public List<Funcionario> listaFuncionario() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}