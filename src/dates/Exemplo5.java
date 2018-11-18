package dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exemplo5 {
	
	public static void main(String[] args) {
		
		/*
		 * Outra funcionalidade muito interessante da nova API � utilizar o fuso hor�rio de cidades diferentes para a compara��o de datas. 
		 * 
		 * Por exemplo, � poss�vel pegar uma data qualquer e definir o fuso hor�rio dela em duas cidades diferentes 
		 * e depois comparar a diferen�a de tempo entre essas duas datas considerando o fuso. 
		 * 
		 * Esse exemplo mostra como fazer isso, onde inicialmente � definida uma hora qualquer, 
		 * depois � criada a vari�vel horaSaoPaulo utilizando o fuso de S�o Paulo e a horaParis 
		 * utilizando o fuso de Paris. 
		 * 
		 * Em seguida � feita a compara��o entre as duas datas e � mostrada a diferen�a em horas entre elas.
		 */
		
		
		LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);
		  
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
		System.out.println(horaSaoPaulo);
		  
		ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
		ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
		System.out.println(horaParis);
		  
		Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
		System.out.println(diferencaDeHoras.getSeconds() / 60 / 60);
		
	}

}
