
public abstract class Funcionario { // Funcion�rio � abstrato; Ele s� pode ter filhos; � uma classe progenitora.

	private String nome;
	private String cpf;
	private double salario; 
	
	public abstract double getBonificacao(); // Se n�o existe uma implementa��o esse m�todo n�o � concreto, ele � abstrato.
	// Apenas servir� para que as Classes filhas se utilizem.
	// M�todo sem corpo;
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
