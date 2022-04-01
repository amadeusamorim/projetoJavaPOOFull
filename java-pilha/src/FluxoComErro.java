public class FluxoComErro {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage(); 
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} 
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		metodo2();
		System.out.println("Fim do metodo2");
	}
}

// S� CONSEGUIMOS FAZER THROW DE OBJETOS COM EXCE��ES e n�o com todo tipo de Classe;