package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// o m�todo Socket � para passar a escrita por meio da rede, mas precisa de outro computador para realizar a conex�o;
		// Socket s = new Socket();
		// InputStream fis = s.getInputStream();
		
		// Entrada
		InputStream fis = System.in; // Usar o teclado para dar o input (Tamb�m funciona com o FileInputStream(arquivotxt.txt), copiando um arquivo pro outro);
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr); 
		
		// Sa�da
		OutputStream fos = System.out; // o sysout faz o c�digo aparecer no console; crio um arquivo new FileOutputStream("arquivotxt2.txt"); 
		Writer osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw); 
		
		String linha = br.readLine(); 
		
		while(linha != null && !linha.isEmpty()) { // Ao colocar o linha.isEmpty, quando dou enter na escrita, ele sai do la�o
			bw.write(linha);
			bw.newLine();
			bw.flush(); // d� uma 'descarga' para o c�digo rodar logo
			linha = br.readLine();
		}
		
		br.close(); 
		bw.close();
	}

}
