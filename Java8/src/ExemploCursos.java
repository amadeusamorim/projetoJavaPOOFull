import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
	
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		OptionalDouble media = cursos.stream()
			.filter(c -> c.getAlunos() >= 100) 
			.mapToInt(c-> c.getAlunos()) 
			.average();
		
//		System.out.println(sum);
		
//		cursos.stream() // Optional ajuda a trabalhar com null
//			.filter(c -> c.getAlunos() >= 100)
//			.findAny() // Qualquer um que tem mais de 100;
//			.ifPresent(c -> System.out.println(c.getNome()));
//		Curso curso = optionalCurso.orElse(null);
//		System.out.println(curso.getNome());
		
//		cursos = cursos.stream() // agora sim eu tenho uma nova coleção
//				.filter(c -> c.getAlunos() >= 100)
//				.collect(Collectors.toList()); // coloco meus valores encontrados na Stream dentro de uma lista por meio do .collect;
		
		cursos.stream() // Criei um mapa com Key e Value
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(
						c-> c.getNome(), // Key
						c-> c.getAlunos())) // Value
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
		
//		System.out.println(map);
	}
}
