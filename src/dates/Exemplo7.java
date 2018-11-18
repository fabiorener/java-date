package dates;

import java.time.LocalDate;

public class Exemplo7 {

	public static void main(String[] args) {
	
		/*
		 * Exemplo mostra alguns métodos interessantes como, 
		 * por exemplo, o que verifica se o ano da data é bissexto, 
		 * o número de dias do mês e do ano, e também a maior e menor data possível na API.
		 */
		
		
		LocalDate data = LocalDate.now();
        
		System.out.println("Ano bissexto: " + data.isLeapYear());
		System.out.println("Número de dias do mês: " + data.lengthOfMonth());
		System.out.println("Número de dias do ano: " + data.lengthOfYear());
		System.out.println("Menor data: " + LocalDate.MIN);
		System.out.println("Maior data: " + LocalDate.MAX);
		

	}

}
