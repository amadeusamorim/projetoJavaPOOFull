package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(22, 33); // Eu mudei o toString() na classe ContaCorrente, mas o que prevalece são os métodos repassados no objeto
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente(); // Object é a referência mágica que consegue referenciar qualquer coisa, por ser a mais genérica.
		
		System.out.println(cc); // Por debaixo dos panos ele chama o método toString();
		System.out.println(cp);
		
	}

}
