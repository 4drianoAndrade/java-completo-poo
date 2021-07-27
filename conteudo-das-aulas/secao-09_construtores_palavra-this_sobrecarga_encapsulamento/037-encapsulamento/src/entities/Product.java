package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {

		this.name = name;
		this.price = price;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	public double getQuantity() {

		return quantity;
	}

	public double totalValueInStock() {

		return price * quantity;
	}

	public void addProducts(int quantity) {

		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity;
	}

	public String toString() {

		return String.format("%s, $ %.2f, %d units, Total: $ %.2f", name, price, quantity, totalValueInStock());
	}
}
