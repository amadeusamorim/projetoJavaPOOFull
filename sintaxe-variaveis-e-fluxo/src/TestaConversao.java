
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50; // double suporta 64 bits
		
		float pontoFlutuante = 3.14f; // float suporta 32 bits (� necess�rio botar o f no final ou colocar o cast (float) na frente do num
		
		int valor = (int) salario; // sem o cast (int) a vari�vel n�o compilaria, pois de double pra int a vari�vel perde caracter�sticas
		System.out.println(valor);
		
		long numeroGrande = 131616106165612L; // Guarda at� 64 bits
		short valorPequeno = 2131;
		byte b = 127; // s� vai at� 127
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total); // output-> 0.30000000000000004
		
	}

}
