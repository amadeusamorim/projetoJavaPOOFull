
public class TestaContaComExcecaoChecked {
	
	public static void main(String[] args) {
		
		
		Conta c = new Conta();
		try { // Para funcionar o c.depositar, que tem herança checked, precisa colocar no programa principal um try/catch
			c.deposita(); // o Compilador ao ver apenas o c.deposita(); sabendo que ele tem uma exceção checked, não compila o código;
		} catch(MinhaExcecao ex) {
			System.out.println("tratamento...");
		}
	}

}
