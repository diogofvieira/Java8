package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
		
		LocalDate dataFuturo = LocalDate.of(2019, 1, 1);
		System.out.println(dataFuturo);
		
		Period periodo = Period.between(dataAtual, dataFuturo);
		System.out.println(periodo);
		
		LocalDate proximosAnos = dataAtual.plusYears(2);
		System.out.println(proximosAnos);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatter = dataFuturo.format(formatter);
		System.out.println(valorFormatter);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);

		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		String valorFormatterHora = agora.format(formatterHora);
		System.out.println(valorFormatterHora);
		
		
		LocalTime intervalo = LocalTime.of(10, 33);
		System.out.println(intervalo);
		
		
		
	}
 
}
