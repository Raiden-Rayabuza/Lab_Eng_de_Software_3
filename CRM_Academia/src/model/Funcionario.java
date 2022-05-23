package model;

public class Funcionario extends Pessoa {
	private String usuario;
	private String senha;
	private int tipo_funcionario;
	private long salario;
	private static String operacao;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTipo_funcionario() {
		return tipo_funcionario;
	}
	public void setTipo_funcionario(int tipo_funcionario) {
		this.tipo_funcionario = tipo_funcionario;
	}
	public long getSalario() {
		return salario;
	}
	public void setSalario(long salario) {
		this.salario = salario;
	}
	
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		Funcionario.operacao = operacao;
	}
	@Override
	public String toString() {
		return "Funcionario [usuario=" + usuario + ", senha=" + senha + ", tipo_funcionario=" + tipo_funcionario
				+ ", salario=" + salario + "]";
	}
	
}
