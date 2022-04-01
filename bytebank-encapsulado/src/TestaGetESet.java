
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getNumero());
		
		Cliente amadeus = new Cliente();
		//conta.cliente = amadeus;
		amadeus.setNome("Amadeus Amorim");
		
		conta.setTitular(amadeus);
		
		System.out.println(conta.getTitular()); // output -> Cliente@5acf9800
		
		System.out.println(conta.getTitular().getNome()); // output -> Amadeus Amorim
		
		conta.getTitular().setProfissao("Analista de Dados");
		// agora em duas linhas
		Cliente titularDaConta = conta.getTitular(); // criei uma variável temporária
		titularDaConta.setProfissao("Analista de Dados");
		
		System.out.println(titularDaConta); // output -> Cliente@5acf9800
		System.out.println(amadeus); // output -> Cliente@5acf9800
		System.out.println(conta.getTitular()); // output -> Cliente@5acf9800
	}

}
