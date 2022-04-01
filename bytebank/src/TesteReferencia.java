
public class TesteReferencia {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		// A refer�ncia segundaConta aponta que essa vari�vel ir� dar no mesmo resultado da primeira conta, ou seja, � como se a primeiraConta e segundaConta fossem duas cartas que se direcionam ao mesmo endere�o
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;	
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo da primeira: " + primeiraConta.saldo); // Se eu imprimir a primeira tamb�m vai imprimir 400, as duas refer�ncias apontam para o mesmo objeto!
		
		// Caso eu imprima de duas tabelas que foram derivadas de new diferentes, elas v�o ser diferentes;

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		// A prova est� acima, no qual as duas 'identidades' das tabelas s�o iguais;
	}

}
