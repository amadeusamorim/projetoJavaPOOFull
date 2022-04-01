
public class TesteFuncionario { 
	
	
	public static void main(String[] args) {
		
		Funcionario amadeus = new Gerente(); // Não se pode fazer um new Funcionario, pois 
		amadeus.setNome("Amadeus Amorim");
		amadeus.setCpf("555.555.555-55");
		amadeus.setSalario(2600.00);
		
		System.out.println(amadeus.getNome());
		System.out.println(amadeus.getBonificacao());
		
	}

}
