package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {

		super();
	}

	public Company(String name, Double annualIncome, Integer numberOfEmployees) {

		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {

		Double taxAmount;

		if (numberOfEmployees > 10)
			taxAmount = getAnnualIncome() * 0.14;
		else
			taxAmount = getAnnualIncome() * 0.16;

		return taxAmount;
	}
}
