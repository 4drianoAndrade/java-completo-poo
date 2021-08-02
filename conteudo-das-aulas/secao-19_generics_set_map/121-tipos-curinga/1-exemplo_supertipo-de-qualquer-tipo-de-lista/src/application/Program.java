package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// GENERICS S�O INVARIANTES

		// List<Object> N�O � O SUPERTIPO DE QUALQUER TIPO DE LISTA:
		/*
		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; // ERRO DE COMPILA��O
		*/


		// O SUPERTIPO DE QUALQUER TIPO DE LISTA � List<?>. ESTE � UM TIPO CURINGA:

		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;

		// DIFERENTE DE:

		Object obj;
		Integer x = 10;
		obj = x;
	}
}
