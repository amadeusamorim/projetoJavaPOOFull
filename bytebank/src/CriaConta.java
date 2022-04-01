
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 
		primeiraConta.saldo = 200; 
		
		primeiraConta.saldo += 100; // Irá imprimir a primeira conta somado com +100
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo); 
		
		System.out.println(primeiraConta.agencia); // Se eu atribuir o valor na Classe, ela se torna o valor da Classe
		System.out.println(primeiraConta.numero); // O valor default para int é 0
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
