package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		// H:\GitHub\java-completo-poo\conteudo-das-aulas\secao-17_trabalhando-com-arquivos
		System.out.println("Enter file path: ");
		String strPath = sc.nextLine();
		System.out.println();

		boolean success = new File(strPath + "\\out1").mkdir();
		String path = "\\out1\\summary.csv";
		File file = new File(strPath + path);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			for (int i = 0; i < 4; i++) {

				String[] field = sc.nextLine().split(",");
				String name = field[0];
				double price = Double.parseDouble(field[1]);
				int quantity = Integer.parseInt(field[2]);

				list.add(new Product(name, price, quantity));
			}

			for (Product item : list)
				bw.write(item.getName() + "," + String.format("%.2f%n", item.totalValue()));

			if (success == true && file.getName().equals("summary.csv"))
				System.out.println("\nCREATED!");

		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}

		sc.close();
	}
}
