package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of taxpayers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Taxpayer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			Double annualIncome = sc.nextDouble();

			if (type == 'i') {

				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			} else {

				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}

		System.out.println("\nTAXES PAID:");

		// SOLID

		for (TaxPayer tp : list)
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));

		double sum = 0.0;

		for (TaxPayer tp : list)
			sum += tp.tax();

		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}
}
