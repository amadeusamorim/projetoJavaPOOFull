package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no ByteBank
 * @author Amadeus Amorim
 * version 0.1
 */

public class Cliente implements Serializable { // Interface que permite serializa��o
	
	// � importante for�ar um n�mero de vers�o para o c�digo ficar blindado a mudan�as dentro dele evitando erros no main, desde que n�o mexa nos atributos;
	private static final long serialVersionUID = 9205117266306915548L; // Tenho que igualar meu SerialVersionUID com o mesmo c�digo que aparece na exce��o
	
	// Cada mudan�a estrutural do objeto (exemplo: atributos), eu devo mudar a vers�o;
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
}
