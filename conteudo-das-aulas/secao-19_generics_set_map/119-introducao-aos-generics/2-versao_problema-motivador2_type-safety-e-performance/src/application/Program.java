package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		ps.addValue("Maria");

		for (int i = 0; i < n; i++) {

			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = (Integer) ps.first(); // O PRIMEIRO ELEMENTO DA LISTA É UMA String
		// O CASTING PARA Integer OCASIONA UMA EXCEÇÃO DO TIPO ClassCastException
		System.out.println("First: " + x);

		sc.close();
	}
}
