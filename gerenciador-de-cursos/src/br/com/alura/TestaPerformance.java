package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

    	Collection<Integer> numeros = new HashSet<>();
    	
        long inicio1 = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        long fim1 = System.currentTimeMillis();
        long tempo1 = fim1 - inicio1;
        System.out.println("Tempo gasto inserindo: " + tempo1);
    	System.out.println("-=-=-=-=-=-=-=-=-=-=-");

    	long inicio2 = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim2 = System.currentTimeMillis();
        long tempoDeExecucao = fim2 - inicio2;

        System.out.println("Tempo gasto buscando: " + tempoDeExecucao);
        
// Tempo gasto: 1653 (ArrayList)
// Tempo gasto: 48 (HashSet)
        
    }

}