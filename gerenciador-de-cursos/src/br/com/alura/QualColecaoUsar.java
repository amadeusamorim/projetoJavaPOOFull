package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {

	public static void main(String[] args) {
		
		Collection<Aluno> alunos = new HashSet<>(); // Você precisa saber a ordem de alunos matriculados? Não? Hash.
		// Com o Collection você pode usar muitos métodos que o Hash usa;
		alunos.size();
		alunos.add(null);
		alunos.remove(null);
	}
}
