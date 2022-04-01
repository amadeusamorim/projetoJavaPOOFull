package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		
		guardador.adiciona(cc);
		guardador.adiciona(cc2);
				
		int tamanho = guardador.getQuantidadeDeElementos();
		
		
		for (int i = 0; i < guardador.getQuantidadeDeElementos(); i++) {
			System.out.println(guardador.getReferencia(i));
		}
		
	}

}
