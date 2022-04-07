import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); // Java 8 em diante
		
		palavras.sort(Comparator.comparing(s -> s.length())); // Palavras (palavras) ordenem (.sort) comparando (Comparator.comparing) o tamanho de string(s.length();
		palavras.sort(comparing(String::length)); // Importei o método static Comparator
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(palavras);

		palavras.forEach(System.out::println); // Método Reference
	}
}

