package dates;

import java.time.LocalDate;

public class Exemplo4 {

	public static void main(String[] args) {
		
		/*
		 *O trecho abaixo mostra o c�digo de algumas poss�veis opera��es na classe LocalDate,
		 * dentre elas existem diversas opera��es como o plusDays(), 
		 * que adiciona os dias passados como par�metro a data, 
		 * o plusWeeks que adiciona as semanas passadas como par�metro a data e o minusYears(), 
		 * que remove os anos passados como par�metro a data. 
		 */
		
		
		LocalDate dataManipulacao = LocalDate.now();
		System.out.println("Mais 5 dias:" + dataManipulacao.plusDays(5));
		System.out.println("Mais 5 semanas:" + dataManipulacao.plusWeeks(5));
		System.out.println("Mais 5 anos:" + dataManipulacao.plusYears(5));
		System.out.println("Mais 2 meses:" + dataManipulacao.plusMonths(2));
		System.out.println("Menos 1 ano:" + dataManipulacao.minusYears(1));
		System.out.println("Menos 1 m�s:" + dataManipulacao.minusMonths(1)); 
		System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));
		System.out.println("Data Original:" + dataManipulacao);
		
	}
	
	
	
}
