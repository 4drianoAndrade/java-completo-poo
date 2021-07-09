import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Estrutura repetitiva 'do-while' ou "faça-enquanto".
		 * 
		 * Menos utilizada, mas em alguns casos se encaixa melhor ao problema. O bloco
		 * de comandos executa pelo menos uma vez, pois a condição é verificada no
		 * final.
		 * 
		 * 
		 * Problema exemplo:
		 * 
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
		 * digite "s", repetir o programa.
		 * 
		 * Fórmula: F = (9*C / 5) + 32
		 * 
		 * Exemplo:
		 * 
		 * Digite a temperatura em Celsius: 30.0
		 * Equivalente em Fahrenheit: 86.0
		 * Deseja repetir (s/n)? s
		 * Digite a temperatura em Celsius: 21.0
		 * Equivalente em Fahrenheit: 69.8
		 * Deseja repetir (s/n)? s
		 * Digite a temperatura em Celsius: -10.5
		 * Equivalente em Fahrenheit: 13.1
		 * Deseja repetir (s/n)? n
		 * 
		 */
		
		
		// Exercicio resolvido com o uso da estrutura 'while'.
		
		/*
		//System.out.print("Digite a temperatura em Celsius: ");
		//double celsius = sc.nextDouble();
		//double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
		//System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
		//System.out.print("Deseja repetir (s/n)? ");
		//char response = sc.next().charAt(0);
		
		// A melhor forma é definir um valor para a variável 'response', para
		// não precisar duplicar o código.
		
		char response = 's';
		
		// Essa condição encerra o programa caso o usuário digite qualquer 
		// coisa além de "s".
		while (response != 'n' && response == 's') {
			
			System.out.print("Digite a temperatura em Celsius: ");
			// Agora é necessário declarar o tipo da variável.
			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			response = sc.next().charAt(0);
		} 
		*/
		
		// Exercicio resolvido com o uso da estrutura 'do-while'.
		
		char response;

		do {
			
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			
			System.out.print("Deseja repetir (s/n)? ");
			response = sc.next().charAt(0);
			
		} while (response != 'n');
		
		sc.close();
	}
}
