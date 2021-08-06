package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> courseA = new HashSet<>();
		courseA = students('A');
		Set<Integer> courseB = new HashSet<>();
		courseB = students('B');
		Set<Integer> courseC = new HashSet<>();
		courseC = students('C');

		Set<Integer> courses = new HashSet<>(courseA);
		courses.addAll(courseB);
		courses.addAll(courseC);

		System.out.println("Total students: " + courses.size());

		sc.close();
	}

	public static Set<Integer> students(char type) {

		Set<Integer> course = new HashSet<>();

		System.out.print("How many students for course " + type + "? ");
		int howMany = sc.nextInt();

		for (int i = 0; i < howMany; i++) {

			int usercode = sc.nextInt();
			course.add(usercode);
		}

		return course;
	}
}
