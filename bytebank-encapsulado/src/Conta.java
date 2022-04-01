public class Conta { 
	private double saldo; 
	private int agencia; 
	private int numero; 
	private Cliente titular; 
	private static int total = 0; 
	
	public Conta(int agencia, int numero) {
		Conta.total++; 
		System.out.println("O total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta de n�mero " + this.numero);
	}

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
	public double getSaldo() { 
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0.");
		}
		this.numero = numero; 
	}
	
	public int getAgencia() { 
		return agencia;
	}
	
	public void setAgencia(int agencia) { 
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0.");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
