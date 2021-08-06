package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Student> courseA = studentsCourses(0);
		Set<Student> courseB = studentsCourses(1);
		Set<Student> courseC = studentsCourses(2);

		Set<Student> courses = new HashSet<>(courseA);
		courses.addAll(courseB);
		courses.addAll(courseC);

		System.out.println("Total students: " + courses.size());
		sc.close();
	}

	public static Set<Student> studentsCourses(int l) {

		Set<Student> course = new HashSet<>();
		String s = "ABC";
		System.out.print("How many students for course " + s.charAt(l) + "? ");
		int howMany = sc.nextInt();

		for (int i = 0; i < howMany; i++) {

			int usercode = sc.nextInt();
			course.add(new Student(usercode));
		}

		return course;
	}
}
