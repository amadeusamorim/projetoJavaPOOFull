package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		

		ArrayList<Conta> lista = new ArrayList<Conta>(); 
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(11, 55);
		lista.add(cc); 	
		lista.add(cp);
		
		ContaCorrente cc2 = new ContaCorrente(22, 33);
		boolean existe = lista.contains(cc2); // retornará um true or false
		
		System.out.println("Já existe? " + existe);
		
		for (Conta conta : lista) { 
			System.out.println(conta);
		}
	}

}
