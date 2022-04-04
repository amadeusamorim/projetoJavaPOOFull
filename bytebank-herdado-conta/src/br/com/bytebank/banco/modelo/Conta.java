package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Amadeus Amorim
 *
 */
public abstract class Conta extends Object implements Comparable <Conta>, Serializable{ // S� compara essa conta com outra conta; Implementei a classe Serializable;
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular; // O transient significa que ele n�o faz parte da Serializacao
	private static int total = 0;

	/**
	 * Construtor para inicializar o objeto Conta a partir da ag�ncia e n�mero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) { // construtor
		Conta.total++;
		// System.out.println("O total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta de n�mero " + this.numero);
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo;
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) { 
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor " + valor);
		}
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor); // Se o saca estiver ok, passa para o pr�ximo passo, caso n�o, j� trava no m�todo anterior e cai na exce��o
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0.");
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
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
	
	@Override
	public boolean equals(Object ref) { // Vou verificar se a ag�ncia e o n�mero � igual;
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		} 
		
		if (this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
		public int compareTo(Conta outra) { // Defino a ordem natural da Conta par feitos de compara��o
			return Double.compare(this.saldo, outra.saldo);
		}
	
	@Override
	public String toString() {
		return "N�mero: " + this.numero + ", Ag�ncia: " + this.agencia;
	}
}
