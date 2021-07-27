import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//int x = 5;
		
		//System.out.println("Bom dia");

		// Estrutura condicional simples, que verifica se a condição entre parênteses
		// é verdadeira, se for ele executa o bloco, se não for, ele não faz nada.
		/*
		if (x > 0) { // No caso de apenas um comando, é opcional o uso de chaves.
			System.out.println("Boa tarde"); // Comando indentado entre as chaves.
		} 
		
		if (x < 0) {
			System.out.println("Boa tarde");
		}
		*/

		//System.out.println("Boa noite");
		
		
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		// Estrutura condicional composta, ou estrutura de controle.
		// Verdadeiro executa o bloco 'if'/SE. Falso executa o bloco 'else'/SENAO.
		/*
		if (hora < 12)
			System.out.println("Bom dia");
		else
			System.out.println("Boa tarde");
		*/
		
		
		// Encadeamento de estruturas condicionais, no caso de mais de duas possibilidades.
		/*
		if (hora < 12)
			System.out.println("Bom dia");
		else { // Necessário o uso de chaves, pois possui mais de um comando.
			if (hora < 18)
				System.out.println("Boa tarde");
			else
				System.out.println("Boa noite");
		}
		*/
		
		// Macete para encurtar a escada de indentação.
		if (hora < 12)
			System.out.println("Bom dia");
		else if (hora < 18)
			System.out.println("Boa tarde");
		else
			System.out.println("Boa noite");
		
		sc.close();
	}
}
