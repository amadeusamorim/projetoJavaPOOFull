package br.com.alura;

import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso2 curso = new Curso2("Curso de Futebol", "Luva de Pedreiro");
		List<Aula> aulas = curso.getAulas();
		
		curso.adiciona(new Aula("Como fazer gol de placa", 11));
		curso.adiciona(new Aula("Comemora��o do melhor do mundo", 9));
		curso.adiciona(new Aula("Onde (n�o) encontrar um empres�rio", 24));
		
		System.out.println(aulas);

	}

}
