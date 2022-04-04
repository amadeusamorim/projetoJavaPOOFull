package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException { // Uso a exceção pois o parâmetro que passar pode dar erro;
		
		String s = "Ç";
		System.out.println(s.codePointAt(0)); // Descubro o codepoint da minha letra passada no parâmetro, no caso, a primeira;
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252 "); // diz quantos bytes tem a String criada
		String sNovo = new String(bytes);
		System.out.println(sNovo); // o caminho inverso do getBytes, ele dá a letra pelo código repassado no tipo informado;
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16 "); // Com UTF-16 já foram 4 bytes
		sNovo = new String(bytes, "UTF-16"); // Posso passar no parâmetro também de maneira explícita, depois da vírgula
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8 "); // Com UTF-8 foi 1 byte
		sNovo = new String(bytes, "UTF-8"); 
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII); // O StandardCharsets já mostra os principais formatos de code;
		System.out.print(bytes.length + ", US-ASCII "); // 1 byte
		sNovo = new String(bytes, "US-ASCII"); // a Ç fica como "?" porque não consta em sua lista
		System.out.println(sNovo);
	}
}
