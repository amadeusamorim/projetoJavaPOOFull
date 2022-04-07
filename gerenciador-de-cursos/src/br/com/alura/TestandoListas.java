package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas); // Imprime exatamente igual as lists no Python, respeitando a ordem de adição;
		
		aulas.remove(0); // Remove o primeiro objeto;
		System.out.println(aulas);
		
		for (String aula : aulas) { // comando foreach ctrl + espaço // para cada string aula dentro de aulas faça...
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0); // instancia apenas o índice puxado pelo get;
		System.out.println("A primeira aula é: " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) { // o size diz quantos elementos está na minha array
			System.out.println("Aulas: " + aulas.get(i));
		}
		System.out.println(aulas.size());
		
		aulas.forEach(aula -> { // Percorrendo por meio do lambda (mais funcional a partir do Java8);
			System.out.println("percorrendo:");
			System.out.println("Aula " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas); // Imprime na ordem de inserção
		Collections.sort(aulas);
		System.out.println("    Depois de ordenado:");
		System.out.println(aulas); // Imprime na ordem alfabética
		
	}

}
