package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class ExTestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Rogério Ceni", 25965);
		Aluno a2 = new Aluno("Igor Gomes", 14137);
		Aluno a3 = new Aluno("Paula Trass", 85408);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
	}
}
