
public class TestaSomatoria {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0; // declarar o total do lado de fora para que ele n�o zere toda vez que come�ar o loop
		while (contador <= 10) {
			total += contador;
			contador++;
		}
		System.out.println(total); // imprime apenas o valor final
	}

}
