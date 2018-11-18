package dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Exemplo8 {

	public static void main(String[] args) {

		
		
		/*
		 * Calculando diferen�a entre datas no java 8
		 */
		
	     // Cria um Objeto LocalDate com a data atual.
        LocalDate hoje = LocalDate.now();
        
        // Cria um Objeto LocalDate com a data 26/09/2020.
        //LocalDate outraData = LocalDate.of(2020, Month.SEPTEMBER, 26);
        LocalDate outraData = LocalDate.of(2015, Month.OCTOBER, 04);

        
        // Calcula a diferen�a de dias entre as duas datas
        long diferencaEmDias = ChronoUnit.DAYS.between(hoje, outraData);
        // Calcula a diferen�a de meses entre as duas datas
        long diferencaEmMes = ChronoUnit.MONTHS.between(hoje, outraData);
        // Calcula a diferen�a de anos entre as duas datas
        long diferencaEmAnos = ChronoUnit.YEARS.between(hoje, outraData);
        
        // Exibe a diferen�a em dias entre as datas
        System.out.println("Diferen�a em dias entre " + hoje + " e " + outraData + " = " + diferencaEmDias);
        // Exibe a diferen�a em meses entre as datas
        System.out.println("Diferen�a em meses entre " + hoje + " e " + outraData + " = " + diferencaEmMes);
        // Exibe a diferen�a em anos entre as datas
        System.out.println("Diferen�a em anos entre " + hoje + " e " + outraData + " = " + diferencaEmAnos);		
		
		
		
	}

}
