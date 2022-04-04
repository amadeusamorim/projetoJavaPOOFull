package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("arquivotxt2.txt"); 
//		Writer osw = new OutputStreamWriter(fos); 
//		BufferedWriter bw = new BufferedWriter(osw); 
//		FileWriter fw = new FileWriter("arquivotxt2.txt"); para enxugar mais o c�digo, lan�o o new FileWriter direto na cria�ao do bw

		// As tr�s formas (FileWriter, PrintStream e PrintWriter) abaixo evitam toda a escrita acima:
//		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivotxt2.txt"));
//		PrintStream ps = new PrintStream("arquivotxt2.txt");
		PrintWriter ps = new PrintWriter("arquivotxt2.txt", "UTF-8"); // O writer faz a fun��o semelhante do Stream, mas veio vers�es depois pelo Java
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit,");
		ps.println();
		ps.println("oxe uma linhafdwfdfdsfs"); // O println imprime e vai pra outra linha;
		
		ps.close(); 
		
		System.out.println(); // o println define uma impress�o + nova linha; o out imprime no console; e o System � a Classe;
	}

}
