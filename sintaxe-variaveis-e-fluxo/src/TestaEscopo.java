
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		boolean acompanhado; // a vari�vel s� � v�lida dentro do chaveamento que ela nasceu;
		// N�o existe valor padr�o para um boolean; 

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}

	}

}
