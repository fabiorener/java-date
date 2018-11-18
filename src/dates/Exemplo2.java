package dates;

import java.time.Duration;
import java.time.Instant;

public class Exemplo2 {


	public static void main(String[] args) {


		/*
		 * Outra classe nova da API � a classe java.time.Instant, que serve para representar um instante qualquer. 
		 * 
		 * Nas vers�es anteriores do Java, o instante era simplesmente representado por um long, 
		 * que adicionava um milissegundo a cada instante desde 01/01/1970, que � o instante inicial que a plataforma Java considerava. 
		 * 
		 * A classe Instant tem diversos usos, como calcular a dura��o da execu��o de algum algoritmo, 
		 * ou a dura��o da execu��o de uma busca, entre diversos outros poss�veis usos.
		 * 
		 * Esse exemplo mostra como fazer a compara��o de instante na API antiga de datas do Java. 
		 * 
		 * O c�digo funciona, mas n�o � muito elegante, al�m de s� funcionar para eventos a partir de 01/01/1970. 
		 * 
		 * O Thread.sleep(1000) foi adicionado apenas para que os dois instantes sejam diferentes.
		 */


		long instateInicial = System.currentTimeMillis();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long instanteFinal = System.currentTimeMillis();
		long duracaoEmMilesegundos = instanteFinal - instateInicial;
		System.out.println("Dura��o em segundos: " + ( duracaoEmMilesegundos / 1000 ) % 60 );



		System.out.println("================ Nova API ==================");
		
		
		/*
		 * O trecho abaixo mostra como fazer essa compara��o na nova API com a nova classe Instant. 
		 * 
		 * Al�m de muito mais elegante, o c�digo funciona para qualquer instante recuperado atrav�s de uma data.
		 */
		
		Instant iInicial = Instant.now();
		try {
		       Thread.sleep(1000);
		} catch (InterruptedException e) {
		       e.printStackTrace();
		}
		Instant iFinal = Instant.now();
		  
		Duration duracao = Duration.between(iInicial, iFinal);
		  
		System.out.println("Dura��o em nanos segundos: " + duracao.toNanos());
		System.out.println("Dura��o em minutos: " + duracao.toMinutes());
		System.out.println("Dura��o em horas: " + duracao.toHours());
		System.out.println("Dura��o em milisegundos: " + duracao.toMillis());
		System.out.println("Dura��o em dias: " + duracao.toDays());		
		
		
		
	}

}
