package dates;

import java.time.LocalDate;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		
		/*
		 * A nova API disponibiliza uma grande quantidade de novas classes e métodos. 
		 * 
		 * A classe principal dessa nova especificação é a classe java.time.LocalDate, 
		 * que tem a mesma função que a antiga classe java.util.Date, mas com muito mais funcionalidades implementadas. 
		 * 
		 * Esse exemplo mostra algumas das possibilidades de utilização da classe LocalDate.
		 * 
		 * No código é mostrado como recuperar diversos dados de uma data como o dia da semana, o mês e o ano.
		 *  
		 * Além disso, é possível recuperar o nome do dia da semana, como String (segunda, terça, quarta,...) e também o número (1 a 7). 
		 * 
		 * É possível recuperar também o mês e o ano. Tudo isso de uma forma muito mais fácil do que era até na versão 7 do Java e sem nenhuma API adicional.		
		 */
		
	
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
		System.out.println("Mes: " + localDate.getMonthValue());
		System.out.println("Mes: " + localDate.getMonth().name());       
		System.out.println("Ano: " + localDate.getYear());
		
		
	}

}
