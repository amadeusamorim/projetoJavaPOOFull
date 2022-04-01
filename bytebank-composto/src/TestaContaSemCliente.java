
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente(); // Se eu não passar um new Cliente e atribuir um nome para titular, irá dar um erro pois não há referência para alterar o nome, sendo asim NULL
		contaDaMarcela.titular.nome = "Marcela"; // Passei "Marcela" sem Cliente, retorna erro
		
		System.out.println(contaDaMarcela.titular); 
		System.out.println(contaDaMarcela.titular.nome);
	}

}
