package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Funcionario;

public class LoginDao implements ILoginDao {
	private GenericDao gDao;

	public LoginDao(GenericDao gDao) {
		this.gDao = gDao;
	}
	@Override
	public boolean logaUsuario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		boolean login = false;
		String sql_query = ("SELECT * FROM funcionario WHERE usuario = ? AND senha = ?");
		PreparedStatement ps = c.prepareStatement(sql_query);
		ps.setString(1, funcionario.getUsuario());
		ps.setString(2, funcionario.getSenha());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			login = true;
		}
		else {
			login = false;
		}
		rs.close();
		ps.close();
		c.close();
		return login;
	}

	@Override
	public Funcionario recuperaSenha(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
