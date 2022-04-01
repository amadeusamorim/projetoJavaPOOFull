package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(22, 33); // Eu mudei o toString() na classe ContaCorrente, mas o que prevalece s�o os m�todos repassados no objeto
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente(); // Object � a refer�ncia m�gica que consegue referenciar qualquer coisa, por ser a mais gen�rica.
		
		System.out.println(cc); // Por debaixo dos panos ele chama o m�todo toString();
		System.out.println(cp);
		
	}

}
