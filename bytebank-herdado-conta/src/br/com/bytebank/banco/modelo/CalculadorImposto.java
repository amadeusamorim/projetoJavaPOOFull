package br.com.bytebank.banco.modelo;	// Convenção para agrupar o projeto em pastas

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
		
	public double getValorImposto(){
		return totalImposto;
	}
}
