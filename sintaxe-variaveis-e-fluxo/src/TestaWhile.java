
public class TestaWhile {
	
	public static void main(String[] args) {
		int contador = 0; // precisa dar um valor inicial
		
		while(contador <= 10) {
			System.out.println(contador);
			contador++; // é o equivalente ao contador + 1; equivale ao ++contador
			// contador += 1; 
			// contador = contador + 1 (igual ao python)
		}
		System.out.println(contador);
	}

}
