package br.com.alura;

public class Aula2 implements Comparable<Aula2>{
	
	private String aula;
	private int tempo;
	
	
	
	public Aula2(String aula, int tempo) {
		super();
		this.aula = aula;
		this.tempo = tempo;
	}

	public String getAula() {
		return aula;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.aula + ", duração: " + this.tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula2 outraAula) {
		return this.aula.compareTo(outraAula.getAula());
	}

}
