package testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataHoraTeste {

	public static void main(String[] args) {

		DateTimeFormatter formatoFimAno = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH-mm-ss");
		
		String minhaData = "12/31/2020";//"2020-12-31";
		LocalDate dataFimDeAno = LocalDate.parse(minhaData, formatoFimAno);
		System.out.println("1) DataFimDeAno: " + dataFimDeAno.format(formatoData));
		
		LocalDate data = LocalDate.of(1978, 8, 24);
		System.out.println("2) Data: " + data.format(formatoData));

		LocalTime hora = LocalTime.of(19, 40);
		System.out.println("3) Hora: " + hora.format(formatoHora));

		LocalDateTime dataHora = LocalDateTime.of(1978, Month.AUGUST, 24, 7, 55);
		System.out.println("4) Datahora: " + dataHora.format(formatoDataHora));
		System.out.println("4) Datahora: " + dataHora.plusDays(10).format(formatoDataHora));
		System.out.println("4) Datahora: " + dataHora.minusDays(20).format(formatoDataHora));
		System.out.println("4) Datahora: " + dataHora.plusHours(2).format(formatoDataHora));

		LocalDate hoje = LocalDate.now();
		System.out.println("5) Hoje: " + hoje.format(formatoData));
		
		System.out.println(Period.between(data, hoje));
		System.out.println(Period.between(data, hoje).getYears());
		System.out.println(Period.between(data, hoje).getMonths());
		System.out.println(Period.between(data, hoje).getDays());
	}
}