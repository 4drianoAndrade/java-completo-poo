import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Problem exemplo.
		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, daí mostrar o valor a ser pago.
		 */
		
		// Entrada		Saída
		//
		// 22			Valor a pagar: R$ 50.00
		// 103			Valor a pagar: R$ 56.00
		
		int minutes = sc.nextInt();
		
		double account = 50.0;
		
		/*
		if (minutes > 100)
			account = account + (minutes - 100) * 2.0;
		
		System.out.printf("Valor a pagar: %.2f%n", account);
		*/
		
		// Operadores de atribuição cumulativa.
		//  a += b;		a -= b;		a *= b;		a /= b;		a %= b;
		// a = a + b;  a = a - b;  a = a * b;  a = a / b;  a = a % b;
		
		if (minutes > 100)
			account += (minutes - 100) * 2.0;
		
		System.out.printf("Valor a pagar: %.2f%n", account);
		
		sc.close();
	}
}
