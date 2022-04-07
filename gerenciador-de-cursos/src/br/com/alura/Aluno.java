 package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome n�o pode ser null");
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
		return "[Aluno: " + this.nome + ", matr�cula: " + this.numeroMatricula + "]";
	}
	
	@Override
	public int hashCode() { // Mudei e ele achou pois facilitou o espalhamento, ele vai procurar apenas em quem come�a com a mesma letra;
		return this.nome.hashCode();
	}

	@Override
	public boolean equals(Object obj) { // Sembre que eu sobrescrever o m�todo equals, eu preciso sobrescrever o m�todo hashCode;
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
}
