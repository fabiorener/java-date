package dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exemplo3 {
	
	public static void main(String[] args) {
	
		
	/*
	 * Outra coisa bastante utilizada quando trabalhamos com datas é a comparação entre elas como, 
	 * por exemplo, se uma data é antes ou depois da outra ou quantos meses de diferença existem entre duas datas. 
	 * 
	 * Tudo isso é possível fazer com as novas classes da API de data. 
	 * 
	 * O exemplo abaixo mostra as principais maneiras de comparar datas com os métodos isAfter, isBefore e isEqual.
	 */
		
		
		LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);            
		LocalDate localDateNovo = LocalDate.of(2015, 3,5);  
		              
		System.out.println(localDateAntigo.isAfter(localDateNovo));
		System.out.println(localDateAntigo.isBefore(localDateNovo)); 
		System.out.println(localDateAntigo.isEqual(localDateNovo));
		              
		Period periodo = Period.between(localDateAntigo, localDateNovo);
		System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias"); 
		System.out.println("Apenas meses: " + periodo.toTotalMonths());
		
		
		long diferencaEmDias = ChronoUnit.DAYS.between(localDateAntigo,localDateNovo);
		
		System.out.println("Dias com ChronoUnit : " + diferencaEmDias);
		
		
	}

}
