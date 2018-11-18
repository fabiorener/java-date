package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exemplo6 {
	
	public static void main(String[] args) {
		
		/*
		 * A formatação de data para diferentes padrões também ficou um pouco mais simples nessa nova versão, para isso, 
		 * agora é criado um formatador de dado com a classe DateTimeFormatter e a própria classe LocalDate tem um método 
		 * format que retorna uma String com a data formatada no padrão passado como parâmetro. 
		 * 
		 */
		
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		  
		System.out.println("Data com /: " + hoje.format(formatadorBarra));     
		System.out.println("Data com -: " + hoje.format(formatadorTraco));
		
	}

}
