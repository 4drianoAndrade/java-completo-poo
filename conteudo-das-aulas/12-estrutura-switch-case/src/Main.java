import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Problema exemplo.
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante).
		 * Escrever na tela o dia da semana correspondente, conforme exemplos.
		 */
		
		// Entrada		Saída
		//
		// 1			Dia da semana: domingo
		// 4			Dia da semana: quarta
		// 9			Dia da semana: valor inválido
		
		int x = sc.nextInt();
		
		String day;
		
		
		// Exemplo com if, else if, else
		/*
		if (x == 1)
			day = "domingo";
		else if (x == 2)
			day = "segunda";
		else if (x == 3)
			day = "terca";
		else if (x == 4)
			day = "quarta";
		else if (x == 5) 
			day = "quinta";
		else if (x == 6)
			day = "sexta";
		else if (x == 7)
			day = "sabado";
		else
			day = "valor invalido";
		*/
		
		// Estrutura utilizada quando se tem várias opções de fluxo
		// de acordo com o valor da variável no parâmetro.
		
		// Escolha a variável "x".
		switch (x) {
		
		case 1: // Caso a variável "x" tenha o valor 1, execute o comando.
			day = "domingo";
			break; // Faz a pausa se a condição for verdadeira.
		case 2:
			day = "segunda";
			break;
		case 3:
			day = "terca";
			break;
		case 4:
			day = "quarta";
			break;
		case 5:
			day = "quinta";
			break;
		case 6:
			day = "sexta";
			break;
		case 7:
			day = "sabado";
			break;
		default: // Valor padrão no caso das alternativas anteriores tenham falhado.
			day = "valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + day);
		
		sc.close();
	}
}
