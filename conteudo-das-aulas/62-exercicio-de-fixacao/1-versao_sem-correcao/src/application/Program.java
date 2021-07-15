package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		char type;

		for (int i = 0; i < n; i++) {

			do {

				System.out.println("Product #" + (i + 1) + " data:");
				System.out.print("Common, used or imported (c/u/i)? ");
				type = sc.next().charAt(0);
			} while (type != 'c' & type != 'u' & type != 'i');

			System.out.print("Name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Price: ");
			double productPrice = sc.nextDouble();

			if (type == 'c')
				products.add(new Product(productName, productPrice));
			else if (type == 'u') {

				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());

				products.add(new UsedProduct(productName, productPrice, manufactureDate));
			} else if (type == 'i') {

				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();

				products.add(new ImportedProduct(productName, productPrice, fee));
			}
		}

		System.out.println("\nPRICE TAGS:");

		for (Product product : products)
			System.out.println(product.priceTag());

		sc.close();
	}
}
