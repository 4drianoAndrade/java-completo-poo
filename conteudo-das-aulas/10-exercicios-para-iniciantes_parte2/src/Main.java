import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Exercicio 01 - PDF 7
		/*
		int number = sc.nextInt();
		
		if (number >= 0)
			System.out.println("NAO NEGATIVO");
		else
			System.out.println("NEGATIVO");
		*/
		
		
		// Exercicio 02 - PDF 7
		/*
		int number = sc.nextInt();
		
		// Retorna o resto da divisão por 2, e verifica se foi feita a divisão completa.
		if (number % 2 == 0) // Se o resto for igual a 0 então é par, se não é impar.
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		*/
		
		
		// Exercicio 03 - PDF 7
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// Verifica se pelo menos uma das condições é verdadeira, em ordem crescente
		// ou decrescente. Se a divisão for completa então o número é múltiplo.
		if (a % b == 0 || b % a == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");
		*/
		
		
		// Exercicio 04 - PDF 7
		/*
		int startTime = sc.nextInt();
		int endTime = sc.nextInt();
		int duration;
		
		if (startTime < endTime)
			duration = endTime - startTime;
		else
			duration = 24 - startTime +  endTime;
			
		System.out.println("O JOGO DUROU " + duration + " HORA(S)");
		*/
		
		
		// Exercicio 05 - PDF 7
		/*
		int code = sc.nextInt();
		int amount = sc.nextInt();
		double valueToPay;
		
		if (code == 1)
			valueToPay = amount * 4.0;
		else if (code == 2)
			valueToPay = amount * 4.5;
		else if (code == 3)
			valueToPay = amount * 5.0;
		else if (code == 4)
			valueToPay = amount * 2.0;
		else if (code == 5)
			valueToPay = amount * 1.5;
		else
			valueToPay = 0.0;
		
		System.out.printf("Total: R$ %.2f%n", valueToPay);
		*/
		
		
		// Exercicio 06 - PDF 7
		/*
		double value = sc.nextDouble();
		
		// 'número]' Representa o valor menor ou igual a ele, 
		// e '(número' representa o valor maior que ele.
		if (value < 0.0 || value > 100.0)
			System.out.println("Fora de intervalo");
		else if (value <= 25.0)
			System.out.println("Intervalo [0,25]");
		else if (value <= 50.0)
			System.out.println("Intervalo (25,50]");
		else if (value <= 75.0)
			System.out.println("Intervalo (50,75]");
		else
			System.out.println("Intervalo (75,100]");
		*/
		
		
		// Exercicio 07 - PDF 7
		/*
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x > 0.0 && y > 0.0)
			System.out.println("Q1");
		else if (x < 0.0 && y > 0.0)
			System.out.println("Q2");
		else if (x < 0.0 && y < 0.0)
			System.out.println("Q3");
		else if (x > 0.0 && y < 0.0)
			System.out.println("Q4");
		else if (x == 0.0 && y == 0.0)
			System.out.println("Origem");
		else if (x == 0.0)
			System.out.println("Eixo Y");
		else
			System.out.println("Eixo X");
		*/
		
		
		// Exercicio 08 - PDF 7
		
		double salary = sc.nextDouble();
		double tax;
		
		if (salary <= 2000.0)
			tax = 0.0;
		else if (salary <= 3000.0)
			tax = (salary - 2000.0) * 0.8;
		else if (salary <= 4500.0)
			tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08; 
		else
			tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		
		if (tax == 0.0)
			System.out.println("Isento");
		else
			System.out.printf("R$ %.2f%n", tax);
		
		sc.close();
	}
}
