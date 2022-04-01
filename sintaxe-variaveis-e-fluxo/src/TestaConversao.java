
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50; // double suporta 64 bits
		
		float pontoFlutuante = 3.14f; // float suporta 32 bits (é necessário botar o f no final ou colocar o cast (float) na frente do num
		
		int valor = (int) salario; // sem o cast (int) a variável não compilaria, pois de double pra int a variável perde características
		System.out.println(valor);
		
		long numeroGrande = 131616106165612L; // Guarda até 64 bits
		short valorPequeno = 2131;
		byte b = 127; // só vai até 127
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total); // output-> 0.30000000000000004
		
	}

}
