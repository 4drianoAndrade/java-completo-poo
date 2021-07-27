package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("\nEmployee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

		// Integer pos = position(list, idSalary);

		if (emp == null)
			System.out.println("This id does not exist!");
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}

		System.out.println("\nList of employees:");

		for (Employee e : list)
			System.out.println(e);

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getId() == id)
				return i;
		}

		return null;
	}
}
