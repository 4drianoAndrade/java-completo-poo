package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		// true
		// String s1 = "Test";
		// String s2 = "Test";

		// false
		String s1 = new String("Test");
		String s2 = new String("Test");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // true
		System.out.println(c1 == c2); // false
		System.out.println(s1 == s2);
	}
}
