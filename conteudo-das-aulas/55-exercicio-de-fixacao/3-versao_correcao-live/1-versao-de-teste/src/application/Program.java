package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Product p1 = new Product("TV", 1000.0);
		OrderItem oi1 = new OrderItem(1, 1000.0, p1);
		Product p2 = new Product("Mouse", 40.0);
		OrderItem oi2 = new OrderItem(2, 40.0, p2);
		Client c1 = new Client("Alex Green", "alex@gmail.com", sdf.parse("15/03/1985"));

		Order order = new Order(new Date(), OrderStatus.valueOf("PROCESSING"), c1);
		order.addItem(oi1);
		order.addItem(oi2);

		System.out.println(order);

		sc.close();
	}
}
