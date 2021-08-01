package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		// PrintService<String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			Integer value = sc.nextInt();
			// String value = sc.next();
			ps.addValue(value);
		}

		try {
			Integer x = ps.first();
			// String x = ps.first();
			ps.print();
			System.out.println("First: " + x);

		} catch (IllegalStateException e) {
			System.out.println(e.getMessage()); // n <= 0
		}

		sc.close();
	}
}
