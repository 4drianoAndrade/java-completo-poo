package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		// H:\GitHub\java-completo-poo\conteudo-das-aulas\secao-20_programacao-funcional-e-expressoes-lambda\temp\in.txt

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
