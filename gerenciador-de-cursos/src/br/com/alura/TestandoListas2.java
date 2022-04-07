package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas2 {
	
	public static void main(String[] args) {
		String curso1 = "Java Collections";
		String curso2 = "Java Intro a POO";
		String curso3 = "SQL Server 2007";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		for (String curso : cursos) {
			System.out.println("Cursos: " + curso);
		}
		
		cursos.remove(1);
		System.out.println(cursos);

		String primeiraAula = cursos.get(0);
		System.out.println("O primeiro curso da lista é o " + primeiraAula);
		
		cursos.add("Alura cursos em geral");
		Collections.sort(cursos);
		System.out.println(cursos);
		
	}

}
