package exercise2;

public class Building implements CarbonFootprint {
	private int amountOfElectricity;
	private double carbonFootPrint;

	public int getAmountOfElectricity() {
		return amountOfElectricity;
	}

	public void setAmountOfElectricity(int amountOfElectricity) {
		this.amountOfElectricity = amountOfElectricity;
	}
	//I don't know these things are correct i searched and searched and end up with this stuff from People.....eh
	public void getFootPrint(){
		carbonFootPrint = amountOfElectricity*0.680389;
	}
	
	public String toString() {
		return "Carbon Footprint : "+carbonFootPrint+
				"\nAmount Of Electricity: "+amountOfElectricity;
	}
}
