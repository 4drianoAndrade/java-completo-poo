import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Exercicio 01 - PDF 10
		/*
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i+=2) {
			
			System.out.println(i);
		}
		
		// Ou
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
		
			if (i % 2 != 0)
				System.out.println(i);
		}
		*/
		
		
		// Exercicio 02 - PDF 10
		/*
		int n = sc.nextInt();
		
		int in = 0, out = 0;
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20)
				in++;
			else
				out++;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		*/
		
		
		// Exercicio 03 - PDF 10
		/*
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double average = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", average);
		}
		*/
		
		
		// Exercicio 04 - PDF 10
		/*
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0)
				System.out.println("divisao impossivel");
			else
				System.out.println((double)a / b);
		}
		
		// Ou
		
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0)
				System.out.println("divisao impossivel");
			else {
				
				double division = (double) a / b;
				
				System.out.printf("%.1f%n", division);
			}
		}
		*/
		
		
		// Exercicio 05 - PDF 10
		/*
		int factorial = 1;
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			factorial *= i;
		}
		
		System.out.println(factorial);
		*/
		
		
		// Exercicio 06 - PDF 10
		/*
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0)
				System.out.println(i);
		}
		*/
		
		
		// Exercicio 07 - PDF 10
		/*
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print((int) i + " ");
			System.out.print((int) Math.pow(i, 2) + " ");
			System.out.println((int) Math.pow(i, 3));
		}
		*/
		
		// Ou
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {

			int a = i;
			int b = (int) Math.pow(i, 2); // Usando o casting.
			int c = i * i * i; // Multiplicando manualmente.
			
			System.out.printf("%d %d %d%n", a, b, c);
		}
		
		sc.close();
	}
}
