
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo()); // Acesso por m�todo
		
		// quer que isso seja proibido para evitar a��es indesejadas de terceiros nos atributos
		// acesso s� por m�todo()
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
	}

}
