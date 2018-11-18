package dates;

import java.time.Duration;
import java.time.Instant;

public class Exemplo2 {


	public static void main(String[] args) {


		/*
		 * Outra classe nova da API é a classe java.time.Instant, que serve para representar um instante qualquer. 
		 * 
		 * Nas versões anteriores do Java, o instante era simplesmente representado por um long, 
		 * que adicionava um milissegundo a cada instante desde 01/01/1970, que é o instante inicial que a plataforma Java considerava. 
		 * 
		 * A classe Instant tem diversos usos, como calcular a duração da execução de algum algoritmo, 
		 * ou a duração da execução de uma busca, entre diversos outros possíveis usos.
		 * 
		 * Esse exemplo mostra como fazer a comparação de instante na API antiga de datas do Java. 
		 * 
		 * O código funciona, mas não é muito elegante, além de só funcionar para eventos a partir de 01/01/1970. 
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
		System.out.println("Duração em segundos: " + ( duracaoEmMilesegundos / 1000 ) % 60 );



		System.out.println("================ Nova API ==================");
		
		
		/*
		 * O trecho abaixo mostra como fazer essa comparação na nova API com a nova classe Instant. 
		 * 
		 * Além de muito mais elegante, o código funciona para qualquer instante recuperado através de uma data.
		 */
		
		Instant iInicial = Instant.now();
		try {
		       Thread.sleep(1000);
		} catch (InterruptedException e) {
		       e.printStackTrace();
		}
		Instant iFinal = Instant.now();
		  
		Duration duracao = Duration.between(iInicial, iFinal);
		  
		System.out.println("Duração em nanos segundos: " + duracao.toNanos());
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		System.out.println("Duração em horas: " + duracao.toHours());
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		System.out.println("Duração em dias: " + duracao.toDays());		
		
		
		
	}

}
