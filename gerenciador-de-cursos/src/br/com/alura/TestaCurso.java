package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
//		List<Aula> aulas = javaColecoes.getAulas(); // N�o precisa escrever dessa maneira
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
//		System.out.println(aulas);
//		System.out.println(javaColecoes.getAulas()); // imprime a mesma coisa de aulas
//		System.out.println(aulas == javaColecoes.getAulas()); // true
		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21)); // O m�todo add mexe na classe Curso
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21)); // M�todo da classe Curso
		javaColecoes.adiciona(new Aula("Criando uma aula", 20)); 
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22)); 

		
		
		System.out.println(javaColecoes.getAulas());
		
		
		
	}

}
