package br.com.alura;

import java.util.*;

public class TestaListaDeAula2 {
	
	public static void main(String[] args) {
		
		Aula2 a1 = new Aula2("Programação Orientada a Objetos", 25);
		Aula2 a2 = new Aula2("Fundamentos de Python", 32);
		Aula2 a3 = new Aula2("Azure", 15);
		
		ArrayList<Aula2> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
		aulas.sort(Comparator.comparing(Aula2::getTempo));
		System.out.println(aulas);
	}
}
