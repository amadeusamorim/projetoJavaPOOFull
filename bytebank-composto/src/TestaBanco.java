
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222.22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo; // � a refer�ncia repassada nesse classe;
		System.out.println(contaDoPaulo.titular.nome); // Aponta para a contaDoPaulo que ai para o atributo titular que ai procurar na Classe Cliente o seu nome
	}

}
