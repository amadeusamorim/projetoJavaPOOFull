package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Rogério Ceni", 25965);
		Aluno a2 = new Aluno("Igor Gomes", 14137);
		Aluno a3 = new Aluno("Paula Trass", 85408);
		Aluno a4 = new Aluno("Marcos Moura", 25965);


		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		
		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem é o aluno com matrícula 25965?");
		Aluno aluno = javaColecoes.buscaMatriculado(25965);
		System.out.println("Aluno: " + aluno);
		
//		System.out.println("O aluno " + a1 + " está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(a1));
//
//		System.out.println("Todos os alunos matriculados: ");
//		
//		Set<Aluno> alunos = javaColecoes.getAlunos();
//		Iterator<Aluno> iterador = alunos.iterator(); // Toda coleção tem Iterator 
//		while(iterador.hasNext()) {
//			Aluno proximo = iterador.next();
//			System.out.println(proximo);
//		}
		
//		for (Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
//		
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
//		
//		Aluno ceni= new Aluno("Rogério Ceni", 25965);
//		System.out.println("E esse Ceni está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(ceni)); // Sobrescrevi o hashCode;
//		
//		System.out.println("O a1 é igual ao Ceni?"); // Sobrescrevi o equals;
//		System.out.println(a1.equals(ceni));

	}
}
