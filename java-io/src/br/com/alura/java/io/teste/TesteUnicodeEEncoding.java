package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException { // Uso a exce��o pois o par�metro que passar pode dar erro;
		
		String s = "�";
		System.out.println(s.codePointAt(0)); // Descubro o codepoint da minha letra passada no par�metro, no caso, a primeira;
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252 "); // diz quantos bytes tem a String criada
		String sNovo = new String(bytes);
		System.out.println(sNovo); // o caminho inverso do getBytes, ele d� a letra pelo c�digo repassado no tipo informado;
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16 "); // Com UTF-16 j� foram 4 bytes
		sNovo = new String(bytes, "UTF-16"); // Posso passar no par�metro tamb�m de maneira expl�cita, depois da v�rgula
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8 "); // Com UTF-8 foi 1 byte
		sNovo = new String(bytes, "UTF-8"); 
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII); // O StandardCharsets j� mostra os principais formatos de code;
		System.out.print(bytes.length + ", US-ASCII "); // 1 byte
		sNovo = new String(bytes, "US-ASCII"); // a � fica como "?" porque n�o consta em sua lista
		System.out.println(sNovo);
	}
}
