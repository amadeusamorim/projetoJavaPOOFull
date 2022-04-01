package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

        public static void main(String[] args) {

            Conta cc1 = new ContaCorrente(22, 33);
            Cliente clienteCC1 = new Cliente();
            clienteCC1.setNome("Nico");
            cc1.setTitular(clienteCC1);
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(22, 44);
            Cliente clienteCC2 = new Cliente();
            clienteCC2.setNome("Guilherme");
            cc2.setTitular(clienteCC2);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(22, 11);
            Cliente clienteCC3 = new Cliente();
            clienteCC3.setNome("Paulo");
            cc3.setTitular(clienteCC3);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(22, 22);
            Cliente clienteCC4 = new Cliente();
            clienteCC4.setNome("Ana");
            cc4.setTitular(clienteCC4);
            cc4.deposita(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);
                
                for (Conta conta : lista) {
					System.out.println(conta);
				}
                
//                NumeroDaContaComparator comparator = new NumeroDaContaComparator();
                lista.sort(null); // Irá seguir a ordem natural
                
//                TitularDaContaComparator titularComparator = new TitularDaContaComparator();
//                lista.sort(new TitularDaContaComparator()); // Como não vai ficar usando direto essa referência, melhor usar direto;
                
//                Collections.sort(lista); // Irá ordenar pelo saldo, conforme descrito na Classe Conta;
//                Collections.reverse(lista); Faz o caminho reverso de ordenação
                
                System.out.println("-------------------");
                for (Conta conta : lista) {
					System.out.println(conta + ", " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
				}
        }
}

	class TitularDaContaComparator implements Comparator<Conta>{
		@Override
		public int compare(Conta c1, Conta c2) {
			String nomeC1 = c1.getTitular().getNome(); // Saber o nome do titular
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareTo(nomeC2);
		}
	}

	class NumeroDaContaComparator implements Comparator<Conta>{ // Entre o <> você coloca o tipo do Objeto que voce quer comparar 
		@Override
		public int compare(Conta c1, Conta c2) {
//			return c1.getNumero() - c2.getNumero(); // Se o c1 for maior o n é positivo, se for igual é zero e se for menor, retorna negativo;
			return Integer.compare(c1.getNumero(), c2.getNumero()); // Funciona da mesma forma que o acima, mas é mais elegante e padronizado;
		} 
	}