package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCursoDois {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21)); 
		javaColecoes.adiciona(new Aula("Criando uma aula", 20)); 
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22)); 
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis); // faz um clone e permite modificar a lista
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
