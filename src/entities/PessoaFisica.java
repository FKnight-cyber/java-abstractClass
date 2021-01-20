package entities;

public class PessoaFisica extends Pessoa{
	
	private Double healthCare;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String name, Double yearlyIncome, Double healthCare) {
		super(name, yearlyIncome);
		this.healthCare = healthCare;
	}

	public Double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(Double healthCare) {
		this.healthCare = healthCare;
	}

	@Override
	public double tax() {
		double tax = 0;
		if(yearlyIncome < 20000.00) {
			tax = 0.15;
		}
		else if(yearlyIncome >= 20000.00) {
			tax = 0.25;
		}
		return yearlyIncome * tax - healthCare*0.5;
	}
	
}
