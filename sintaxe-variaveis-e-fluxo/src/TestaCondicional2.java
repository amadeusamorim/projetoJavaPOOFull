
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2; // Se a quantidadePessoas for menor que 2, o valor de acompanhado ser� false, do contr�rio True
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) { // o OU no java � || e o E (AND) � &&; o == compara para saber se o valor passado � igual a condi��o; no caso do acompanhado, como o valor � verdadeiro, n�o precisa colocar em sua condi��o o nome
			System.out.println("seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}

	}
}
