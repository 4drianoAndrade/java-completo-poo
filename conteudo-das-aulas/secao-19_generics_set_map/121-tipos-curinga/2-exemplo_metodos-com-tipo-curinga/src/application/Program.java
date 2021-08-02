package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// COM TIPOS CURINGA PODEMOS FAZER MÉTODOS QUE RECEBEM UM GENÉRICO DE "QUALQUER TIPO":

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) { // (List<Object> list) OCASIONA ERRO

		for (Object obj : list)
			System.out.println(obj);
	}
}
