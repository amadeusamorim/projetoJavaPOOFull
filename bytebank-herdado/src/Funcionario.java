
public abstract class Funcionario { // Funcionário é abstrato; Ele só pode ter filhos; É uma classe progenitora.

	private String nome;
	private String cpf;
	private double salario; 
	
	public abstract double getBonificacao(); // Se não existe uma implementação esse método não é concreto, ele é abstrato.
	// Apenas servirá para que as Classes filhas se utilizem.
	// Método sem corpo;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
