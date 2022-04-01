
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2; // Se a quantidadePessoas for menor que 2, o valor de acompanhado será false, do contrário True
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) { // o OU no java é || e o E (AND) é &&; o == compara para saber se o valor passado é igual a condição; no caso do acompanhado, como o valor é verdadeiro, não precisa colocar em sua condição o nome
			System.out.println("seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}

	}
}
