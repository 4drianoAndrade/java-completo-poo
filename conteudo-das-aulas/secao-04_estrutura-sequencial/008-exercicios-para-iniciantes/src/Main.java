import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159; // Ou 'Math.PI'
		
		// Exercicio
		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do
		 * terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
		 * da área do terreno, bem como o valor do preço do terreno, ambos com duas
		 * casas decimais, conforme exemplo.
		 */

		// Entrada:
		// 10.0
		// 30.0
		// 200.00

		// Saída:
		// AREA = 300.00
		// PRECO = 60000.00

		/*
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;

		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		*/
		
		
		// Exercicio 01 - PDF 5
		/*
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int sum = number1 + number2;
		
		System.out.println("SOMA = " + sum);
		*/
		
		
		// Exercicio 02 - PDF 5
		/*
		double radius = sc.nextDouble();
		double area = pi * Math.pow(radius, 2.0);
		
		System.out.printf("A=%.4f%n", area);
		*/
		
		
		// Exercicio 03 - PDF 5
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int difference = a * b - c * d;
		
		System.out.println("DIFERENCA = " + difference);
		*/
		
		
		// Exercicio 04 - PDF 5
		/*
		int employeeNumber = sc.nextInt();
		int workedHours = sc.nextInt();
		double hourlyValue = sc.nextDouble();
		double employeeSalary = workedHours * hourlyValue;
		
		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f%n", employeeSalary);
		*/
		
		
		// Exercicio 05 - PDF 5
		/*
		double partCode1 = sc.nextDouble();
		double partNumber1 = sc.nextDouble();
		double unitValue1 = sc.nextDouble();
		double partCode2 = sc.nextDouble();
		double partNumber2 = sc.nextDouble();
		double unitValue2 = sc.nextDouble();
		
		double valueToPay = partNumber1 * unitValue1 + partNumber2 * unitValue2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valueToPay);
		*/
		
		
		// Exercicio 06 - PDF 5
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double triangle = a * c / 2.0;
		double circle = Math.pow(c, 2.0) * pi;
		double trapeze = (a + b) * c / 2.0;
		double square = Math.pow(b, 2.0);
		double rectangle = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangle);
		System.out.printf("CIRCULO: %.3f%n", circle);
		System.out.printf("TRAPEZIO: %.3f%n", trapeze);
		System.out.printf("QUADRADO: %.3f%n", square);
		System.out.printf("RETANGULO: %.3f%n", rectangle);
		
		sc.close();
	}
}
