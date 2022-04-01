package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int idade = 29; // integer
		// Integer idadeRef = new Integer(29); // Transformando um primitivo para objeto para inserir numa lista de forma que ela aceite;
		Integer idadeRef = Integer.valueOf(29); // Em vez de usar o new, temos de usar o valueOf(parâmetro); O parâmetro também pode ser repassado entre aspas;
		
		System.out.println(idadeRef.doubleValue()); // Transformando em double;
		
		System.out.println(Integer.MAX_VALUE); // Constante que diz qual o valor máximo que o Integer pode receber;
		
		System.out.println(Integer.SIZE); // Diz o tamanho de bits (32 bits);
		System.out.println(Integer.BYTES); // 4 bytes
		
		int valor = idadeRef.intValue(); // Irá retornar um primitivo (unboxing)
		
		String s = args[0]; // "10"
		
		// Integer numero = Integer.valueOf(s); // Transformei uma String num Inteiro automaticamente isso se chamar parsing;
		int numero = Integer.parseInt(s); // Passa uma String para um int primitivo diretamente por meio do .parseInt();
		System.out.println(numero); 
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing: transforma primitivo para objeto;
		
	}

}
