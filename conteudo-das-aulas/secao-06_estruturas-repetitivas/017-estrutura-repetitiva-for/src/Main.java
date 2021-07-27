import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Estrutura repetitiva 'for' ou "para".
		 * 
		 * É uma estrutura de controle que repete um bloco de comandos para um certo
		 * intervalo de valores. Usar quando se sabe previamente a quantidade de
		 * repetições, ou o intervalo de valores. 
		 * 
		 * E ideal para fazer contagens (progressiva ou regressiva).
		 * 
		 * Por exemplo:
		 * 
		 * Fazer um programa que lê um valor inteiro N e depois N número inteiros. Ao
		 * final, mostra a soma dos N números lidos.
		 * 
		 * Entrada		Saída
		 * 
		 * 3			11
		 * 5
		 * 2
		 * 4
		 * 
		 */
		
		/*
		int sum = 0;
		int n = sc.nextInt();
		
		// 'int i = 0;' executa somente uma vez no início, 'i < n;' é a condição
		// que determina a repetição do bloco, e 'i++' executa toda vez que termina
		// o último comando do laço.
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println(sum);
		*/
		
		/*
		// A estrutura 'for' é ideal para se fazer uma repetição baseada em uma contagem.
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Valor de i: " + i);
		}
		*/
		
		// Contagem regressiva
		for (int i = 4; i >= 0; i--) {
			
			System.out.println("Valor de i: " + i);
		}
		
		// É possível fazer também com a estrutura 'while', caso a condição a ser 
		// verificada tenha como parâmetro um contador.
		
		sc.close();
	}
}
