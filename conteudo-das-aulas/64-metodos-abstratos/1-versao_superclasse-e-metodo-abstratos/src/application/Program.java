package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			char ch;

			do {

				System.out.println("Shape #" + (i + 1) + " data:");
				System.out.print("Rectangle or Circle (r/c)? ");
				ch = sc.next().charAt(0);

			} while (ch != 'r' && ch != 'c');

			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next().toUpperCase());

			if (ch == 'r') {

				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));

			} else {

				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		System.out.println("\nSHAPE AREAS:");

		for (Shape shape : list)
			System.out.printf("%.2f%n", shape.area());

		sc.close();
	}
}
