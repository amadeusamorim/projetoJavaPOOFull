package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{ 
	
	public ContaCorrente(int agencia, int numero) { 
		super(agencia, numero);
	}
	
	@Override // rescreve o método
		public void saca(double valor) { 
		double valorASacar = valor + 0.2;	
        System.out.println("Taxa para transações em conta corrente: 20 centavos");
		super.saca(valorASacar);
		}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}

}
