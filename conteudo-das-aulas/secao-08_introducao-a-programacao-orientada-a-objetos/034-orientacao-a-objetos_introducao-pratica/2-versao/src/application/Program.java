package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// DECLARANDO AS VARIÁVEIS DO TIPO Funcionário
		Employee f1, f2;

		// INSTANCIANDO (CRIANDO) OS OBJETOS
		f1 = new Employee();
		f2 = new Employee();

		System.out.println("Dados do primeiro funcionário:");
		f1.nome = sc.next();
		f1.valorPorHora = sc.nextDouble();
		f1.horas = sc.nextInt();

		System.out.println("Dados do segundo funcionário:");
		f2.nome = sc.next();
		f2.valorPorHora = sc.nextDouble();
		f2.horas = sc.nextInt();

		double total = f1.total() + f2.total();

		System.out.printf("Total = %.2f%n", total);

		sc.close();
	}
}
