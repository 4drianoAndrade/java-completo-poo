package application;

import java.util.LinkedHashSet;
// import java.util.HashSet;
import java.util.Set;
// import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		// Set<String> set = new HashSet<>(); // NÃO GARANTE A ORDEM - RÁPIDO
		// Set<String> set = new TreeSet<>(); // ORDEM ALFABÉTICA - LENTO
		Set<String> set = new LinkedHashSet<>(); // MANTÉM A ORDEM DE INSERÇÃO - MÉDIO

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		// set.remove("Tablet");
		// set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');

		for (String p : set)
			System.out.println(p);
	}
}
