package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer numberOfWorkers;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String name, Double yearlyIncome, Integer numberOfWorkers) {
		super(name, yearlyIncome);
		this.numberOfWorkers = numberOfWorkers;
	}

	public Integer getNumberOfWorkers() {
		return numberOfWorkers;
	}

	public void setNumberOfWorkers(Integer numberOfWorkers) {
		this.numberOfWorkers = numberOfWorkers;
	}

	@Override
	public double tax() {
		double tax = 0.16;
		if(numberOfWorkers > 10) {
			tax = 0.14;
		}
		return yearlyIncome * tax;
	}
	
	
}
