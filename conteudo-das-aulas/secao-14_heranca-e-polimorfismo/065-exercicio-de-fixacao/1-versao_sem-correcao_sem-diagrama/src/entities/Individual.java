package entities;

public class Individual extends Taxpayer {

	private Double healthExpenses;

	public Individual() {

		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenses) {

		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double taxCalculation() {

		Double tax;

		if (getAnnualIncome() < 20000.0)
			tax = getAnnualIncome() * 0.15 - healthExpenses * 0.5;
		else
			tax = getAnnualIncome() * 0.25 - healthExpenses * 0.5;

		return tax;
	}
}
