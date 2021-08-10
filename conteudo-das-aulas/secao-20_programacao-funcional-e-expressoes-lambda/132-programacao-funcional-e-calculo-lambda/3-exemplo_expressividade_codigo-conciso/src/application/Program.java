package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));

		Integer sum1 = 0;

		for (Integer x : list)
			sum1 += x;

		System.out.println(sum1); // 15

		// VS.

		Integer sum2 = list.stream().reduce(0, Integer::sum);
		System.out.println(sum2); // 15
	}
}
