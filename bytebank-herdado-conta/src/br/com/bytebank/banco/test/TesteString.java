package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String[] args) {
		
		String vazio = " ";
		System.out.println(vazio);
		String outroVazio = vazio.trim(); // � como se fosse o strip() do python, tira todos os espa�os vazios nulos
		System.out.println(outroVazio.isEmpty()); // Pergunta se a String est� vazia e retorna um true ou false
		
		String nome = "Alura";
		
		System.out.println(nome.contains("Alu")); // Verifica se na String tem o argumento repassado
		
		System.out.println(nome.length()); // Vai dizer o tamanho da palavra repassada;
		System.out.println("----------------------------");
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		char c = nome.charAt(2); // atribui a var c para o terceiro caracter da String Alura
		System.out.println(c); // outp -> u
		
		String sub = nome.substring(1); // Criando uma substring (string dentro de string) a partir do n�mero indicado
		System.out.println(sub);
			
		
	}

}
