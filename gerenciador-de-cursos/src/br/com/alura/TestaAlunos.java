package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>(); // O set não garante a ordem que os elementos ficarão ali dentro;
		alunos.add("Rodrigo Turini");
		alunos.add("Amadeus Amorim");
		alunos.add("Pedro Scooby");
		alunos.add("Paulo André");
		alunos.add("Felipe Prior");
		alunos.add("Rodrigo Mussi");
		alunos.add("Rodrigo Mussi"); // Os sets também garantem que elementos não irão se repetir
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo André"); // Todo Set tem um contain para verificar se os elementos consta na lista; 
		alunos.remove("Rodrigo Turini"); 
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size()); // Mesmo com "7", sendo um duplicado, o output não considerará o duplicado.
		
		for (String aluno : alunos) {
			System.out.println(aluno); // maneira de acessar os elementos do Set, pois não funciona com get(index);
		}
		
		System.out.println("=-=-=-=-==-=-=-=-=-");
		
		alunos.forEach(aluno -> { // lambda
			System.out.println(aluno);
		});

		System.out.println("=-=-=-=-==-=-=-=-=-");
		
		System.out.println(alunos);
		System.out.println("=-=-=-=-==-=-=-=-=-");

		List<String> alunosEmLista = new ArrayList<>(alunos); // Posso colocar meu Set dentro de uma List para poder ordenar;
		System.out.println(alunosEmLista);

	}
}
