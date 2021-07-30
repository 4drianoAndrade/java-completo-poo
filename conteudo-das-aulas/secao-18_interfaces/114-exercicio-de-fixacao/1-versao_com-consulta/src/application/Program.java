package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PaypalService;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double value = sc.nextDouble();

		Contract contract = new Contract(number, date, value);

		System.out.print("Enter number of installments: ");
		Integer installments = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, installments);

		System.out.println("Installments:");

		for (Installment list : contract.getInstallments())
			System.out.println(list);

		sc.close();
	}
}
