
public class AutenticacaoUtil { // Para n�o repetir c�digo em toda Classe, fa�o uma Classe s� para autenticar e crio um atributo nelas;
		
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
