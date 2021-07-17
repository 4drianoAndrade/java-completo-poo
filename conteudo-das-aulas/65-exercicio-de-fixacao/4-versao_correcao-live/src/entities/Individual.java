package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {

	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {

		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {

		// Double basicTax = (getAnnualIncome() < 20000.0) ? getAnnualIncome() * 0.15 :
		// getAnnualIncome() * 0.25;

		Double basicTax;

		if (getAnnualIncome() < 20000.0)
			basicTax = getAnnualIncome() * 0.15;
		else
			basicTax = getAnnualIncome() * 0.25;

		basicTax -= healthExpenditures * 0.5; // IMPOSTO - GASTOS COM SAÚDE

		// CASO O VALOR DOS GASTOS COM SAÚDE SEJA
		// MAIOR QUE O VALOR A SER PAGO DE IMPOSTO
		if (basicTax < 0.0) // EVITA QUE O VALOR DO IMPOSTO FIQUE NEGATIVO
			basicTax = 0.0;

		return basicTax;
	}
}
