
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais"); // Atalho para print ln � o sysout + CRTL + SPACE
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar por estar acompanhado");
			} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
		}
	}
}