package model;

public final class SessaoUsuario {
	private static String Login;
	private static int	Nivel;
	
	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public int getNivel() {
		return Nivel;
	}

	public void setNivel(int nivel) {
		Nivel = nivel;
	}

	public void encerrarSessao() {
		Login = "";
		Nivel = 0;
	}

	@Override
	public String toString() {
		return "SessaoUsuario [Login=" + Login + ", Nivel=" + Nivel + "]";
	}
	
}
