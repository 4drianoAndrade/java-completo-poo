package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// POR�M N�O � POSS�VEL ADICIONAR DADOS A UMA COLE��O DE TIPO CURINGA

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {

		// O COMPILADOR N�O SABE QUAL � O TIPO ESPEC�FICO DO QUAL A LISTA FOI INSTANCIADA.

		// list.add(3); // ERRO DE COMPILA��O

		for (Object obj : list)
			System.out.println(obj);
	}
}
