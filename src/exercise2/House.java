package exercise2;

public class House extends FootPrint {
	private int numberOfPeople;
	private int amountOfElectricity;
	
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

	@Override
	public void getFootPrint(){
		carbonFootPrint = (amountOfElectricity/numberOfPeople)*365*(1.486)/2204.6;
	}
	@Override
	public String toString() {
		return super.toString()+
				"\nNumber Of Residence: "+numberOfPeople+
				"\nAmount Of Electricity: "+amountOfElectricity;
	}
}
