package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// PORÉM NÃO É POSSÍVEL ADICIONAR DADOS A UMA COLEÇÃO DE TIPO CURINGA

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {

		// O COMPILADOR NÃO SABE QUAL É O TIPO ESPECÍFICO DO QUAL A LISTA FOI INSTANCIADA.

		// list.add(3); // ERRO DE COMPILAÇÃO

		for (Object obj : list)
			System.out.println(obj);
	}
}
