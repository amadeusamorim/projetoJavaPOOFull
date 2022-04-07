 package br.com.alura;

import java.util.Objects;

public class ExAluno7 {
	
	private String nome;
	private int numeroMatricula;
	
	public ExAluno7(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula + "]";
	}

	@Override
	public boolean equals(Object obj) {
		ExAluno7 outro = (ExAluno7) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
