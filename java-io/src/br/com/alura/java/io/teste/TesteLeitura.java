package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("arquivotxt.txt"); // Polimorfismo usando o tipo mais genérico InputStream
		Reader isr = new InputStreamReader(fis, "UTF-8"); // Polimorfismo usando o tipo mais genérico Reader
		BufferedReader br = new BufferedReader(isr); // Mantive o Buffered por causa do método readLine();
		
		String linha = br.readLine(); 
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close(); 
	}

}
