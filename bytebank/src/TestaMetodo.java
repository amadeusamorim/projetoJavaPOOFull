
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50); 
		System.out.println(contaDoPaulo.saldo); // output -> 150 
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo); // output -> 130
		System.out.println(conseguiuRetirar); // output -> true
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(3000, contaDoPaulo)) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo); // output -> 700
		System.out.println(contaDoPaulo.saldo); // output -> 430
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);

	}

}
