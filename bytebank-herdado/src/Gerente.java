// Gerente herda da Classe Funcionario, assina o contrato Autenticavel e � um Autenticavel (Caso queira posso implementar mais Interfaces)

public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil(); // Isso � chamado de composi��o
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo bonifica��o de GERENTE ");
		return super.getSalario();

	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); // retorna se a senha deu ou n�o deu certo
	}
}