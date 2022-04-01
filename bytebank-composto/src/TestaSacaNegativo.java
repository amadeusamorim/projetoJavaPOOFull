
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo()); // Acesso por método
		
		// quer que isso seja proibido para evitar ações indesejadas de terceiros nos atributos
		// acesso só por método()
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
	}

}
