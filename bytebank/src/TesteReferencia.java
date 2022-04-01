
public class TesteReferencia {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		// A referência segundaConta aponta que essa variável irá dar no mesmo resultado da primeira conta, ou seja, é como se a primeiraConta e segundaConta fossem duas cartas que se direcionam ao mesmo endereço
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;	
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo da primeira: " + primeiraConta.saldo); // Se eu imprimir a primeira também vai imprimir 400, as duas referências apontam para o mesmo objeto!
		
		// Caso eu imprima de duas tabelas que foram derivadas de new diferentes, elas vão ser diferentes;

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		// A prova está acima, no qual as duas 'identidades' das tabelas são iguais;
	}

}
