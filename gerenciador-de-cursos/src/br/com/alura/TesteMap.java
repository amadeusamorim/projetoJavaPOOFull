package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        for (String a : nomesParaIdade.keySet()) {
        	System.out.println(a);
		}
        
        for (Integer b : nomesParaIdade.values()) {
        	System.out.println(b);
        }
        
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}