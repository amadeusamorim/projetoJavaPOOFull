package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.*;


public class TestaGuardadorDeObjetos {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(23, 35);
		Cliente c = new Cliente();
		GuardadorDeObjetos gdo = new GuardadorDeObjetos();
		
		gdo.adicionaObjeto(cc);
		gdo.adicionaObjeto(cp);
		gdo.adicionaObjeto(c);
		
		for (int i = 0; i < gdo.getRef(); i++) {
			System.out.println(gdo.getObjeto(i));
		}
		
	}

}
