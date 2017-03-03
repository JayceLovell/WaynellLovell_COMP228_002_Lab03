package exercise2;

public class House extends FootPrint {
	private int numberOfPeople;
	private int amountOfElectricity;
	private int amountOfNaturalGas;
	private int amountOfHeatingOil;
	
	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public int getAmountOfElectricity() {
		return amountOfElectricity;
	}

	public void setAmountOfElectricity(int amountOfElectricity) {
		this.amountOfElectricity = amountOfElectricity;
	}

	public int getAmountOfNaturalGas() {
		return amountOfNaturalGas;
	}

	public void setAmountOfNaturalGas(int amountOfNaturalGas) {
		this.amountOfNaturalGas = amountOfNaturalGas;
	}

	public int getAmountOfHeatingOil() {
		return amountOfHeatingOil;
	}

	public void setAmountOfHeatingOil(int amountOfHeatingOil) {
		this.amountOfHeatingOil = amountOfHeatingOil;
	}

	@Override
	public void getFootPrint(){
		
	}
}
