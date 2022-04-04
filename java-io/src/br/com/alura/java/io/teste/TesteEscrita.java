package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("arquivotxt2.txt"); // cria um novo txt, usada para escrever bytes num arquivo
		Writer osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw); 
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit,"); // escreve em um arquivo
//		bw.newLine();
		bw.newLine();
		bw.write("oxe uma linha");
		
		bw.close(); 
	}

}
