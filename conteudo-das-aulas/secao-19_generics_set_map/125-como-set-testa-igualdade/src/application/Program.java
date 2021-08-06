package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		Product prod = new Product("Notebook", 1200.0);

		// SE hashCode E equals NÃO ESTIVEREM IMPLEMENTADOS:
		// COMPARA AS REFERÊNCIAS (PONTEIROS) DOS OBJETOS.
		System.out.println(set.contains(prod));
		// SE hashCode E equals ESTIVEREM IMPLEMENTADOS:
		// PRIMEIRO hashCode. SE DER IGUAL, USA equals PARA CONFIRMAR.
	}
}
