package br.com.alura.add;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3,  7);
		
		Assert.assertEquals(12, soma); // confere se a primeira variável é igual a segunda
		 
		// Barrinha verde, teste funcionou
		// Barrinha vermelha, teste falhou
		
	}

}
