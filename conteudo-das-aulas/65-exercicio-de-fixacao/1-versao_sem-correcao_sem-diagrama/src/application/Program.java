package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Taxpayer> list = new ArrayList<>();

		System.out.print("Enter the number of taxpayers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			char ch;

			do {

				System.out.println("Taxpayer #" + (i + 1) + " data:");
				System.out.print("Individual or company (i/c)? ");
				ch = sc.next().charAt(0);

			} while (ch != 'i' && ch != 'c');

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();

			if (ch == 'i') {

				System.out.print("Health expenditures: ");
				double expenses = sc.nextDouble();
				list.add(new Individual(name, annualIncome, expenses));
			} else {

				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, annualIncome, employees));
			}
		}

		double sum = 0.0;
		System.out.println("\nTAXES PAID:");

		for (Taxpayer taxpayer : list) {

			System.out.println(taxpayer);
			sum += taxpayer.taxCalculation();
		}

		System.out.printf("%nTOTAL TAXES: $ %.2f%n", sum);

		sc.close();
	}
}
