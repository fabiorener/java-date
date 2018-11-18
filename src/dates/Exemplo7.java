package dates;

import java.time.LocalDate;

public class Exemplo7 {

	public static void main(String[] args) {
	
		/*
		 * Exemplo mostra alguns m�todos interessantes como, 
		 * por exemplo, o que verifica se o ano da data � bissexto, 
		 * o n�mero de dias do m�s e do ano, e tamb�m a maior e menor data poss�vel na API.
		 */
		
		
		LocalDate data = LocalDate.now();
        
		System.out.println("Ano bissexto: " + data.isLeapYear());
		System.out.println("N�mero de dias do m�s: " + data.lengthOfMonth());
		System.out.println("N�mero de dias do ano: " + data.lengthOfYear());
		System.out.println("Menor data: " + LocalDate.MIN);
		System.out.println("Maior data: " + LocalDate.MAX);
		

	}

}
