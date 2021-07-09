package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();

		double[][] mat = new double[n][n];
		double sum = 0.0;

		System.out.println("Digite os valores da matriz:");

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j] = sc.nextDouble();

				//if (i == j)
					//sum += mat[i][j];
			}
			
			sum += mat[i][i];
		}
		
		/*
		for (int i = 0; i < mat.length; i++)
			sum += mat[i][i];
		*/

		System.out.printf("%nSoma da diagonal principal = %.1f%n", sum);

		sc.close();
	}
}
