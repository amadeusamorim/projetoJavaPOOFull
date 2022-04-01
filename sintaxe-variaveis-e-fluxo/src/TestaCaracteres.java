
public class TestaCaracteres {
	
	public static void main(String[] args ) {
		char letra = 'a'; // O char só compila com aspas simples
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor); // Imprime a letra B
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020; // converte o número para string e concatena com a palavra
		System.out.println(palavra);
	}

}
