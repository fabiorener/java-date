package dates;

import java.time.LocalDate;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		
		/*
		 * A nova API disponibiliza uma grande quantidade de novas classes e m�todos. 
		 * 
		 * A classe principal dessa nova especifica��o � a classe java.time.LocalDate, 
		 * que tem a mesma fun��o que a antiga classe java.util.Date, mas com muito mais funcionalidades implementadas. 
		 * 
		 * Esse exemplo mostra algumas das possibilidades de utiliza��o da classe LocalDate.
		 * 
		 * No c�digo � mostrado como recuperar diversos dados de uma data como o dia da semana, o m�s e o ano.
		 *  
		 * Al�m disso, � poss�vel recuperar o nome do dia da semana, como String (segunda, ter�a, quarta,...) e tamb�m o n�mero (1 a 7). 
		 * 
		 * � poss�vel recuperar tamb�m o m�s e o ano. Tudo isso de uma forma muito mais f�cil do que era at� na vers�o 7 do Java e sem nenhuma API adicional.		
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
