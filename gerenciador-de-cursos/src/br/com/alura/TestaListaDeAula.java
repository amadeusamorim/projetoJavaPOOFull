package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		ArrayList<Aula> aulas = new ArrayList<>(); // Só irá receber de aulas <>;
		Aula a1 = new Aula("Revistando as ArrayLists" , 21);
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas); // Colocou na ordem graças ao ToString na Classe Aulas;
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // Comparando pelo pelo tempo Interface Comparator;
		System.out.println(aulas);
		aulas.sort(Comparator.comparing(Aula::getTempo)); // A partir do Java 8, toda lista dá para chamar o sort;
	}

}
