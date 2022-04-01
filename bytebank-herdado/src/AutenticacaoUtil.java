
public class AutenticacaoUtil { // Para não repetir código em toda Classe, faço uma Classe só para autenticar e crio um atributo nelas;
		
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
