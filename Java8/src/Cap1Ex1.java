import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Cap1Ex1 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		Consumer<String> palavra = new Imprime();
		palavras.forEach(palavra);
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));	
		System.out.println(palavras);

	}

}

class Imprime implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

























