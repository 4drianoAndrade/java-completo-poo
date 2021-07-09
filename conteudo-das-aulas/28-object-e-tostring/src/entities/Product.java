package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {

		return price * quantity;
	}

	// O comando 'this' referencia o atributo e não o parâmetro.
	public void addProducts(int quantity) {

		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity;
	}
	
	public String toString() {
		
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
			
		// Ou
		
		//return String.format("%s, $ %.2f, %d units, Total: $ %.2f", name, price, quantity, totalValueInStock());
	}
}
