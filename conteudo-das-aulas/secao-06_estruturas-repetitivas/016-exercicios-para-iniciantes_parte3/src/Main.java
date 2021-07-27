import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Exercicio 01 - PDF 9
		/*
		int password = sc.nextInt();

		while (password != 2002) {

			System.out.println("Senha Invalida");
			password = sc.nextInt();

			// O print poderia ser feito fora do laço do 'while'.
			if (password == 2002)
				System.out.println("Acesso Permitido");
		}
		*/
		
		
		// Exercicio 02 - PDF 9
		/*
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && x != 0) {
			
			if (x > 0 && y > 0)
				System.out.println("primeiro");
			else if (x < 0 && y > 0)
				System.out.println("segundo");
			else if (x < 0 && y < 0)
				System.out.println("terceiro");
			else
				System.out.println("quarto");
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		*/
		
		
		// Exercicio 03 - PDF 9
		
		int alcohol = 0, gasoline = 0, diesel = 0;
		
		int fuel = sc.nextInt();
		
		while (fuel != 4) {
			
			if (fuel == 1)
				alcohol++;
			else if (fuel == 2)
				gasoline++;
			else if (fuel == 3)
				diesel++;
			
			fuel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcohol);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
