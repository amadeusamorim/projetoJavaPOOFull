package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("arquivotxt2.txt"); 
//		Writer osw = new OutputStreamWriter(fos); 
//		BufferedWriter bw = new BufferedWriter(osw); 
		
//		FileWriter fw = new FileWriter("arquivotxt2.txt"); para enxugar mais o código, lanço o new FileWriter direto na criaçao do bw
		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivotxt2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit,"); 
		bw.newLine(); // Esse separador de linha é o de mais alto nível de todos os abaixo
		bw.newLine(); 
//		fw.write(System.lineSeparator()); // Define um separador de linha, mais efetivo que o \r\n do windows, pois é universal;
//		fw.write("\r\n"); // O \r define o return e o \n define uma nova linha (em Windows) // FileWriter não tem o método newline();
		bw.write("oxe uma linha");
		
		bw.close(); 
	}

}
