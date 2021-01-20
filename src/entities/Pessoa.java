package entities;

public abstract class Pessoa {
	protected String name;
	protected Double yearlyIncome;
	
	public Pessoa() {
	}

	public Pessoa(String name, Double yearlyIncome) {
		this.name = name;
		this.yearlyIncome = yearlyIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(Double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	
	public abstract double tax();
}
