package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
		
	private Conta[] contas;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.contas = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.contas[this.posicaoLivre] = ref; // A primeira vez é zero, mas vai incrementar de um em um;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.contas[pos];
	}


}
