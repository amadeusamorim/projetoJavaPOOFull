package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {

	public static void main(String[] args) {
		
		Collection<Aluno> alunos = new HashSet<>(); // Voc� precisa saber a ordem de alunos matriculados? N�o? Hash.
		// Com o Collection voc� pode usar muitos m�todos que o Hash usa;
		alunos.size();
		alunos.add(null);
		alunos.remove(null);
	}
}
