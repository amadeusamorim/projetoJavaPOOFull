
public class TestaContaComExcecaoChecked {
	
	public static void main(String[] args) {
		
		
		Conta c = new Conta();
		try { // Para funcionar o c.depositar, que tem heran�a checked, precisa colocar no programa principal um try/catch
			c.deposita(); // o Compilador ao ver apenas o c.deposita(); sabendo que ele tem uma exce��o checked, n�o compila o c�digo;
		} catch(MinhaExcecao ex) {
			System.out.println("tratamento...");
		}
	}

}
