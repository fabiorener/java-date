package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exemplo6 {
	
	public static void main(String[] args) {
		
		/*
		 * A formata��o de data para diferentes padr�es tamb�m ficou um pouco mais simples nessa nova vers�o, para isso, 
		 * agora � criado um formatador de dado com a classe DateTimeFormatter e a pr�pria classe LocalDate tem um m�todo 
		 * format que retorna uma String com a data formatada no padr�o passado como par�metro. 
		 * 
		 */
		
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		  
		System.out.println("Data com /: " + hoje.format(formatadorBarra));     
		System.out.println("Data com -: " + hoje.format(formatadorTraco));
		
	}

}
