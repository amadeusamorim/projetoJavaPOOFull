public class Conta { 
	private double saldo; // ao transformar um atributo em private, estamos encapsulando, evitando que alguém o modifique
	int agencia; 
	int numero; 
	Cliente titular; 

	void deposita(double valor) {
		this.saldo += valor; 
	}
	
	public boolean saca(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	public double getSaldo() { // para buscar um dado do atributo por convenção usa-se get
		return this.saldo;
	}
}
