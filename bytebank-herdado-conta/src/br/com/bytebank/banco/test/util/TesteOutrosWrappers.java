package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing
		
		Double dRef = Double.valueOf(3.2); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Integer.valueOf(29);
		Number refNumero2 = Double.valueOf(29.8);
		Number refNumero3 = Float.valueOf(29.8f);
		
		List<Number> lista = new ArrayList<>(); // Funciona com qualquer tipo de n�mero na lista;
		lista.add(10);
		lista.add(12.8);
		lista.add(26.6f);

	}

}
