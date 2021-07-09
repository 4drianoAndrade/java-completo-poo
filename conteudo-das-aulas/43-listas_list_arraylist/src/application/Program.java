package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// adiciona um elemento
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// adiciona um elemento em tal posi��o
		list.add(2, "Marco");

		// informa o tamanho da lista
		System.out.println(list.size());

		// remove um elemento da primeira ocorr�ncia comparando os valores
		// list.remove("Anna");

		for (String x : list) {

			System.out.println(x);
		}

		System.out.println("------");

		// remove um elemento pela posi��o
		// list.remove(1);

		// remove um ou mais elementos pelo predicado
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {

			System.out.println(x);
		}

		System.out.println("-------------------");

		// retorna a posi��o do elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // quando n�o encontra

		System.out.println("-------------------");

		// cria uma nova lista com valores que come�am pelo valor 'A'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {

			System.out.println(x);
		}

		System.out.println("-----");

		// realiza uma busca na lista, e retorna o valor da primeira ocorr�ncia
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

		// quando n�o encontra
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
	}
}
