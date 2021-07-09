import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*
		 * Estrutura repetitiva 'while' ou "enquanto".
		 * 
		 * É uma estrutura de controle que repete um bloco de comandos enquanto uma
		 * condição for verdadeira. Usar quando não se sabe previamente a quantidade de
		 * repetições que será realizada.
		 * 
		 * 
		 * Problema exemplo:
		 * 
		 * Fazer um programa que lê números inteiros até que um zero seja lido. Ao final
		 * mostra a soma dos números lidos.
		 * 
		 * Entrada		Saída
		 * 
		 * 5			11
		 * 2
		 * 4
		 * 0
		 */
		
		// É necessário atribuir um valor inicial para entrar no laço do 'while'.
		int x = sc.nextInt();
		
		// Variável de soma.
		int sum = x; // Também é necessário atribuir um valor para não dar erro.
		
		// '!=' sinal de diferente. Enquanto o "x" for diferente de zero o programa
		// vai repetir o bloco 'while'.
		while (x != 0) {
			
			x = sc.nextInt();
			
			// Como a variável "sum" recebeu o valor de "x" antes do bloco 'while', ela
			// não precisa ser informada primeiro no bloco. Caso fosse atribuido o
			// valor "0", nesse caso sim, já que a soma retornaria um valor diferente
			// de todas as entradas feitas na variável "x".
			sum += x;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
