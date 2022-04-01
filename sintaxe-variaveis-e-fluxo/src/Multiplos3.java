
public class Multiplos3 {
	
	public static void main(String[] args) {
		for (int numero = 0; numero <= 100; numero++) {
			if (numero % 3 == 0) {
				System.out.print(numero/3);
				System.out.print('-');
			}
		}
		System.out.println("FIM");
	}
}
