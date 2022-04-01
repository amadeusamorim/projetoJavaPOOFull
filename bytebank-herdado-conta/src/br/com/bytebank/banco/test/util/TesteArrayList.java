package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		

		List<Conta> lista = new Vector<Conta>(); // thread safe // Faz a mesma função do ArrayList e LinkedList mas custa mais desempenho;
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(11, 55);
		
		lista.add(cc); 	
		lista.add(cp);
		
		System.out.println("Tamanho após inserções: " + lista.size()); 
		
		Conta referencia = lista.get(0);
		
		System.out.println(referencia);
		
		lista.remove(0);
		
		ContaCorrente cc2 = new ContaCorrente(34, 47); 
		ContaPoupanca cp2 = new ContaPoupanca(28, 16); 
		
		lista.add(cc2); 
		lista.add(cp2);
		
		System.out.println("-------------------------------------");
		System.out.println("Elementos contidos na Array atualizada:");
		System.out.println("-------------------------------------");
		for (Conta conta : lista) { 
			System.out.println(conta);
		}
	}

}
