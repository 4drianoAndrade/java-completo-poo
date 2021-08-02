package services;

import java.util.List;

public class CalculationService {

	// public static <T extends Comparable<? super T>> T max(List<T> list) {
	public static <T extends Comparable<T>> T max(List<T> list) {

		if (list.isEmpty())
			throw new IllegalStateException("List can't be empty");

		T max = list.get(0);

		// (Computer,890.50.compareTo(Computer,890.50) == 0
		// (IPhone X,910.00.compareTo(Computer,890.50) == 1
		// (Tablet,550.00.compareTo(IPhone X,910.00) == -1

		// if (Computer,890.50.compareTo(Computer,890.50) > 0) // == false

		// if (IPhone X,910.00.compareTo(Computer,890.50) > 0) // == true
		// 		// max = Computer,890.50;
		// 		// item = IPhone X,910.00;
		// 		max = item; // Computer,890.50 = IPhone X,910.00;

		// if (Tablet,550.00.compareTo(IPhone X,910.00) > 0) // == false

		for (T item : list)
			if (item.compareTo(max) > 0)
				max = item;

		return max;
	}
}
