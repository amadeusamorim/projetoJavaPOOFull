package br.com.alura;

import java.util.*;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");    

        for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
	System.out.println("-=-=-=-=-=-=-=-=-=-=-");
	System.out.println(alunos.size());
	System.out.println("-=-=-=-=-=-=-=-=-=-=-");
	alunos.add("Paulo");
	System.out.println(alunos.size());
	System.out.println("-=-=-=-=-=-=-=-=-=-=-");

    }
}