package entities;

public class Company extends Taxpayer {

	private Integer employees;

	public Company() {

		super();
	}

	public Company(String name, Double annualIncome, Integer employees) {

		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double taxCalculation() {

		Double tax;

		if (employees > 10)
			tax = getAnnualIncome() * 0.14;
		else
			tax = getAnnualIncome() * 0.16;

		return tax;
	}
}
