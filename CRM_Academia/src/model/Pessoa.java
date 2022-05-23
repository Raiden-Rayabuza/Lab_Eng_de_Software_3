package model;

import java.time.LocalDate;

public class Pessoa {
	protected int id;
	protected String nome;
	protected String sexo;
	protected LocalDate data_nasc;
	protected String rg;
	protected String cpf;
	protected String celular;
	protected String telefone;
	protected String email;


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public LocalDate getData_nasc() {
		return data_nasc;
	}



	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", data_nasc=" + data_nasc + ", rg=" + rg
				+ ", cpf=" + cpf + ", celular=" + celular + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
}
