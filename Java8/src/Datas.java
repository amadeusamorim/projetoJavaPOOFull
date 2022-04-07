import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now(); // Puxa a data de hoje;
		System.out.println(hoje);
		
		LocalDate copaDoMundoCatar = LocalDate.of(2022, 11, 21); // passar uma data yyyy, mm, dd
		
		int anos = copaDoMundoCatar.getYear() - hoje.getYear();
		System.out.println(anos); // Faltam 0 anos
		
		Period periodo = Period.between(hoje, copaDoMundoCatar);
		System.out.println(periodo.getDays()); // puxa apenas os dias;
		
		LocalDate proximaCopa = copaDoMundoCatar.plusYears(4); // O objeto é imutável, por isso tenho de ter outra variável
		
		System.out.println(proximaCopa);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximaCopa.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		
	}

}
