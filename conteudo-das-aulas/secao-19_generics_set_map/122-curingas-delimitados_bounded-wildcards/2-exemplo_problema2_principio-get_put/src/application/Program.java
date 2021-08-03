package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs); // 1 2 3 4 

		copy(myDoubles, myObjs);
		printList(myObjs); // 1 2 3 4 3.14 6.28 
	}

	public static void copy(List<? extends Number> source, List<? super Number> destination) {

		for (Number number : source) // get
			destination.add(number); // put

		// get DEU CERTO? = COVARIÂNCIA
		// put DEU CERTO? = CONTRAVARIÂNCIA
	}

	public static void printList(List<?> list) {

		for (Object obj : list)
			System.out.print(obj + " ");

		System.out.println();
	}
}
